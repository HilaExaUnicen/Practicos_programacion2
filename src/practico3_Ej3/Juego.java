package practico3_Ej3;

import java.util.ArrayList;

public class Juego {
	private String nombreJuego;
	private Jugador j1;
	private Jugador j2;
	private ArrayList<Personaje> personajes;
	
	public Juego(String nombreJuego, Jugador j1, Jugador j2){
		this.nombreJuego= nombreJuego;
		this.j1 = j1;
		this.j2 = j2;
		personajes = new ArrayList();
	}
	
	
	public void addPersonajesRandomAMazoJugador(Jugador j) {
		int contador = 0;
		int posRandom;
		int tamanioArray = this.personajes.size();
		while(contador < 3) {
			posRandom = (int)(Math.random() * tamanioArray);
			j.addPersonajesAMazo(this.personajes.get(posRandom));
			contador++;
		}
	}
	
	public void jugar() {
		ArrayList <Personaje> mazoj1 = j1.getMazoPersonajes();
		ArrayList <Personaje> mazoj2 = j2.getMazoPersonajes();
		System.out.println("");
		System.out.println("Empieza el juego, gana la carta con mayor fuerza");
		System.out.println("");
		
		for(int i = 0; i < 3; i++) {
			
			int fuerzaJ1 = mazoj1.get(i).getFuerza();			
			int fuerzaJ2 = mazoj2.get(i).getFuerza();
			
			System.out.println("Ronda " + (i+1));
			
			if(fuerzaJ1 > fuerzaJ2) {
				System.out.println("Gana j1");
				System.out.println("");
				j1.incrementarPuntos();
			}
			else if(fuerzaJ2 > fuerzaJ1) {
				System.out.println("Gana j2");
				System.out.println("");
				j2.incrementarPuntos();
			}
			else {
				System.out.println("Empate");
				System.out.println("");
			}
		}
	}
	
	public String getGanador() {
		if(j1.getCantPuntos() > j2.getCantPuntos()) {
			return "Ganador Jugador 1 con " + j1.getCantPuntos() + " puntos!";
		}
		else if (j2.getCantPuntos() > j1.getCantPuntos()) {
			return "Ganador Jugador 2 con " + j2.getCantPuntos() + " puntos!";
		}
		else {
			return "Empate";
		}
	}
	
	public void addPersonaje(Personaje p) {
		personajes.add(p);
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}
	
	
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Jugador 1");
		Jugador j2 = new Jugador("Jugador 2");
		Juego juegoDeCartas = new Juego("Juego de cartas", j1, j2);
		
		SuperHeroe heroe1 = new SuperHeroe("Juan", "Super gridito", 90, 30, 120, 30, 1.85,80);//nombre, nombreSuper, velocidad, vision, fuerza, edad, altura, peso;
		SuperHeroe heroe2 = new SuperHeroe("Changuito", "Superman", 130, 100, 150, 30, 1.85,80);
		SuperHeroe heroe3 = new SuperHeroe("Pipa", "Batman", 100, 20, 120, 30, 1.85,80);
		SuperHeroe heroe4 = new SuperHeroe("Chris", "Capitan america", 70, 30, 170, 30, 1.85,80);
		SuperHeroe heroe5 = new SuperHeroe("Vicente", "Vicente Viloni", 70, 10, 80, 30, 1.85,80);
		SuperHeroe heroe6 = new SuperHeroe("Juan", "Goku", 100, 90, 400, 30, 1.85,80);
		Villano villano1 = new Villano("Vlad", "Pinguino", 50, 100, 20, 56, 1.80, 69);
		Villano villano2 = new Villano("Vlad", "Thanos", 80, 80, 100, 120, 1.80, 69);
		Villano villano3 = new Villano("Vlad", "Calaca roja", 80, 100, 20, 30, 1.80, 69);
		Villano villano4 = new Villano("Vlad", "Doofensmirtz", 80, 100, 20, 30, 1.80, 69);
		juegoDeCartas.addPersonaje(heroe1);
		juegoDeCartas.addPersonaje(heroe2);
		juegoDeCartas.addPersonaje(heroe3);
		juegoDeCartas.addPersonaje(heroe4);
		juegoDeCartas.addPersonaje(heroe5);
		juegoDeCartas.addPersonaje(heroe6);
		juegoDeCartas.addPersonaje(villano1);
		juegoDeCartas.addPersonaje(villano2);
		juegoDeCartas.addPersonaje(villano3);
		juegoDeCartas.addPersonaje(villano4);
		
		juegoDeCartas.addPersonajesRandomAMazoJugador(j1);
		juegoDeCartas.addPersonajesRandomAMazoJugador(j2);
		
		ArrayList <Personaje> mazoj1 = j1.getMazoPersonajes();
		ArrayList <Personaje> mazoj2 = j2.getMazoPersonajes();
		
		
		System.out.println("Mazo jugador1 : ");
		for(int i = 0; i < mazoj1.size(); i++) {
			System.out.println(mazoj1.get(i));
		}
		System.out.println("");
		
		System.out.println("Mazo jugador2 : ");
		for(int i = 0; i < mazoj2.size(); i++) {
			System.out.println(mazoj2.get(i));
		}
		
		juegoDeCartas.jugar();
		System.out.println("");
		System.out.println(juegoDeCartas.getGanador());
		

		
		
	}
	
	
}