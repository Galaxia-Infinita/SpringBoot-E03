package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.UsuarioEntity;
import pe.com.apiescuelanueva.repository.UsuarioRepository;



@Service
public class UsuarioServicelmpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    
    @Override
    public List<UsuarioEntity> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return usuarioRepository.findAllCustom();
    }
    
    @Override
    public List<UsuarioEntity> usuarioEntitys() {
        return usuarioRepository.usuarioEntitys();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity a) {
        return usuarioRepository.save(a);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity a) {
        UsuarioEntity objusuario = usuarioRepository.getById(a.getIdusuario());
        BeanUtils.copyProperties(a, objusuario);
        return usuarioRepository.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity a) {
        UsuarioEntity objusuario = usuarioRepository.getById(a.getIdusuario());
        objusuario.setEst_usu(false);
        return usuarioRepository.save(objusuario);
    }

}
