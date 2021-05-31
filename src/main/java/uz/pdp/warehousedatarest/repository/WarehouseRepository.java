package uz.pdp.warehousedatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehousedatarest.entity.WareHouse;
import uz.pdp.warehousedatarest.projection.WareHouseProjection;

@RepositoryRestResource(path = "warehouse", collectionResourceRel = "list", excerptProjection = WareHouseProjection.class)
public interface WarehouseRepository extends JpaRepository<WareHouse, Long> {
}
