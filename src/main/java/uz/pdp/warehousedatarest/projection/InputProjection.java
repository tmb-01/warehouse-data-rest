package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Input;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {
    Long getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();

    WareHouseProjection getWareHouse();

    SupplierProjection getSupplier();

    Currency getCurrency();
}
