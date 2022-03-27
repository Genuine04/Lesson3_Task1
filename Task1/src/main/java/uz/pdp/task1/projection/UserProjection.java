package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.User;
import uz.pdp.task1.entity.enums.InterestType;


@Projection(types = User.class)
public interface UserProjection {

    Long getId();

    String getEmail();

    String getFirstName();

    String getLastName();

    String getUsername();

    String getPassword();

    InterestType getInterestType();

    String getPostalCode();

}
