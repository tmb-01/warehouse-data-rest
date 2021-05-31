package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import javax.persistence.Column;

@Projection(types = ClientProjection.class)
public interface ClientProjection extends AbsEntityProjection {
    String getPhoneNumber();
}
