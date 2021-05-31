package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.OutputProduct;
import uz.pdp.warehousedatarest.projection.CategoryProjection;
import uz.pdp.warehousedatarest.projection.OutputProductProjection;

@RepositoryRestResource(path = "output-product" ,collectionResourceRel = "list", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}
