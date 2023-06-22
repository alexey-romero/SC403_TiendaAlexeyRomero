//package com.tienda.controllers;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class IndexController {
////    @RequestMapping("/url")
////    public String page(Model model) {
////        model.addAttribute("attribute", "value");
////        return "view.name";
////    }
//    @GetMapping("/")
//    public String index() {
//        return "index";
//        //Este mae va a ir a retornar lo que hay dentro de templates
//    }
//}

package com.tienda.controllers;
import com.tienda.service.IProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final IProductService productService;
    public IndexController(IProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/")
    public String index(Model model) {
        var productos = this.productService.getAllProducts();
        model.addAttribute("products", productos);
        return "index";
    }
}