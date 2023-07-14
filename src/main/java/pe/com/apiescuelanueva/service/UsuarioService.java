package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.UsuarioEntity;


public interface UsuarioService {
    //funcion que te permita mostrar todos los datos
    List<UsuarioEntity> findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<UsuarioEntity> findAllCustom();
    //funcion para poder buscar por codigo
    Optional<UsuarioEntity> findById(Long id);
    //funcionprueba
    List<UsuarioEntity> usuarioEntitys();
    //funcion para registrar datos
    UsuarioEntity add(UsuarioEntity a);
    //funcion para actualizar datos
    UsuarioEntity update(UsuarioEntity a);
    //funcion para eliminar datos
    UsuarioEntity delete(UsuarioEntity a);

    
}