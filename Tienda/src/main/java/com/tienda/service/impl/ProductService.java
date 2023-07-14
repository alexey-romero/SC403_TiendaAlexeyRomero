package com.tienda.service.impl;

import com.tienda.db.IProductRepository;
import com.tienda.entities.Product;
import com.tienda.service.IProductService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService extends BaseService<Product, Integer> implements IProductService {

    //here we have to create this variable because of syntax we can't see the this.repository as a IproductRepository
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

    public List<Product> getProductsWithFilters(Optional<Integer> lowerPrice, Optional<Integer> higherPrice) {
        if (lowerPrice.isPresent() && higherPrice.isPresent()) {
            return this.productRepository.findAllByPrecioBetween(lowerPrice.get(), higherPrice.get());
        }
        if (lowerPrice.isPresent()) {
            return this.productRepository.findAllByPrecioGreaterThanEqual(lowerPrice.get());
        }
        if (higherPrice.isPresent()) {
            return this.productRepository.findAllByPrecioIsLessThanEqual(higherPrice.get());
        }
        return (List<Product>) this.productRepository.findAll();
    }

    @Override
    public List<Product> getProductos(boolean activos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Product getProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

//@Service
//public class ProductService extends BaseService<Product, Integer> implements IProductService {
//    public ProductService(IProductRepository productRepository) {
//        super(productRepository);
//    }
//
//}
//@Service
//public class ProductService implements IProductService {
//    private final IProductRepository productRepository;
//    public ProductService(IProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//    public List<Product> getAllProducts() {
//        return (List<Product>) this.productRepository.findAll();
//    }
//    public void save(Product product) {
//        product.setActivo(true);
//        this.productRepository.save(product);
//    }
//    public void delete(Product product) {
//        this.productRepository.delete(product);
//    }
//}
