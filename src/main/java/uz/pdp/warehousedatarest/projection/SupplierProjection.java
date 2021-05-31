package uz.pdp.warehousedatarest.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Supplier;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Projection(types = Supplier.class)
public interface SupplierProjection extends AbsEntityProjection {
    String getPhoneNumber();
}
