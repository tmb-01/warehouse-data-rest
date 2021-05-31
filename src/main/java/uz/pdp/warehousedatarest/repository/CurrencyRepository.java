package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.projection.CategoryProjection;
import uz.pdp.warehousedatarest.projection.CurrencyProjection;

@RepositoryRestResource(path = "currency" ,collectionResourceRel = "list", excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    boolean existsByName(String name);
}
