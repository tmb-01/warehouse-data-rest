package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.template.AbsEntity;
import uz.pdp.warehousedatarest.projection.template.AbsEntityProjection;

import javax.persistence.ManyToOne;

@Projection(types = CategoryProjection.class)
public interface CategoryProjection extends AbsEntityProjection {
    CategoryProjection getParentCategory();
}
