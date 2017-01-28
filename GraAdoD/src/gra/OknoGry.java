package gra;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OknoGry extends JFrame implements ActionListener{

	public MenuGry menuBar = new MenuGry();
	Plansza plansza = new Plansza();
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
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object g = e.getSource();
		
	}
		
}

