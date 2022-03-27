package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.SellerType;

@Projection(types = SellerType.class)
public interface SellerTypeProjection {

    Long getId();

    String getName();

}
