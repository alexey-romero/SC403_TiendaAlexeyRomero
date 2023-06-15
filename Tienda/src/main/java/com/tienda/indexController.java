package com.tienda;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
//    @RequestMapping("/url")
//    public String page(Model model) {
//        model.addAttribute("attribute", "value");
//        return "view.name";
//    }
    @GetMapping("/")
    public String index() {
        return "index";
        //Este mae va a ir a retornar lo que hay dentro de templates
    }
}
