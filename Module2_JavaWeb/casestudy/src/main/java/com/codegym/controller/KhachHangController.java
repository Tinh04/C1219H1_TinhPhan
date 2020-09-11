package com.codegym.controller;

import com.codegym.entity.KhachHang;
import com.codegym.entity.LoaiKhach;
import com.codegym.service.HopDongService;
import com.codegym.service.KhachHangService;
import com.codegym.service.LoaiKhachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private LoaiKhachService loaiKhachService;

    @ModelAttribute("danhSachLoaiKhach")
    public List<LoaiKhach> hienThiLoaiKhach() {
        return loaiKhachService.findAll();
    }

    @GetMapping("/khachhang")
    public String hienThiDanhSachKhachHang(@RequestParam Optional<String> key, @PageableDefault(size = 5)
            Pageable pageable, Model model) {
        Page<KhachHang> khachHangList;
        Sort sort = Sort.by("idKhachHang").descending();
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        if (key.isPresent() && !(key.get().isEmpty()))  {
            khachHangList = khachHangService.findAllByTenKhachHangContaining(key.get(), pageable);
            model.addAttribute("key", key.get());
        } else {
            khachHangList = khachHangService.findAll(pageable);
        }
        model.addAttribute("khachhang", khachHangList);
        return "khachHang/danhSachKhachHang";
    }

    @GetMapping("/thongtinkhachhang")
    public String hienThiKhachHang(@RequestParam String id, Model model) {
        model.addAttribute("khachhang", khachHangService.findById(id));
        return "khachHang/chiTietKhachHang";
    }

    @GetMapping("/themkhachhang")
    public String taoKhachHang(Model model) {
        model.addAttribute("khachhang", new KhachHang());
        return "khachHang/themKhachHang";
    }

    @PostMapping("/themkhachhang")
    public String luuKhachHang(@Valid @ModelAttribute("khachHang") KhachHang khachHang, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.khachHang", bindingResult);
            return "khachHang/themKhachHang";
        }
        khachHangService.save(khachHang);
        redirectAttributes.addFlashAttribute("message", "Them Moi Khach Hang Thanh Cong!");
        return "redirect:/khachhang";
    }

    @GetMapping("/suakhachhang")
    public String suaKhachHang(@RequestParam String id, Model model) {
        model.addAttribute("khachhang", khachHangService.findById(id));
        return "khachHang/suaKhachHang";
    }

    @PostMapping("/suakhachhang")
    public String capNhatKhachHang(@ModelAttribute KhachHang khachHang, RedirectAttributes redirectAttributes) {
        khachHangService.save(khachHang);
        redirectAttributes.addFlashAttribute("message", "Chinh Sua Khach Hang Thanh Cong!");
        return "redirect:/khachhang";
    }

    @GetMapping("/xoakhachhang")
    public String xoaKhachHang(@RequestParam String id, RedirectAttributes redirectAttributes) {
        khachHangService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Xoa Khach Hang Thanh Cong!");
        return "redirect:/khachhang";
    }

    @GetMapping("/timkiem")
    public String timKiem(@RequestParam("keyword") Optional<String> keyword, Model model,
                          @PageableDefault(size = 3) Pageable pageable,
                          RedirectAttributes redirectAttributes) {
        if ((keyword.isPresent()) && (!(keyword.get().isEmpty())))
        {
            Page<KhachHang> khachHangs = khachHangService.findAllByDiaChiKhachHangContainingOrNgaySinhKhachHangContainingOrTenKhachHangContainingOrSdtKhachHangContainingOrCmndKhachHangContainingOrMailKhachHangContainingOrIdKhachHang(keyword.get(), pageable);
            if (khachHangs.isEmpty()) {
                redirectAttributes.addFlashAttribute("message", "Khong Tim Thay");
                return "khachHang/danhSachKhachHang";
            } else {
                model.addAttribute("khachhang", khachHangs);
                return "khachHang/danhSachTimKiem";
            }

        } else {
            redirectAttributes.addFlashAttribute("message", "Vui Long Nhap Tu Khoa!");
        }
        return "khachHang/danhSachKhachHang";
    }
}
