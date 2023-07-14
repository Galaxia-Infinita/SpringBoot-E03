
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ProductoEntity;
import pe.com.apiescuelanueva.repository.ProductoRepository;



@Service
public class ProductoServicelmpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;
    
    
    @Override
    public List<ProductoEntity> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productoRepository.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity a) {
        return productoRepository.save(a);
    }

    @Override
    public ProductoEntity update(ProductoEntity a) {
        ProductoEntity objproducto = productoRepository.getById(a.getIdproducto());
        BeanUtils.copyProperties(a, objproducto);
        return productoRepository.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity a) {
        ProductoEntity objproducto = productoRepository.getById(a.getIdproducto());
        objproducto.setEst_produc(false);
        return productoRepository.save(objproducto);
    }

}
