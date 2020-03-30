package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Matriz extends JPanel{

	private static final long serialVersionUID = 1L;
	JTextField a;
	JTextField b;
	JTextField c;
	JTextField d;
	JTextField e;
	JTextField f;
	JTextField g;
	JTextField h;
	JTextField i;

	public Matriz() {

		GridLayout matriz= new GridLayout(1,1);
		setLayout(matriz);

		Font fuente=new Font("Engravers MT", Font.BOLD, 36);
		a = new JTextField(1);
		a.setBackground(new Color(153,214,171));
		a.setFont(fuente);
		a.setHorizontalAlignment(a.CENTER);
		b = new JTextField(1);
		b.setBackground(new Color(153,214,171));
		b.setFont(fuente);
		b.setHorizontalAlignment(b.CENTER);
		c = new JTextField(1);
		c.setBackground(new Color(153,214,171));
		c.setFont(fuente);
		c.setHorizontalAlignment(b.CENTER);
		d = new JTextField(1);
		d.setBackground(new Color(153,214,171));
		d.setFont(fuente);
		d.setHorizontalAlignment(b.CENTER);
		e = new JTextField(1);
		e.setBackground(new Color(153,214,171));
		e.setFont(fuente);
		e.setHorizontalAlignment(b.CENTER);
		f = new JTextField(1);
		f.setBackground(new Color(153,214,171));
		f.setFont(fuente);
		f.setHorizontalAlignment(b.CENTER);
		g = new JTextField(1);
		g.setBackground(new Color(153,214,171));
		g.setFont(fuente);
		g.setHorizontalAlignment(b.CENTER);
		h = new JTextField(1);
		h.setBackground(new Color(153,214,171));
		h.setFont(fuente);
		h.setHorizontalAlignment(b.CENTER);
		i = new JTextField(1);
		i.setBackground(new Color(153,214,171));
		i.setFont(fuente);
		i.setHorizontalAlignment(b.CENTER);


		JPanel triqui = new JPanel();
		triqui.setLayout(new GridLayout(3,2));

		triqui.add(a);
		triqui.add(b);
		triqui.add(c);
		triqui.add(d);
		triqui.add(e);
		triqui.add(f);
		triqui.add(g);
		triqui.add(h);
		triqui.add(i);

		add(triqui);
	}

	public void actualizarVista(String matriz[][]) {
		a.setText(matriz[0][0]);
		b.setText(matriz[0][1]);
		c.setText(matriz[0][2]);
		d.setText(matriz[1][0]);
		e.setText(matriz[1][1]);
		f.setText(matriz[1][2]);
		g.setText(matriz[2][0]);
		h.setText(matriz[2][1]);
		i.setText(matriz[2][2]);
	}

	public void verificarEdicion() {

		if(!a.getText().equalsIgnoreCase("")) {

			a.setEditable(false);

		}
		if(!b.getText().equalsIgnoreCase("")) {

			b.setEditable(false);

		}
		if(!c.getText().equalsIgnoreCase("")) {

			c.setEditable(false);

		}
		if(!d.getText().equalsIgnoreCase("")) {

			d.setEditable(false);

		}
		if(!e.getText().equalsIgnoreCase("")) {

			e.setEditable(false);

		}
		if(!f.getText().equalsIgnoreCase("")) {

			f.setEditable(false);

		}
		if(!g.getText().equalsIgnoreCase("")) {

			g.setEditable(false);

		}
		if(!h.getText().equalsIgnoreCase("")) {

			h.setEditable(false);

		}
		if(!i.getText().equalsIgnoreCase("")) {

			i.setEditable(false);

		}
	}

	public void empate() {
		if(a != null && b!=null && c!=null
				&& d != null&& e != null && f != null
				&& g != null && h != null&& i != null){

			JOptionPane.showMessageDialog(null, "Empate. No pudimos");
		}
	}

	public JTextField getA() {
		return a;
	}

	public void setA(JTextField a) {
		this.a = a;
	}

	public JTextField getB() {
		return b;
	}

	public void setB(JTextField b) {
		this.b = b;
	}

	public JTextField getC() {
		return c;
	}

	public void setC(JTextField c) {
		this.c = c;
	}

	public JTextField getD() {
		return d;
	}

	public void setD(JTextField d) {
		this.d = d;
	}

	public JTextField getE() {
		return e;
	}

	public void setE(JTextField e) {
		this.e = e;
	}

	public JTextField getF() {
		return f;
	}

	public void setF(JTextField f) {
		this.f = f;
	}

	public JTextField getG() {
		return g;
	}

	public void setG(JTextField g) {
		this.g = g;
	}

	public JTextField getH() {
		return h;
	}

	public void setH(JTextField h) {
		this.h = h;
	}

	public JTextField getI() {
		return i;
	}

	public void setI(JTextField i) {
		this.i = i;
	}

}
