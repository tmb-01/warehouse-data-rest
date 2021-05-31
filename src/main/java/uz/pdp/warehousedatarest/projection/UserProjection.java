package uz.pdp.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehousedatarest.entity.User;

import java.util.Set;

@Projection(types = User.class)
public interface UserProjection {
    Long getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean isActive();

    Set<WareHouseProjection> getWareHouse();
}
