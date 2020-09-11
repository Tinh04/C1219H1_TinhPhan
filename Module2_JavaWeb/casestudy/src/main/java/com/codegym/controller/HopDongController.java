package com.codegym.controller;

import com.codegym.entity.*;
import com.codegym.service.*;
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
public class HopDongController {

    @Autowired
    private HopDongService hopDongService;

    @Autowired
    private DichVuService dichVuService;

    @Autowired
    DichVuDiKemService dichVuDiKemService;

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private KhachHangService khachHangService;

    @ModelAttribute("danhsachdichvu")
    public List<DichVu> dichVuList() {
        return dichVuService.findAll();
    }

    @ModelAttribute("nhanVien")
    public List<NhanVien> nhanVienList() {
        return nhanVienService.findAll();
    }

    @ModelAttribute("khachHang")
    public List<KhachHang> khachHangList() {
        return khachHangService.findAll();
    }

    @GetMapping("/hopdong")
    public String hienThiDanhSachHopDong(@PageableDefault(size = 5) Pageable pageable,@RequestParam("DV") Optional<String> DV, Model model) {
        if (DV.isPresent()){
            model.addAttribute("DV",1);
        }
        Sort sort = Sort.by("idHopDong").descending();
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        Page<HopDong> hopDongs = hopDongService.findAll(pageable);
        model.addAttribute("hopdong", hopDongs);
        return "hopDong/danhSachHopDong";
    }

    @GetMapping("/thongtinhopdong")
    public String hienThiHopDong(@RequestParam Integer id, Model model) {
        model.addAttribute("hopdong", hopDongService.findById(id));
        return "hopDong/chiTietHopDong";
    }

    @GetMapping("/themhopdong")
    public String themHopDong(Model model) {
        model.addAttribute("hopdong", new HopDong());
        model.addAttribute("khachHang",khachHangService.findAll());
        model.addAttribute("nhanVien",nhanVienService.findAll());
        model.addAttribute("danhSachDichVu",dichVuService.findAll());
        return "hopDong/themHopDong";
    }

    @PostMapping("/themhopdong")
    public String luuHopDong(@Valid @ModelAttribute HopDong hopDong, BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            return "hopDong/themHopDong";
        }
        hopDongService.save(hopDong);
        redirectAttributes.addFlashAttribute("message", "Them Hop Dong Thanh Cong!");
        return "redirect:/hopdong";
    }

    @GetMapping("/suahopdong")
    public String suaHopDong(@RequestParam Integer id, Model model) {
        model.addAttribute("hopdong", hopDongService.findById(id));
        return "hopDong/suaHopDong";
    }

    @PostMapping("/suahopDong")
    public String capNhatHopDong(@ModelAttribute HopDong hopDong, RedirectAttributes redirectAttributes) {
        List<HopDongChiTiet> dichVuDiKem = hopDongService.findById(hopDong.getIdHopDong()).getHopDongChiTietList();
        KhachHang khachHang = khachHangService.findById(hopDong.getKhachHang().getIdKhachHang());
        hopDong.setKhachHang(khachHang);
        NhanVien nhanVien = nhanVienService.findById(hopDong.getNhanVien().getIdNhanVien());
        hopDong.setNhanVien(nhanVien);
        hopDong.setHopDongChiTietList(dichVuDiKem);
        hopDongService.save(hopDong);
        redirectAttributes.addFlashAttribute("message", "Chinh Sua Hop Dong Thanh Cong!");
        return "redirect:/hopdong";
    }

    @GetMapping("/xoahopdong")
    public String xoaHopDong(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        hopDongService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Xoa Hop Dong Thanh Cong!");
        return "redirect:/hopdong";
    }
}
