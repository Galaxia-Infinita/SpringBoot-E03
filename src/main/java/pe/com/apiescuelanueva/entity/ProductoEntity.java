package pe.com.apiescuelanueva.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ProductoEntity")
@Table(name = "producto")
public class ProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproducto;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="det_desc")
    private String det_desc;
    @Column(name="precio")
    private int precio;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="est_produc")
    private boolean est_produc;
}
