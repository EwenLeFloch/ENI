package m3LaCreationDeClasse.deZeroEnHeros;

import java.util.Random;

public class Heros {
	private String name;
	private int pv;
	private int attack;
	private int esquive;
	private int defense;
	private int vitesse;
	private int critique;
	
	public Heros(String name, int pv, int attack, int esquive, int defense, int vitesse, int critique) {
		super();
		this.name = name;
		this.pv = pv;
		this.attack = attack;
		this.esquive = esquive;
		this.defense = defense;
		this.vitesse = vitesse;
		this.critique = critique;
	}
	
	public boolean estVivant() {
		return pv > 0;
	}
	public void attaquer (Heros autreHeros) {
		if (this.estVivant()) {
			System.out.println("###############################");
			Random random = new Random();
			int esquiveRandom = random.nextInt(100) + 1;
			
			int degats = attack-autreHeros.defense;
			int critiqueRandom = random.nextInt(100) + 1;
			
			System.out.println(this.name + " attaque " + autreHeros.name + " !");
			if (autreHeros.esquive > esquiveRandom) {
				System.out.println(autreHeros.name + " a esquivé l'attaque ! " + autreHeros.esquive+ ">" +esquiveRandom );
				return;
			}
			if (this.critique > critiqueRandom) {
				System.out.println(this.name + " a doublé ses dégats ! " + this.critique+ ">" + critiqueRandom);
				degats *= 2;
			}
			autreHeros.pv -= degats > 0 ? degats : 0;
		}
		
	}
	
	public int getEsquive() {
		return esquive;
	}

	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getCritique() {
		return critique;
	}

	public void setCritique(int critique) {
		this.critique = critique;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
			return name + " (PV : " + pv + " - Atk : " + attack +")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
	
	
}
