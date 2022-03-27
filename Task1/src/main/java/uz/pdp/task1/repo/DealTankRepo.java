package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task1.entity.DealTank;
import uz.pdp.task1.projection.DealTankProjection;

@RepositoryRestResource(path = "dealTank", excerptProjection = DealTankProjection.class)
public interface DealTankRepo extends JpaRepository<DealTank, Long> {
}
