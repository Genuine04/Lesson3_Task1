package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Car;
import uz.pdp.task1.projection.CarProjection;

@RepositoryRestResource(path = "car", excerptProjection = CarProjection.class)
public interface CarRepo extends JpaRepository<Car, Long> {
}
