package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@SessionAttributes({"cart", "productList"})
public class ProductController {

    @Autowired
    ProductService productService;

    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "home";
    }

    @GetMapping("/view-product")
    public String showDetail(@RequestParam Integer id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }

    @GetMapping("/go-to-cart")
    public String showCart(@SessionAttribute("cart") Cart cart, RedirectAttributes redirectAttributes, Model model) {
        if (!cart.isEmpty()) {
            return "cart";
        } else {
            redirectAttributes.addFlashAttribute("message", "Your cart is empty!");
            model.addAttribute("product", productService.findAll());
            return "home";
        }
    }

//    @GetMapping("/add-to-cart")
//    public String addToCart(@SessionAttribute("cart") Cart cart, @RequestParam Integer id,
//                            RedirectAttributes redirectAttributes, Model model) {
//        Product product = productService.findById(id);
//        if (cart.contains(product)) {
//            Integer quantity = product.getQuantity() + 1;
//            product.setQuantity(quantity);
//            int index = cart.indexOf(product);
//            cart.set(index, product);
//
//        } else {
//            cart.add(product);
//        }
//        model.addAttribute("cart", cart);
//        System.out.println(cart);
//        redirectAttributes.addFlashAttribute("message", "Add to cart success!");
//        model.addAttribute("product", productService.findAll());
//        return "home";
//    }

    @GetMapping("/delete-product")
    public String deleteProduct(@SessionAttribute("cart") Cart cart, @RequestParam Integer id,
                                RedirectAttributes redirectAttributes) {
        for (Product product : cart) {
            if (product.getId().equals(id)) {
                cart.remove(product);
                break;
            }
        }
        redirectAttributes.addFlashAttribute("message", "Delete product in cart success!");
        return "cart";
    }


    @GetMapping("/add-to-cart")
    public String handleBuyProduct(@RequestParam Integer id, @SessionAttribute Cart cart,
                                   @SessionAttribute List<Product> productList, Model model) {
        Product product = productList.get(id-1);
        model.addAttribute("product", product);
        Integer index = null;
        if (product == null) {
            model.addAttribute("message", "Error");
        }
        index = cart.indexOf(product);
        if(cart.contains(product)) {
//            assert product != null;
            if (product != null) {
                product.setQuantity(product.getQuantity() + 1);
                productList.set(product.getId()-1,product);
                cart.set(index,product);
            }
        }else {
            cart.add(product);
        }
        model.addAttribute("message", "Add " + product.getName() + " to cart successfully");
        model.addAttribute("cart",cart);
        return "home";
    }
}

