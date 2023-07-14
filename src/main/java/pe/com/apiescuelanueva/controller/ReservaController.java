
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
import pe.com.apiescuelanueva.entity.ReservaEntity;
import pe.com.apiescuelanueva.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping
    public List<ReservaEntity> findAll(){
        return reservaService.findAll();
    }
    
    @GetMapping("/custom")
    public List<ReservaEntity> findAllCustom(){
        return reservaService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ReservaEntity> findById(@PathVariable Long id){
        return reservaService.findById(id);
    }
    
    @PostMapping("/guardar")
    public ReservaEntity add(@RequestBody ReservaEntity a){
        return reservaService.add(a);
    }
    
    @PutMapping("/{id}")
    public ReservaEntity update(@PathVariable long id,@RequestBody ReservaEntity a){
        a.setIdpedido(id);
        return reservaService.update(a);
    }
    
    @DeleteMapping("/{id}")
    public ReservaEntity delete(@PathVariable long id){
        ReservaEntity objreserva = new ReservaEntity();
        objreserva.setEst_res(false);
        return reservaService.delete(ReservaEntity.builder().idpedido(id).build());
    }
    
    
}
