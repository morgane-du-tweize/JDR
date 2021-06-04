package rebuildJDR;

public class Wizard extends Personnage {

	@Override
	public String toString() {
		return super.toString() + " classe : Wizard ";
	}

	public Wizard(String nom, int force, int niveau) throws CharacterException {
		super(nom, force, niveau);
		// TODO Auto-generated constructor stub
	}
	
	public void lancerSort(Personnage autrePerso) {
		System.out.println(this.getNom() + " lance une attaque foudroyante");
		degats(7);
	}
	
	@Override
	public void attaquer(Personnage autrePerso) {
		lancerSort(autrePerso);
	}
	
	public void wololo() {
		System.out.println("Wololooooooo");
	}

}
