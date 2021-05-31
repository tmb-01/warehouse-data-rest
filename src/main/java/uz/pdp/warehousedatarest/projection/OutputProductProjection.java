package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Output;
import uz.pdp.warehousedatarest.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
    Long getId();

    Double getAmount();

    Float getPrice();

    ProductProjection getProduct();

    Output getOutput();
}
