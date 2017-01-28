package gra;

import javax.swing.JButton;


public class Pole extends JButton {
	
	

	public Pole(String nazwa, int i,int j, int k){
		super(nazwa);
		this.i=i;
		this.j=j;
		//this.k = k;
	}
	
	private int i;
	private int j;
	private int k;
	
	public int getK() {
		return k;
	}
	
	public void setWartoœæ(int k) {
		this.k = k;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	
}
