package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Category;
import uz.pdp.task1.entity.DealTank;
import uz.pdp.task1.entity.Series;

import java.util.Date;


@Projection(types = DealTank.class)
public interface DealTankProjection {

    Long getId();

    Category getCategory();

    Series getSeries();

    Date getFromYear();

    Date getToYear();

}
