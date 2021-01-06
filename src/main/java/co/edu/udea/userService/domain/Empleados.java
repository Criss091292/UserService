package co.edu.udea.userService.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idTipoDocumento;
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private String correo;
	private Long idUser;
	private Long idUserCreacion;
	private Long idUserActualizacion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdUserCreacion() {
		return idUserCreacion;
	}
	public void setIdUserCreacion(Long idUserCreacion) {
		this.idUserCreacion = idUserCreacion;
	}
	public Long getIdUserActualizacion() {
		return idUserActualizacion;
	}
	public void setIdUserActualizacion(Long idUserActualizacion) {
		this.idUserActualizacion = idUserActualizacion;
	}
	
	
}
