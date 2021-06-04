package rebuildJDR;

public class MainJDR {

	public static void main(String[] args) throws CharacterException {
		// TODO Auto-generated method stub
		/*
		Archer perso1 = (Archer) new Personnage("Bertha", 25, 1);
		//Object perso2 = new Personnage("John", 15, 1);
		Personnage perso3 = new Personnage("Cassandra", 10, 1);
		//System.out.println(perso2);
		*/

		Archer archer = new Archer("Maverick", 18, 1);
		Wizard wizard = new Wizard ("Cassandra", 10, 1);
		Warrior warrior = new Warrior("Bertha", 25, 1);
		Personnage [] persos = new Personnage [3] ;
		persos[0] = archer;
		persos[1] = wizard ;
		persos[2] = warrior ;
		for (Personnage unPerso : persos) {
			// LA MÉTHODE wololo() EST REFUSÉE PAR E COMPILO
			unPerso.wololo();
			System.out.println(unPerso.toString());
		}

	}
}
