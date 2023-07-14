package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.ReservaEntity;


public interface ReservaRepository extends JpaRepository<ReservaEntity, Long>{
    @Query("select r from ReservaEntity r where r.est_res=1")
    List<ReservaEntity> findAllCustom();
}

