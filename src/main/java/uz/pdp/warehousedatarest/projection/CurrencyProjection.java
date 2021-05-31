package uz.pdp.warehousedatarest.projection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.Currency;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import javax.persistence.Entity;

@Projection(types = Currency.class)
public interface CurrencyProjection extends AbsEntityProjection {

}
