package com.codegym.controller;

import com.codegym.entity.DichVu;
import com.codegym.entity.KhachHang;
import com.codegym.entity.KieuThue;
import com.codegym.entity.LoaiDichVu;
import com.codegym.service.DichVuService;
import com.codegym.service.KieuThueService;
import com.codegym.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class DichVuController {

    @Autowired
    private DichVuService dichVuService;

    @Autowired
    private KieuThueService kieuThueService;

    @Autowired
    private LoaiDichVuService loaiDichVuService;

    @ModelAttribute("danhachkieuthue")
    public List<KieuThue> kieuThueList() {
        return kieuThueService.findAll();
    }

    @ModelAttribute("danhsachloaidichvu")
    public List<LoaiDichVu> loaiDichVuList() {
        return loaiDichVuService.findAll();
    }

    @GetMapping("/dichvu")
    public String hienThiDanhSachDichVu(@PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<DichVu> dichVus;
        Sort sort = Sort.by("idDichVu").descending();
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        dichVus = dichVuService.findAll(pageable);
        model.addAttribute("dichvu", dichVus);
        return "dichVu/danhSachDichVu";
    }

    @GetMapping("/thongtindichvu")
    public String hienThiDichVu(@RequestParam String id, Model model) {
        model.addAttribute("dichvu", dichVuService.findById(id));
        return "dichVu/chiTietDichVu";
    }

    @GetMapping("/themdichvu")
    public String themDichVu(Model model) {
        model.addAttribute("dichvu", new DichVu());
        return "dichVu/themDichVu";
    }

    @PostMapping("/themdichvu")
    public String luuDichVu(@Valid @ModelAttribute DichVu dichVu, BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "dichVu/themDichVu";
        }
        dichVuService.save(dichVu);
        redirectAttributes.addFlashAttribute("message", "Them Moi Dich Vu Thanh Cong!");
        return "redirect:/dichvu";
    }

    @GetMapping("/suadichvu")
    public String suaDichVu(@RequestParam String id, Model model) {
        model.addAttribute("dichvu", dichVuService.findById(id));
        return "dichVu/suaDichVu";
    }

    @PostMapping("/suadichvu")
    public String capNhatDichVu(@ModelAttribute DichVu dichVu, RedirectAttributes redirectAttributes) {
        dichVuService.save(dichVu);
        redirectAttributes.addFlashAttribute("message", "Chinh Sua Dich Vu Thanh Cong!");
        return "redirect:/dichvu";
    }

    @GetMapping("/xoadichvu")
    public String xoaDichVu(@RequestParam String id, RedirectAttributes redirectAttributes) {
        dichVuService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Xoa Dich Vu Thanh Cong!");
        return "redirect:/dichvu";
    }
}
