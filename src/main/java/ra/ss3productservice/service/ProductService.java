package ra.ss3productservice.service;

import ra.ss3productservice.dto.ProductRequestDTO;
import ra.ss3productservice.dto.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO createProduct(ProductRequestDTO requestDTO);
    ProductResponseDTO getProductById(Long id);
    List<ProductResponseDTO> getAllProducts();
}
