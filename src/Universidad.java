import java.util.Iterator;
import java.util.LinkedList;

import cu.edu.cujae.ceis.tree.binary.BinaryTree;
import cu.edu.cujae.ceis.tree.binary.BinaryTreeNode;
import cu.edu.cujae.ceis.tree.general.GeneralTree;
import cu.edu.cujae.ceis.tree.iterators.general.InBreadthIterator;
import cu.edu.cujae.ceis.tree.iterators.general.InDepthIterator;

public class Universidad {
	private LinkedList<Facultad>facultades;
	
	

	public LinkedList<Facultad> getFacultades() {
		return facultades;
	}

	public void setFacultades(LinkedList<Facultad> facultades) {
		this.facultades = facultades;
	}
	
	public Universidad(LinkedList<Facultad> facultades) {
		this.facultades = facultades;
	}
	
	public String facultad_matricula_determinada(int matricula) {
		String nombre = null;
		boolean encontrada = false;
		Iterator<Facultad>facul = facultades.iterator();
		while(facul.hasNext() && encontrada == false) {
			Facultad fal = facul.next();
			int contador = 0;
			InDepthIterator<año_docente>año = fal.getAños().inDepthIterator();
			while(año.hasNext()) {
				año_docente an = año.next();
				InBreadthIterator<Brigada>briga = an.getBrigadas().inBreadthIterator();
				while(briga.hasNext()) {
					Brigada brig = briga.next();
					if(brig.getEstudiante().totalNodes() == matricula) {
						contador++;
					}
				}
			}
			if(contador >= 2) {
				encontrada = true;
				nombre = fal.getNombre();
			}
		}
		return nombre;
	}
	
}
