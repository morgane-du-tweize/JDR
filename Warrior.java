package rebuildJDR;

public class Warrior extends Personnage{

	public Warrior(String nom, int force, int niveau) throws CharacterException {
		super(nom, force, niveau);
	}
	
	@Override
	public void attaquer(Personnage autrePerso) {
		frapper(autrePerso);
	}
	
	public void frapper(Personnage autrePerso) {
		System.out.println(this.getNom() + " sort son gourdin et frappe");
		autrePerso.degats(12);
	}
	

}
