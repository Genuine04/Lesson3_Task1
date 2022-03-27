package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Model;


@Projection(types = Model.class)
public interface ModelProjection {

    Long getId();

    String getName();

}
