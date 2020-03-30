package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tablero extends JFrame{
		
	Matriz matriz;
	JButton btnJugarT;

	public Tablero() {
		setTitle("tIctActoe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(515,500);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(207,234,235));;


		matriz = new Matriz();
		matriz.setBounds(50,20,400,300);
		
		add(matriz);


		btnJugarT = new JButton("Tablero");
		btnJugarT.setIcon(new ImageIcon("src/Imagenes/Jugar.png"));
		btnJugarT.setBounds(100,360,317,84);
		add(btnJugarT);

		setResizable(false);
		setLocationRelativeTo(null);
	}



	public Matriz getMatriz() {
		return matriz;
	}



	public void setMatriz(Matriz matriz) {
		this.matriz = matriz;
	}



	public JButton getBtnJugarT() {
		return btnJugarT;
	}

	public void setBtnJugarT(JButton btnJugarT) {
		this.btnJugarT = btnJugarT;
	}

}
