package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.Category;
import uz.pdp.task1.projection.CategoryProjection;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
