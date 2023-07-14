//package com.tienda.api;
//
//import com.tienda.entities.Category;
//import com.tienda.service.ICategoryService;
//import com.tienda.service.impl.FirebaseStorageService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.server.ResponseStatusException;
//
//@Controller
//@Slf4j
//@RequestMapping("/api/category")
//public class CategoryControllerAPI {
//    @Autowired
//    private ICategoryService categoryService;
//
//    @GetMapping("/listado")
//    public String index(Model model) {
//        var categories = categoryService.getCategories(false);
//        model.addAttribute("categories", categories);
//        model.addAttribute("totalCategories", categories.size());
//        return "/category/listado";
//    }
//
//    @GetMapping("/new")
//    public String categoryNew(Category category) {
//        return "/category/modify";
//    }
//
//    @Autowired
//    private FirebaseStorageService firebaseStorageService;
//
//    @PostMapping("/save")
//    public String categoriaGuardar(Category category, @RequestParam("imageFile") MultipartFile imageFile) {
//        if (!imageFile.isEmpty()) {
//            categoryService.save(category);
//            category.setRuta_imagen(firebaseStorageService.cargaImagen(imageFile, "category", Long.valueOf(category.getId())));
//        }
//        categoryService.save(category);
//        return "redirect:/category/listado";
//    }
//
//    @GetMapping("/delete/{idCategory}")
//    public String categoryDelete(Category category) {
//        categoryService.delete(category);
//        return "redirect:/category/listado";
//    }
//
//    @GetMapping("/update/{idCategoria}")
//    public String categoryUpdate(Category category, Model model) {
//        category = categoryService.getCategory(category);
//        model.addAttribute("category", category);
//        return "/category/update";
//    }
//}