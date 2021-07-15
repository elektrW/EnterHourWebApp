package pl.wojciechdomagala.enterhourwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wojciechdomagala.enterhourwebapp.model.Hours;

@Repository
public interface HoursRepository extends JpaRepository<Hours, Long> {

}
