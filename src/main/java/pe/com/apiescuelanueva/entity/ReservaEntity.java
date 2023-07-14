package pe.com.apiescuelanueva.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ReservaEntity")
@Table(name = "reserva")
public class ReservaEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idpedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpedido;
    @Column(name="nomres")
    private String nomres;
    @Column(name="aperes")
    private String aperes;
    @Column(name="dnires")
    private String dnires;
    @Column(name="celres")
    private String celres;
    @Column(name="cantpres")
    private int cantpres;
    @Column(name="est_res")
    private boolean est_res;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="det_desc")
    private String det_desc;
    @Column(name="total")
    private int total;

    }
