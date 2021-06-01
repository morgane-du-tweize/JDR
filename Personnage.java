package rebuildJDR;

public class Personnage {

	private String nom ;
	private int force ;
	private int niveau ;
	private int maxHealth ;
	
	public Personnage(String nom, int force, int niveau) throws CharacterException {
		setNom(nom);
		setForce(force);
		setNiveau(niveau);
	}

	public String getNom() {
		return nom;
	}

		public void setNom(String nom) throws CharacterException {
			if (nom.length() < 3 || nom.length() > 10) {
				throw new CharacterException("Veuillez saisir un nom compris entre 3 et 10 caractères");
			}
			this.nom = nom;
		}

	public int getForce() {
		return force;
	}

	/* Toujours inférieur à maxHealth / 50 */
	public void setForce(int force) {
		this.force = force;
	}

	public int getNiveau() {
		return niveau;
	}

	
	/* toujours une valeur positive */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public void caracteristiques() {
		System.out.println(getNom() + " - " + getForce() + " - " + getNiveau());
	}

	public void degats(int degat) {
		this.force -= degat;
	}
	
	public void attaquer(Personnage autrePerso) {
		int puissance = this.force / 4 ;
		autrePerso.degats(puissance);
	}
}
