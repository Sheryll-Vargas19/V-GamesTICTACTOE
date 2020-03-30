package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Juego {

	public static final String FICHA_JUGADOR = "X";
	public static final String FICHA_PC = "O";

	private String jugador;
	private String matriz[][] = new String[3][3];
	private boolean turno;
	private boolean ganador;

	public Juego(String jugador) {
		ganador = false;

		this.jugador = jugador;
		turno = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = null;
			}

		}

	}

	public boolean seleccionarCasilla(int pi, int pj, String ficha) {

		boolean x = false;
		if (matriz[pi][pj].equals("")) {
			matriz[pi][pj] = ficha;	
			x = true;

			turno =! turno;
		}
		return x;
	}

	public int[] PCQuiereGanar() {
		int[] posicion = new int[2];
		int ocupados;

		//ganar por filas
		for (int i = 0; i < matriz.length; i++) 
		{
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++)
			{
				if(matriz[i][j].equals(FICHA_PC)) {
					ocupados = ocupados+1;
				}
				else if (matriz[i][j].equals(FICHA_JUGADOR))
				{
					ocupados = 0;
					break;
				}
				else 
				{
					posicion[0]=i;
					posicion[1]=j;
				}
			}
			
			if(ocupados==2) {
				//System.out.println("ganar por filas");
				return posicion;
			}

		}

		//ganar por columnas

		for (int j = 0; j < matriz.length; j++) {
			
			ocupados = 0;
			for (int i = 0; i < matriz.length; i++) 
			{
				if(matriz[i][j].equals(FICHA_PC)) 
				{
					ocupados = ocupados+1;
				}
				else if (matriz[i][j].equals(FICHA_JUGADOR)) 
				{
					ocupados = 0;
					break;
				}
				else 
				{
					posicion[0]=i;
					posicion[1]=j;
				}
			}
			if(ocupados==2) 
			{
				//System.out.println("ganar por columnas");
				return posicion;
			}
		}
		
		
		// ganar por diagonal principal
		ocupados = 0;
		for (int i = 0, j = 0; i < matriz.length; i++, j++) 
		{
			if(matriz[i][j].equals(FICHA_PC)) 
			{
				ocupados = ocupados+1;
			}
			else if (matriz[i][j].equals(FICHA_JUGADOR)) 
			{
				ocupados = 0;
				break;
			}
			else 
			{
				posicion[0]=i;
				posicion[1]=j;
			}
		}
		if(ocupados==2) 
		{
			System.out.println(" ganar diagonal principal");
			return posicion;
		}
		

		//verificar diagonal invertida
		ocupados = 0;
		for (int i = 0, j = 2; i < matriz.length; i++, j--) 
		{
			if(matriz[i][j].equalsIgnoreCase(FICHA_PC)) 
			{
				ocupados = ocupados+1;
			}
			else if (matriz[i][j].equals(FICHA_JUGADOR)) 
			{
				ocupados = 0;
				break;
			}
			else 
			{
				posicion[0]=i;
				posicion[1]=j;
			}
		}
		
		if(ocupados==2) {
			//System.out.println("ganar por diagonal invertida");
			return posicion;
		}

		return null;
	}

	public int[] estadoRiesgo() {

		int[] posicion = new int[2];
		int ocupados;

		//verificar filas
		ocupados = 0;
		for (int i = 0; i < matriz.length; i++) 
		{
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++) 
			{
				if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR))
				{
					ocupados = ocupados+1;
				}
				else if (matriz[i][j].equals(FICHA_PC)) 
				{
					ocupados = 0;
					break;
				}
				else 
				{
					System.out.println("i: " + i);
					System.out.println("j: " + j);
					posicion[0]=i;
					posicion[1]=j;
				}
			}
			
			if(ocupados==2) {
				System.out.println("verificar filas");
				System.out.println("a");
				return posicion;
			}
		}
	

		//verificar columnas

		ocupados = 0;
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
					ocupados = ocupados+1;
				}
				else if (matriz[i][j].equals(FICHA_PC)) {
					ocupados = 0;
					break;
				}
				else {
					posicion[0]=i;
					posicion[1]=j;
				}
			}
			
			if(ocupados==2) {
				System.out.println("verificar columnas");
				System.out.println("b");
				return posicion;
			}
		}
		

		// verificar diagonal principal
		ocupados = 0;
		for (int i = 0, j = 0; i < matriz.length; i++, j++) {
			if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
				ocupados = ocupados+1;
			}
			else if (matriz[i][j].equals(FICHA_PC)) {
				ocupados = 0;
				break;
			}
			else {
				posicion[0]=i;
				posicion[1]=j;
			}
		}
		if(ocupados==2) {
			System.out.println("c");
			System.out.println(" verificar diagonal principal");
			return posicion;
		}

		//verificar diagonal invertida
		ocupados = 0;
		for (int i = 0, j = 2; i < matriz.length; i++, j--) {
			if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
				ocupados = ocupados+1;
			}
			else if (matriz[i][j].equals(FICHA_PC)) {
				ocupados = 0;
				break;
			}
			else {
				posicion[0]=i;
				posicion[1]=j;
			}
		}
		if(ocupados==2) {
			System.out.println("d");
			System.out.println("verificar diagonal invertida");
			return posicion;
		}

		return null;

	}


	public String ganarPersona() {

		int[] posicion = new int[2];
		int ocupados;

		//ganador por filas
		for (int i = 0; i < matriz.length; i++) {
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
					ocupados = ocupados+1;
				}

			}
			if(ocupados== 3) {
				JOptionPane.showMessageDialog(null, "Hmm, me ganaste, ¡qué aburrido!", "V-Games // tIctActoe", JOptionPane.INFORMATION_MESSAGE);
				ganador = true;
				return "Ganaste";
			}

		}


		//ganador por columnas
		for (int i = 0; i < matriz.length; i++) {
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[j][i].equalsIgnoreCase(FICHA_JUGADOR)) {
					ocupados = ocupados+1;
				}

			}
			if(ocupados== 3) {
				JOptionPane.showMessageDialog(null, "Hmm, me ganaste, ¡qué aburrido!", "V-Games // tIctActoe", JOptionPane.INFORMATION_MESSAGE);
				ganador = true;
				return "Ganaste";
			}

		}


		//ganador por diagonal principal
		ocupados=0;
		for (int i = 0, j = 0; i < matriz.length; i++, j++) {
			if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
				ocupados = ocupados+1;
			}

			if(ocupados==3) {
				JOptionPane.showMessageDialog(null, "Hmm, me ganaste, ¡qué aburrido!", "V-Games // tIctActoe", JOptionPane.INFORMATION_MESSAGE);
				ganador = true;
				return "Ganaste";
			}
		}


		//ganador por diagonal invertida
		ocupados=0;
		for (int i = 2, j = 0; j < matriz.length; i--, j++) {
			if(matriz[i][j].equalsIgnoreCase(FICHA_JUGADOR)) {
				ocupados = ocupados+1;
			}

			if(ocupados==3) {
				JOptionPane.showMessageDialog(null, "Hmm, me ganaste, ¡qué aburrido!", "V-Games // tIctActoe", JOptionPane.INFORMATION_MESSAGE);
				ganador = true;
				return "Ganaste";
			}
		}

		return null;

	}

	public String ganarPC() {

		//int[] posicion = new int[2];
		int ocupados;

		//ganador por filas
		for (int i = 0; i < matriz.length; i++) {
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[i][j].equals(FICHA_PC)) {
					ocupados = ocupados+1;
				}

			}
			if(ocupados== 3) {
				JOptionPane.showMessageDialog(null, "¡Ja, ja te gané humano!");
				ganador = true;
			}

		}


		//ganador por columnas
		for (int i = 0; i < matriz.length; i++) {
			ocupados = 0;
			for (int j = 0; j < matriz.length; j++) {
				if(matriz[j][i].equals(FICHA_PC)) {
					ocupados = ocupados+1;
				}

			}
			if(ocupados== 3) {
				JOptionPane.showMessageDialog(null, "¡Ja, ja te gané humano!");
				ganador = true;
			}

		}


		//ganador por diagonal principal
		ocupados=0;
		for (int i = 0, j = 0; i < matriz.length; i++, j++) {
			if(matriz[j][i].equals(FICHA_PC)) {
				ocupados = ocupados+1;
			}

			if(ocupados==3) {
				JOptionPane.showMessageDialog(null, "¡Ja, ja te gané humano!");
				ganador = true;
			}
		}


		//ganador por diagonal invertida
		ocupados=0;
		for (int i = 0, j = 2; i < matriz.length; i++, j--) {
			if(matriz[j][i].equals(FICHA_PC)) {
				ocupados = ocupados+1;
			}

			if(ocupados==3) {
				JOptionPane.showMessageDialog(null, "¡Ja, ja te gané humano!");
				ganador = true;
			}
		}

		return null;

	}

	public String empate() {
		int ocupados = 0;

		for (int i = 0; i < matriz.length; i++) 
		{
			for (int j = 0; j < matriz.length; j++) 
			{
				if(matriz[i][j].equals(FICHA_PC) || matriz[i][j].equals(FICHA_JUGADOR)) {
					ocupados = ocupados+1;
				}
			}
		}
		
		if(ocupados== 9) 
		{
			JOptionPane.showMessageDialog(null, "Empate. No pudimos");
			return ("Empate");
		}


		return null;
	}



	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public boolean isGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	public static String getFichaJugador() {
		return FICHA_JUGADOR;
	}

	public static String getFichaPc() {
		return FICHA_PC;
	}



}

