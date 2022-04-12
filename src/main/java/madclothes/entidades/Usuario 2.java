package madclothes.entidades;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String correo;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String direccion;

	private String encodedPassword;
	
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> roles;
	
	public Usuario(String n, String a, String c, String d, int t) {
		this.nombre = n;
		this.apellidos = a;
		this.correo = c;
		this.direccion = d;
		this.telefono = t;
	}
	
	public Usuario(String name, String encodedPassword, String... roles) {
		this.nombre = name;
		this.encodedPassword = encodedPassword;
		this.roles = List.of(roles);
	}
	
	public Usuario(String n, String a, String c, String d, int t,int id, String encodedPassword, String... roles) {
		this.nombre = n;
		this.apellidos = a;
		this.correo = c;
		this.direccion = d;
		this.telefono = t;
		this.id=id;
		this.encodedPassword = encodedPassword;
		this.roles = List.of(roles);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario() {

	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono2) {
		this.telefono = telefono2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}


}