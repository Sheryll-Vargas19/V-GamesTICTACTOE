package co.edu.unbosque.controller;

import static co.edu.unbosque.model.Juego.FICHA_PC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Juego;
import co.edu.unbosque.view.Instrucciones;
import co.edu.unbosque.view.Tablero;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	public Tablero gui;
	public Juego juego;
	private View inicio;
	//private ArchivoFile texto;
	private Instrucciones reglas;
	private String matriz[][] = new String[3][3];

	public Controller () {
		gui = new Tablero();
		juego = new Juego(null);
		reglas = new Instrucciones(this);
		//texto = new ArchivoFile();

		gui.getBtnJugarT().addActionListener(this);
		inicio= new View(this);
	}

	public void obtenerMatriz(){
		matriz[0][0] = gui.getMatriz().getA().getText().trim();
		matriz[0][1] = gui.getMatriz().getB().getText().trim();
		matriz[0][2] = gui.getMatriz().getC().getText().trim();
		matriz[1][0] = gui.getMatriz().getD().getText().trim();
		matriz[1][1] = gui.getMatriz().getE().getText().trim();
		matriz[1][2] = gui.getMatriz().getF().getText().trim();
		matriz[2][0] = gui.getMatriz().getG().getText().trim();
		matriz[2][1] = gui.getMatriz().getH().getText().trim();
		matriz[2][2] = gui.getMatriz().getI().getText().trim();


		for (int i = 0; i < matriz.length; i++) {
			//System.out.println(matriz);
		}
		juego.setMatriz(matriz);


		if (juego.ganarPersona()== null) {
			if(juego.estadoRiesgo()!= null){
				int[] posicion1 = juego.estadoRiesgo();
				juego.seleccionarCasilla(posicion1[0], posicion1[1], FICHA_PC);
			}else {
				boolean colocado1= false;
				do { int i = (int)(Math.random()*3);
				int j =(int)(Math.random()*3);
				colocado1=juego.seleccionarCasilla(i, j, FICHA_PC);
				} 
				while (colocado1==false);
				//System.out.println("3");
			}
			this.gui.getMatriz().actualizarVista(juego.getMatriz());
			juego.ganarPC();
			juego.empate();

		} 
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getActionCommand().equals("instrucciones")){

			inicio.setVisible(false);
			reglas.setVisible(true);


		}else if(e.getActionCommand().equals("jugar")) {

			inicio.setVisible(false);
			gui.setVisible(true);

		}else if(e.getActionCommand().equals("salir")) {

			inicio.setVisible(false);

		}else if(e.getActionCommand().equals("volver")) {

			reglas.setVisible(false);
			inicio.setVisible(true);

		}else if(e.getActionCommand().equals("logo")) {

			JOptionPane.showMessageDialog(null, "                © V- Games © \n "
					+ "Gerente: Sheryll Vargas\n "
					+ "Arquitecto: Daniela Victoria \n "
					+ "Desarrollador: Juan Vargas \n "
					+ "Cliente: Ricardo Camargo");

		}if (e.getActionCommand().equals("Tablero")) {
			obtenerMatriz();
			gui.getMatriz().verificarEdicion();
		}


	}
}