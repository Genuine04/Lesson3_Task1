package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Model;
import uz.pdp.task1.projection.ModelProjection;


@RepositoryRestResource(path = "model", excerptProjection = ModelProjection.class)
public interface ModelRepo extends JpaRepository<Model, Long> {
}
