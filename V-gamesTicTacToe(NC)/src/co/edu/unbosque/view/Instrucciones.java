package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import co.edu.unbosque.controller.Controller;

public class Instrucciones extends JFrame{

	JLabel insti;
	JButton btnVolver; 
	JButton btnLogo; 

	private static final long serialVersionUID = 1L;

	public Instrucciones(Controller c) {

		super("tIctActoe");
		setLayout(null);
		setSize(515,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(207,234,235));	
		
		insti = new JLabel();
		insti.setIcon(new ImageIcon("src/Imagenes/txtInstu.png"));
		insti.setBounds(30,20,430,340);
		add(insti);


		btnVolver= new JButton("volver");
		btnVolver.setIcon(new ImageIcon("src/Imagenes/Volver.png"));
		btnVolver.setBounds(425,370,80,90);
		btnVolver.addActionListener(c);
		add(btnVolver);
		
		btnLogo= new JButton("logo");
		btnLogo.setIcon(new ImageIcon("src/Imagenes/logo.png"));
		btnLogo.setBounds(0,370,80,90);
		btnLogo.addActionListener(c);
		add(btnLogo);

	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnLogo() {
		return btnLogo;
	}

	public void setBtnLogo(JButton btnLogo) {
		this.btnLogo = btnLogo;
	}
	
	

}
