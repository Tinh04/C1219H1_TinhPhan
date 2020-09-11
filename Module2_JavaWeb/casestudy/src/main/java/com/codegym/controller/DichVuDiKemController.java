package com.codegym.controller;

import com.codegym.entity.DichVuDiKem;
import com.codegym.entity.HopDongChiTiet;
import com.codegym.service.DichVuDiKemService;
import com.codegym.service.HopDongChiTietService;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class DichVuDiKemController {

    @Autowired
    private DichVuDiKemService dichVuDiKemService;

    @Autowired
    private HopDongService hopDongService;

    @Autowired
    private HopDongChiTietService hopDongChiTietService;

    @GetMapping("/DichVuDiKem")
    public  String getDichVuDiKem(@ModelAttribute("hopDongChiTiet") HopDongChiTiet hopDongChiTiet,
                                  @RequestParam("id") Integer id, Model model){
        hopDongChiTiet.setHopDong(hopDongService.findById(id));
        hopDongChiTietService.save(hopDongChiTiet);
        model.addAttribute("message","Them Moi Thanh Cong!");
        return "redirect:/hopdong";
    }

    @GetMapping("/themDichVuDiKem")
    public String themDichVuDiKem(@Valid @ModelAttribute DichVuDiKem dichVuDiKem, BindingResult bindingResult,
                                  @RequestParam Integer id, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "redirect:/themDichVuDiKem";
        }
        model.addAttribute("danhSachDichVuDiKem",dichVuDiKemService.findAll());
        model.addAttribute("hopDongThem",hopDongService.findById(id));
        model.addAttribute("hopDongChiTiet",new HopDongChiTiet());
        return "dichVuDiKem";
    }
}
