
public class Motorino {
	String colore;
	float velocita;
	String tipo;
	boolean antifurto=false;
	
	public Motorino(String colore, float velocita, String tipo) {

		this.colore = colore;
		this.velocita = velocita;
		this.tipo = tipo;
	}

	public float getVelocita() {
		return velocita;
	}
	
	public void accelera(float v){
		if(antifurto==false){
			velocita += v;
		}
	}
	
	public void inserisciAntifurto(){
		antifurto=true;
	}
	

}
