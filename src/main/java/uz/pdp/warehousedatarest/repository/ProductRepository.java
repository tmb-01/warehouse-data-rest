package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.Product;
import uz.pdp.warehousedatarest.projection.ProductProjection;

@RepositoryRestResource(path = "product" ,collectionResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
