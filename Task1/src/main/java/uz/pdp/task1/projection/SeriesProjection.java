package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Series;


@Projection(types = Series.class)
public interface SeriesProjection {

    Long getId();

    String getName();

}
