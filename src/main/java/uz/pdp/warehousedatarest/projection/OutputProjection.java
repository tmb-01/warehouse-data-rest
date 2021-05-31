package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Client;
import uz.pdp.warehousedatarest.entity.Output;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {

    Long getId();

    Timestamp getDate();

    String getCode();

    String getFactureNumber();

    WareHouseProjection getWareHouse();

    Client getClient();

    Currency getCurrency();


}
