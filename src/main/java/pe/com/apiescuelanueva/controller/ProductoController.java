
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
import pe.com.apiescuelanueva.entity.ProductoEntity;
import pe.com.apiescuelanueva.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping
    public List<ProductoEntity> findAll(){
        return productoService.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom(){
        return productoService.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity> findById(@PathVariable Long id){
        return productoService.findById(id);
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity a){
        return productoService.add(a);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id,@RequestBody ProductoEntity a){
        a.setIdproducto(id);
        return productoService.update(a);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id){
        ProductoEntity objproducto = new ProductoEntity();
        objproducto.setEst_produc(false);
        return productoService.delete(ProductoEntity.builder().idproducto(id).build());
    }
    
    
}
