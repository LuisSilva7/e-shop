package org.luissilva.e_shop.service.product;

import org.luissilva.e_shop.exceptions.ProductNotFoundException;
import org.luissilva.e_shop.model.Product;
import org.luissilva.e_shop.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {

    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found!"));
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProductById(Product product, Long proudctId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return null;
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return null;
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return null;
    }
}
