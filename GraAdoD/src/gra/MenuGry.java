package gra;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuGry extends JMenuBar implements ActionListener{
	
	public JMenu menuOpcje;
	JMenu menuHistoria;
	JMenu menuPomoc;
	
	JMenuItem mZapisz;
	JMenuItem mWczytaj;
	JMenuItem mWyjscie;
	
	JMenuItem mCofnij;
	JMenuItem mPrzywr��;
	
	JMenuItem mZasadyGry;
	
	
	public MenuGry(){
		
		menuOpcje = new JMenu("Opcje");

		mZapisz = new JMenuItem("Zapisz...");
		mWczytaj = new JMenuItem("Wczytaj...");
		mWyjscie = new JMenuItem("Wyjdz");
		
		
		
		menuOpcje.add(mZapisz);
		menuOpcje.add(mWczytaj);
		menuOpcje.addSeparator();
		menuOpcje.add(mWyjscie);
		
		mZapisz.addActionListener(this);
		mWczytaj.addActionListener(this);
		mWyjscie.addActionListener(this);
		
		menuHistoria = new JMenu("Historia");
		
		mCofnij = new JMenuItem("Cofnij ruch");
		mPrzywr�� = new JMenuItem("Przywr�� ruch");
		
		menuHistoria.add(mCofnij);
		menuHistoria.add(mPrzywr��);
		
		mCofnij.addActionListener(this);
		mPrzywr��.addActionListener(this);
		
		menuPomoc = new JMenu("Pomoc");
		
		mZasadyGry = new JMenuItem("Zasady gry...");
		
		menuPomoc.add(mZasadyGry);
		
		mZasadyGry.addActionListener(this);
		
		
		
		this.add(menuOpcje);
		this.add(menuHistoria);
		this.add(menuPomoc);
		
	}

	public void actionPerformed(ActionEvent ee) {
		Object z = ee.getSource();
		
		if(z == mZasadyGry) JOptionPane.showMessageDialog(null, 
				"W ka�dym rz�dzie i w ka�dej kolumnie diagramu na rysunku powinny znale�� si� cztery litery \n - A, B, C, D - oraz dwa puste pola. \n Przy brzegu diagramu umieszczone s� podpowiedzi. \n Ka�da z nich okre�la i wskazuje pierwsz� (z gwiazdk�) lub drug� (bez gwiazdki) \n liter� w danym rz�dzie lub kolumnie - patrz�c od strony strza�ki. \n Korzystaj�c z tych podpowiedzi, nale�y wype�ni� diagram 24 literami. \n\n Tw�rca: Jan Iwaszkiewicz i sp�ka", 
				"Jak w to gra�?", 
				JOptionPane.INFORMATION_MESSAGE);
	
		if(z ==  mZapisz){
			JOptionPane.showMessageDialog(null, "Zapisano w pliku","Zapis",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
}
}

