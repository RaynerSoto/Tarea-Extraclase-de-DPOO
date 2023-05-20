import cu.edu.cujae.ceis.tree.binary.BinaryTree;
import cu.edu.cujae.ceis.tree.general.GeneralTree;

public class Brigada {
	private GeneralTree<Estudiante>estudiante = new GeneralTree<Estudiante>();

	public GeneralTree<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(GeneralTree<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}
}
