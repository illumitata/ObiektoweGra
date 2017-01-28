package gra;

import java.awt.BorderLayout;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class OknoGry extends JFrame implements ActionListener{

	public MenuGry menuBar = new MenuGry();
	Plansza plansza = new Plansza();
	Wygrana wygrana = new Wygrana();
	Podpowiedzi podpowiedzipoziom1 = new Podpowiedzi();
	Podpowiedzi2 podpowiedzipion1 = new Podpowiedzi2();
	Podpowiedzi3 podpowiedzipion2 = new Podpowiedzi3();
	Podpowiedzi4 podpowiedzipoziom2 = new Podpowiedzi4();
	BorderLayout borderki = new BorderLayout();

	public OknoGry(){
		setSize(600,600);
		setTitle("Gra A do D - Projekt");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	
		//MenuGry menuBar = new MenuGry();
		setJMenuBar(menuBar);
		setVisible(true);
		
		Container cp = getContentPane();
		
		//cp.setLayout(new BorderLayout());
		
		cp.add(podpowiedzipoziom1, BorderLayout.NORTH);
		setVisible(true);
		
		cp.add(podpowiedzipion1, BorderLayout.WEST);
		setVisible(true);
		
		cp.add(plansza, BorderLayout.CENTER);
		setVisible(true);
		
		cp.add(podpowiedzipion2, BorderLayout.EAST);
		setVisible(true);
		
		cp.add(podpowiedzipoziom2, BorderLayout.SOUTH);
		setVisible(true);
		
		pack();
		
		StworzPrzyciski();
		
	}
	
	
//===========================================================================================
//===========================================================================================
//===========================================================================================
//===========================================================================================
//===========================================================================================
	
	
	private void StworzPrzyciski(){
		Pole[][] pole = plansza.getPole();
		for (int j = 0; j < Plansza.WYMIAR_Y; j++) {
			for (int i = 0; i < Plansza.WYMIAR_X; i++) {
				pole[i][j].addActionListener(new PoleAction(i,j));

			}
		}
	}
	
	class PoleAction implements ActionListener {
		int x, y;
		int wartoœæ;
		
		PoleAction(int x, int y) {
			this.x = x;
			this.y = y;
			//this.wartoœæ = wartoœæ;
		}

public void actionPerformed(ActionEvent e) {
			
			Pole[][] kratki = plansza.getPole();
			
			if(kratki[x][y].getK()==0){
				kratki[x][y].setText("A");
				kratki[x][y].setWartoœæ(1);
				new Wygrana();
			return;	
			}
			
			if(kratki[x][y].getK()==1){
				kratki[x][y].setText("B");
				kratki[x][y].setWartoœæ(2);
				new Wygrana();
			return;	
			}
			
			if(kratki[x][y].getK()==2){
				kratki[x][y].setText("C");
				kratki[x][y].setWartoœæ(3);
				new Wygrana();
			return;	
			}
			
			if(kratki[x][y].getK()==3){
				kratki[x][y].setText("D");
				kratki[x][y].setWartoœæ(4);
				Wygrana();
			return;	
			}
			
			if(kratki[x][y].getK()==4){
				kratki[x][y].setText("");
				kratki[x][y].setWartoœæ(0);
				wygrana.Wygrana();
			return;
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
}


