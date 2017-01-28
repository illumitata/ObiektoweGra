package gra;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JPanel;

//import OknoGry.PoleAction;

public class Plansza extends JPanel {
	public static final int WYMIAR_X = 6;
	public static final int WYMIAR_Y = 6;

	public Pole[][] kratki;

	public Plansza()  {
		setLayout(new GridLayout(Plansza.WYMIAR_Y, Plansza.WYMIAR_X));
		
		kratki = new Pole[WYMIAR_X][WYMIAR_Y];
		
		for (int j = 0; j < WYMIAR_Y; j++) {
			for (int i = 0; i < WYMIAR_X; i++) {
				int k=0;
				Pole kratka = new Pole("",i,j,k);
				kratki[i][j]=kratka;

				kratka.setPreferredSize(new Dimension(100, 100));
				kratka.setBackground(Color.WHITE);
				add(kratka);
			}
		}
	}

	public Pole[][] getPole() {
		return kratki;
	}
}



