

package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ReservaEntity;


public interface ReservaService {
    //funcion que te permita mostrar todos los datos
    List<ReservaEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<ReservaEntity> findAllCustom();
    //funcion para poder buscar por codigo
    Optional<ReservaEntity> findById(Long id);
    //funcion para registrar datos
    ReservaEntity add(ReservaEntity a);
    //funcion para actualizar datos
    ReservaEntity update(ReservaEntity a);
    //funcion para eliminar datos
    ReservaEntity delete(ReservaEntity a);

    
}
