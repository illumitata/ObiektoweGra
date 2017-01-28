package gra;

import javax.swing.*;

public class PolePod extends JLabel {
	
	public PolePod(String nazwapod, Icon icon, int i, int j){
		
		super(nazwapod);
		this.i=i;
		this.j=j;
		//this.k = k;
	}
	private int i;
	private int j;
}
