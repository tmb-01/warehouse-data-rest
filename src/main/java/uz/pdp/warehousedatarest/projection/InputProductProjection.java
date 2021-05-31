package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.InputProduct;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import java.time.LocalDateTime;

@Projection(types = InputProduct.class)
public interface InputProductProjection extends AbsEntityProjection {
    Long getId();

    Double getAmount();

    Float getPrice();

    LocalDateTime getExpireDate();

    ProductProjection getProduct();

    InputProjection getInput();
}
