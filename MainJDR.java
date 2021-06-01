package rebuildJDR;

public class MainJDR {

	public static void main(String[] args) throws CharacterException {
		// TODO Auto-generated method stub
		Personnage perso1 = new Personnage("Bertha", 25, 1);
		Personnage perso2 = new Personnage("John", 15, 1);
		Personnage perso3 = new Personnage("Cassandra", 10, 1);

		Archer archer = new Archer("Maverick", 18, 1);
		
		archer.attaquer(perso2);
		perso2.caracteristiques();
		
	}
}
