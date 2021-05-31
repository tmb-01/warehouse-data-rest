package uz.pdp.warehousedatarest.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Attachment;
import uz.pdp.warehousedatarest.entity.Category;
import uz.pdp.warehousedatarest.entity.Measurement;
import uz.pdp.warehousedatarest.entity.Product;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Projection(types = Product.class)
public interface ProductProjection extends AbsEntityProjection {
    String getCode();

    Category getCategory();

    Attachment getAttachment();

    Measurement getMeasurement();
}
