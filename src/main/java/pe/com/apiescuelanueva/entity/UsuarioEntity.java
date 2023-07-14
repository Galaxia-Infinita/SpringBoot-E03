package pe.com.apiescuelanueva.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="UsuarioEntity")
@Table(name = "usuario")
public class UsuarioEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="dni")
    private String dni;
    @Column(name="contraseña")
    private String contraseña;
    @Column(name="nomusuario")
    private String nomusuario;
    @Column(name="est_usu")
    private boolean est_usu;
}

