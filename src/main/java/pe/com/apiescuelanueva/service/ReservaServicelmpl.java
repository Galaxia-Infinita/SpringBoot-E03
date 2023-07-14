
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ReservaEntity;
import pe.com.apiescuelanueva.repository.ReservaRepository;



@Service
public class ReservaServicelmpl implements ReservaService{
    
    @Autowired
    private ReservaRepository reservaRepository;
    
    
    @Override
    public List<ReservaEntity> findAll() {
        return reservaRepository.findAll();
    }

    @Override
    public List<ReservaEntity> findAllCustom() {
        return reservaRepository.findAllCustom();
    }

    @Override
    public Optional<ReservaEntity> findById(Long id) {
        return reservaRepository.findById(id);
    }

    @Override
    public ReservaEntity add(ReservaEntity a) {
        return reservaRepository.save(a);
    }

    @Override
    public ReservaEntity update(ReservaEntity a) {
        ReservaEntity objreserva = reservaRepository.getById(a.getIdpedido());
        BeanUtils.copyProperties(a, objreserva);
        return reservaRepository.save(objreserva);
    }

    @Override
    public ReservaEntity delete(ReservaEntity a) {
        ReservaEntity objreserva = reservaRepository.getById(a.getIdpedido());
        objreserva.setEst_res(false);
        return reservaRepository.save(objreserva);
    }

}
