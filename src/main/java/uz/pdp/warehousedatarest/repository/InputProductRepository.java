package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.InputProduct;
import uz.pdp.warehousedatarest.projection.CategoryProjection;
import uz.pdp.warehousedatarest.projection.InputProductProjection;

@RepositoryRestResource(path = "input-product" ,collectionResourceRel = "list", excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}
