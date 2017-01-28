package gra;

import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Icon;

public class Podpowiedzi extends JPanel{

	public static final int WYMIAR_Xpod = 8;
	public static final int WYMIAR_Ypod = 1;
	
	private PolePod[][] pod;
	
	public Podpowiedzi(){
		
		setLayout(new GridLayout(Podpowiedzi.WYMIAR_Ypod,Podpowiedzi.WYMIAR_Xpod));
		
		pod = new PolePod[WYMIAR_Xpod][WYMIAR_Ypod];
		
		for (int j = 0; j < WYMIAR_Ypod; j++){
			for (int i = 0; i < WYMIAR_Xpod; i++) {
				Icon icon = null;
				PolePod podP = new PolePod("Pod",icon,i, j);
				pod[i][j]=podP;
				
				podP.setPreferredSize(new Dimension(100, 100));
				podP.setOpaque(true); 
				podP.setBackground(Color.RED);
				add(podP);
			}
			
			try {
				pod[0][0].setIcon( new ImageIcon(ImageIO.read( new File("grafika/podpuste.png"))));
			} catch (IOException e) {
				pod[0][0].setText("");
			}
			pod[1][0].setText("");
			pod[2][0].setText("A");
			pod[3][0].setText("");
			pod[4][0].setText("*D");
			pod[5][0].setText("*D");
			pod[6][0].setText("");
			pod[7][0].setText("");
	}
	}
}


