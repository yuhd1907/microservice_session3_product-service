package ra.ss3productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.ss3productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
