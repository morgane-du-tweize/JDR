package rebuildJDR;

public class Archer extends Personnage {

	public Archer(String nom, int force, int niveau) throws CharacterException {
		super(nom, force, niveau);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attaquer(Personnage autrePerso) {
		tirer(autrePerso);
	} 

	public void tirer(Personnage autrePerso) {
		System.out.println(getNom() + " tire une flèche sur " + autrePerso.getNom());
		autrePerso.degats(8);
	}
	
}
