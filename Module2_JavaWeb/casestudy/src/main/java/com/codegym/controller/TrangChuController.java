package com.codegym.controller;

import com.codegym.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {

    @Autowired
    private BoPhanService boPhanService;

    @Autowired
    private DichVuDiKemService dichVuDiKemService;

    @Autowired
    private KieuThueService kieuThueService;

    @Autowired
    private LoaiDichVuService loaiDichVuService;

    @Autowired
    private LoaiKhachService loaiKhachService;

    @Autowired
    private TrinhDoService trinhDoService;

    @Autowired
    private ViTriService viTriService;

    @GetMapping("/")
    public String denTrangChu() {
        return "trangChu";
    }

    @GetMapping("/bophan")
    public String hienThiDanhSachBoPhan(Model model) {
        model.addAttribute("bophan", boPhanService.findAll());
        return "danhSach/boPhan";
    }

    @GetMapping("/dichvudikem")
    public String hienThiDanhSachDichVuDiKem(Model model) {
        model.addAttribute("dichvudikem", dichVuDiKemService.findAll());
        return "danhSach/dichVuDiKem";
    }

    @GetMapping("/kieuthue")
    public String hienThiDanhSachKieuThue(Model model) {
        model.addAttribute("kieuthue", kieuThueService.findAll());
        return "danhSach/kieuThue";
    }

    @GetMapping("/loaidichvu")
    public String hienThiDanhSachLoaiDichVu(Model model) {
        model.addAttribute("loaidichvu", loaiDichVuService.findAll());
        return "danhSach/loaiDichVu";
    }

    @GetMapping("/loaikhach")
    public String hienThiDanhSachLoaiKhach(Model model) {
        model.addAttribute("loaikhach", loaiKhachService.findAll());
        return "danhSach/loaiKhach";
    }

    @GetMapping("/trinhdo")
    public String hienThiDanhSachTrinhDo(Model model) {
        model.addAttribute("trinhdo", trinhDoService.findAll());
        return "danhSach/trinhDo";
    }

    @GetMapping("/vitri")
    public String hienThiDanhSachViTri(Model model) {
        model.addAttribute("vitri", viTriService.findAll());
        return "danhSach/viTri";
    }
}
