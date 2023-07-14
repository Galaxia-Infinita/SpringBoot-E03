
package pe.com.apiescuelanueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.entity.UsuarioEntity;
import pe.com.apiescuelanueva.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public List<UsuarioEntity> findAll(){
        return usuarioService.findAll();
    }
    
    @GetMapping("/custo"
    		+ "m")
    public List<UsuarioEntity> findAllCustom(){
        return usuarioService.findAllCustom();
    }
    
    @GetMapping("/login")
    public List<UsuarioEntity> usuarioEntitys(){
        return usuarioService.usuarioEntitys();
    }
    
    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    
    @PostMapping("/agregar")
    public UsuarioEntity add(@RequestBody UsuarioEntity a){
        return usuarioService.add(a);
    }
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable long id,@RequestBody UsuarioEntity a){
        a.setIdusuario(id);
        return usuarioService.update(a);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable long id){
        UsuarioEntity objusuario = new UsuarioEntity();
        objusuario.setEst_usu(false);
        return usuarioService.delete(UsuarioEntity.builder().idusuario(id).build());
    }
    
    
}
