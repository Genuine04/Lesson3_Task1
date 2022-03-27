package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Car;
import uz.pdp.task1.entity.SellerType;
import uz.pdp.task1.entity.User;


@Projection(types = Car.class)
public interface CarProjection {

    Long getId();

    String getName();

    int getYear();

    double getPrice();

    String getModel();

    String getVin();

    double getMileage();

    String getTransmission();

    String getStatus();

    String getColor();

    User getSeller();

    SellerType getSellerType();

    double getLan();

    double getLat();

}
