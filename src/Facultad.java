import java.util.LinkedList;

import cu.edu.cujae.ceis.tree.general.GeneralTree;

public class Facultad extends Entidad {
	private String extension_telefonica;
	private String nombre_decano;
	private GeneralTree<año_docente>años;
	public GeneralTree<año_docente> getAños() {
		return años;
	}
	public void setAños(GeneralTree<año_docente> años) {
		this.años = años;
	}
	public String getNombre_decano() {
		return nombre_decano;
	}
	public void setNombre_decano(String nombre_decano) {
		this.nombre_decano = nombre_decano;
	}
	public String getExtension_telefonica() {
		return extension_telefonica;
	}
	public void setExtension_telefonica(String extension_telefonica) {
		this.extension_telefonica = extension_telefonica;
	}
	
}
