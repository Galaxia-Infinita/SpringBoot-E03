

package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ProductoEntity;


public interface ProductoService {
    //funcion que te permita mostrar todos los datos
    List<ProductoEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<ProductoEntity> findAllCustom();
    //funcion para poder buscar por codigo
    Optional<ProductoEntity> findById(Long id);
    //funcion para registrar datos
    ProductoEntity add(ProductoEntity a);
    //funcion para actualizar datos
    ProductoEntity update(ProductoEntity a);
    //funcion para eliminar datos
    ProductoEntity delete(ProductoEntity a);

    
}
