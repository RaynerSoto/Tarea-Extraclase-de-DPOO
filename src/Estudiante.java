
public class Estudiante extends Entidad {
	private String sexo;
	private String direccion;
	private boolean militante;
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public boolean isMilitante() {
		return militante;
	}
	public void setMilitante(boolean militante) {
		this.militante = militante;
	}
}
