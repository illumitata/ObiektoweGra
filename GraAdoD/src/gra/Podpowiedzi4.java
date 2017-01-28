package gra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class Podpowiedzi4 extends JPanel{

	public static final int WYMIAR_Xpod = 8;
	public static final int WYMIAR_Ypod = 1;
	
	private PolePod[][] pod4;
	
	public Podpowiedzi4(){
	setLayout(new GridLayout(Podpowiedzi4.WYMIAR_Ypod,Podpowiedzi4.WYMIAR_Xpod));
		
		pod4 = new PolePod[WYMIAR_Xpod][WYMIAR_Ypod];
		
		for (int j = 0; j < WYMIAR_Ypod; j++){
			for (int i = 0; i < WYMIAR_Xpod; i++) {
				Icon icon = null;
				PolePod podP = new PolePod("Pod",icon,i, j);
				pod4[i][j]=podP;

				podP.setPreferredSize(new Dimension(100, 100));
				podP.setOpaque(true); 
				podP.setBackground(Color.RED);
				add(podP);
			}
			
			
			pod4[0][0].setText("");
			pod4[1][0].setText("");
			pod4[2][0].setText("A");
			pod4[3][0].setText("");
			pod4[4][0].setText("*D");
			pod4[5][0].setText("*D");
			pod4[6][0].setText("");
			pod4[7][0].setText("");
	}
	}

}