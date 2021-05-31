package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.Category;
import uz.pdp.warehousedatarest.projection.CategoryProjection;

@RepositoryRestResource(path = "category" ,collectionResourceRel = "list", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
