package gra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class Podpowiedzi3 extends JPanel{

	public static final int WYMIAR_Xpod = 1;
	public static final int WYMIAR_Ypod = 6;
	
	private PolePod[][] pod3;
	
	public Podpowiedzi3(){
		setLayout(new GridLayout(Podpowiedzi3.WYMIAR_Ypod,Podpowiedzi3.WYMIAR_Xpod));
		
		pod3 = new PolePod[WYMIAR_Xpod][WYMIAR_Ypod];
		
		
		for (int i = 0; i < WYMIAR_Xpod; i++) {
			for (int j = 0; j < WYMIAR_Ypod; j++){
				Icon icon = null;
				PolePod podP3 = new PolePod("Pod",icon,i, j);
				pod3[i][j]=podP3;

				podP3.setPreferredSize(new Dimension(100, 100));
				podP3.setOpaque(true); 
				podP3.setBackground(Color.YELLOW);
				add(podP3);
			}
			
			pod3[0][0].setText("");
			pod3[0][1].setText("");
			pod3[0][2].setText("");
			pod3[0][3].setText("*D");
			pod3[0][4].setText("*D");
			pod3[0][5].setText("");
	}
	}

}