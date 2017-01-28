package gra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class Podpowiedzi2 extends JPanel{

	public static final int WYMIAR_Xpod = 1;
	public static final int WYMIAR_Ypod = 6;
	
	private PolePod[][] pod2;
	
	public Podpowiedzi2(){
		
		setLayout(new GridLayout(Podpowiedzi2.WYMIAR_Ypod,Podpowiedzi2.WYMIAR_Xpod));
		
		pod2 = new PolePod[WYMIAR_Xpod][WYMIAR_Ypod];
		
		
		for (int i = 0; i < WYMIAR_Xpod; i++) {
			for (int j = 0; j < WYMIAR_Ypod; j++){
				Icon icon = null;
				PolePod podP2 = new PolePod("Pod",icon,i, j);
				pod2[i][j]=podP2;

				podP2.setPreferredSize(new Dimension(100, 100));
				podP2.setOpaque(true); 
				podP2.setBackground(Color.YELLOW);
				add(podP2);
			}
			
			pod2[0][0].setText("");
			pod2[0][1].setText("");
			pod2[0][2].setText("");
			pod2[0][3].setText("*D");
			pod2[0][4].setText("*D");
			pod2[0][5].setText("");
	}

}
}
