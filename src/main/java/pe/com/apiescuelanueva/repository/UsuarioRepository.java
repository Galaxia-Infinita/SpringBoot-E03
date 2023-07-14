package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.UsuarioEntity;


public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("select u from UsuarioEntity u where u.est_usu=1")
    List<UsuarioEntity> findAllCustom();
    @Query("select u.nomusuario, u.contraseña from UsuarioEntity u where u.est_usu=1")
    List<UsuarioEntity> usuarioEntitys();
}


