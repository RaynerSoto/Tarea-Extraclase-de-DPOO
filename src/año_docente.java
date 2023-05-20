import java.util.LinkedList;

import cu.edu.cujae.ceis.tree.binary.BinaryTree;
import cu.edu.cujae.ceis.tree.general.GeneralTree;

public class año_docente extends Entidad{
	private String nombre_profesor_principal;
	private String jefe_FEU;
	private GeneralTree<Brigada>brigadas = new GeneralTree<Brigada>();
	public GeneralTree<Brigada> getBrigadas() {
		return brigadas;
	}
	public void setBrigadas(GeneralTree<Brigada> brigadas) {
		this.brigadas = brigadas;
	}
	public String getNombre_profesor_principal() {
		return nombre_profesor_principal;
	}
	public void setNombre_profesor_principal(String nombre_profesor_principal) {
		this.nombre_profesor_principal = nombre_profesor_principal;
	}
	public String getJefe_FEU() {
		return jefe_FEU;
	}
	public void setJefe_FEU(String jefe_FEU) {
		this.jefe_FEU = jefe_FEU;
	}
}
