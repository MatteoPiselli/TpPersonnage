package Personnage;

public class Personnage {
	// les attributs
	private String nom;
	private int vie;

	// le constructeur
	public Personnage(String name, int life) {
		this.nom = name;
		this.vie = life;
	}

	// accesseur
	public String getNom() {
		return nom;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie=vie;
	}

	public boolean degat(int nb){
		setVie(this.vie-nb);
		if(getVie()>0)
			return true;
		return false;
	}

	public int attack(){
		return vie;
	}
	public int attack(int pt){
		return pt;
	}

	public int revive(int heal){
		setVie(this.vie+heal);
        return vie;
	}

	public int soleil(int chaud){
		setVie(this.vie-chaud);
		return vie;
	}
}
