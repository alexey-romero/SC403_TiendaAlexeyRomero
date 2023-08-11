package com.tienda.service;

import com.tienda.entities.Product;
import java.util.List;
import java.util.Optional;

public interface IProductService extends IBaseService<Product, Integer> {
    //creamos metodo de filtrado por precio.
    List<Product> getProductsWithFilters(Optional<Integer> lowerPrice, Optional<Integer> higherPrice);
}

//package com.tienda.service;
//
//import com.tienda.entities.Product;
//import java.util.List;
//import java.util.Optional;
//
//public interface IProductService extends IBaseService<Product, Integer> {
//    List<Product> getProductsWithFilters(Optional<Integer> lowerPrice, Optional<Integer> higherPrice);
//    
//    List<Product> getProductos(boolean activos);
//    
//    Product getProduct(Product product);
//}
//public interface IProductService extends IBaseService<Product, Integer> {
//
//}
//public interface IProductService {
//    List<Product> getAllProducts();
//    void save(Product product);
//    void delete(Product product);
//}
