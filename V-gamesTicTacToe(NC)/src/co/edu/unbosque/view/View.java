package co.edu.unbosque.view;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	private JLabel Fondo;
	private JButton btninstrucciones;
	private JButton btnJugar;
	private JButton btnsalir;
	private Tablero tablero;


	Controller co;
	private static final long serialVersionUID = 1L;

	public View(Controller c) {

		super("tIctActoe");
		setLayout(null);
		setSize(515,560);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Botones(c);

		Fondo = new JLabel();
		Fondo.setIcon(new ImageIcon("src/Imagenes/Fondo.png"));
		Fondo.setBounds(0,0,500,534);
		add(Fondo);


		tablero = new Tablero();
		setVisible(true);

	}

	public void Botones(Controller c) {


		btninstrucciones = new JButton("instrucciones");
		btninstrucciones.setIcon(new ImageIcon("src/Imagenes/Instrucciones.png"));
		btninstrucciones.setBounds(90,200,335,80);//185,80
		btninstrucciones.addActionListener(c);
		add(btninstrucciones);

		

		btnJugar= new JButton("jugar");
		btnJugar.setIcon(new ImageIcon("src/Imagenes/Jugar.png"));
		btnJugar.setBounds(90,320,335,84);
		btnJugar.addActionListener(c);
		add(btnJugar);

		btnsalir= new JButton("salir");
		btnsalir.setIcon(new ImageIcon("src/Imagenes/Salida.png"));
		btnsalir.setBounds(399,421,100,100);
		btnsalir.addActionListener(c);
		add(btnsalir);


	}

	public JLabel getFondo() {
		return Fondo;
	}

	public void setFondo(JLabel fondo) {
		Fondo = fondo;
	}

	public JButton getBtninstrucciones() {
		return btninstrucciones;
	}

	public void setBtninstrucciones(JButton btninstrucciones) {
		this.btninstrucciones = btninstrucciones;
	}

	public JButton getBtnJugar() {
		return btnJugar;
	}

	public void setBtnJugar(JButton btnJugar) {
		this.btnJugar = btnJugar;
	}

	public JButton getBtnsalir() {
		return btnsalir;
	}

	public void setBtnsalir(JButton btnsalir) {
		this.btnsalir = btnsalir;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}


}
