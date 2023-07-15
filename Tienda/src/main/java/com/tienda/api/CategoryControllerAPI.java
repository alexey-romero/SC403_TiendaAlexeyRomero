package com.tienda.api;

import com.tienda.entities.Category;
import com.tienda.entities.Product;
import com.tienda.service.ICategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Controller
@Slf4j
@RequestMapping("api/category")
public class CategoryControllerAPI {
//        @Autowired
//        private ICategoryService categoryService;
//
//        @GetMapping("/all")
//        public String index(Model model) {
//            var categories = categoryService.getCategories(false);
//            model.addAttribute("categories", categories);
//            model.addAttribute("totalCategories", categories.size());
//            return "/category/all";
//        }
//
//        @GetMapping("/new")
//        public String categoryNew(Category category) {
//            return "/category/modify";
//        }
//
//        @Autowired
//        private FirebaseStorageService firebaseStorageService;
//
//        @PostMapping("/save")
//        public String categoriaGuardar(Category category, @RequestParam("imageFile") MultipartFile imageFile) {
//            if (!imageFile.isEmpty()) {
//                categoryService.save(category);
//                category.setRuta_imagen(firebaseStorageService.cargaImagen(imageFile, "category", Long.valueOf(category.getId())));
//            }
//            categoryService.save(category);
//            return "redirect:/category/listado";
//        }
//
//        @GetMapping("/delete/{idCategory}")
//        public String categoryDelete(Category category) {
//            categoryService.delete(category);
//            return "redirect:/category/listado";
//        }
//
//        @DeleteMapping()
//        public ResponseEntity<String> delete(@RequestBody Category category) {
//            this.categoryService.delete(category);
//            return new ResponseEntity<>(HttpStatus.OK);
//        }
//
//        @GetMapping("/update/{idCategoria}")
//        public String categoryUpdate(Category category, Model model) {
//            category = categoryService.getCategory(category);
//            model.addAttribute("category", category);
//            return "/category/update";

        private final ICategoryService categoryService;

        public CategoryControllerAPI(ICategoryService categoryService) {
            this.categoryService = categoryService;
        }
        @GetMapping("/all")
        public List<Category> getAll() {
            return this.categoryService.getAll();
        }

        @GetMapping()
        public Category getById(@RequestParam("id") int id) {
            var category = this.categoryService.getById(id);
            if (category.isPresent()) {
                return category.get();
            }
            throw new ResponseStatusException(NOT_FOUND, "Unable to find resource");
        }

        @PostMapping()
        public Category save(@RequestBody Category category) {
            return this.categoryService.save(category);
        }

        @DeleteMapping()
        public ResponseEntity<String> delete(@RequestBody Category category) {
            this.categoryService.delete(category);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }