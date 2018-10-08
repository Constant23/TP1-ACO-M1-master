package Exercice1_R3;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Cours3
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int idCours;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String Llibelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Collection<Inscrit> inscrit;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Cours3(){
		super();
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	public String getLlibelle() {
		return Llibelle;
	}

	public void setLlibelle(String llibelle) {
		Llibelle = llibelle;
	}

	public Collection<Inscrit> getInscrit() {
		return inscrit;
	}

	public void addEtudiant(Etudiant3 e) {
		inscrit.add(new Inscrit(e, this));
	}

}

