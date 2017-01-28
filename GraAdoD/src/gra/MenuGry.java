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
	JMenuItem mPrzywróæ;
	
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
		mPrzywróæ = new JMenuItem("Przywróæ ruch");
		
		menuHistoria.add(mCofnij);
		menuHistoria.add(mPrzywróæ);
		
		mCofnij.addActionListener(this);
		mPrzywróæ.addActionListener(this);
		
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
				"W ka¿dym rzêdzie i w ka¿dej kolumnie diagramu na rysunku powinny znaleŸæ siê cztery litery \n - A, B, C, D - oraz dwa puste pola. \n Przy brzegu diagramu umieszczone s¹ podpowiedzi. \n Ka¿da z nich okreœla i wskazuje pierwsz¹ (z gwiazdk¹) lub drug¹ (bez gwiazdki) \n literê w danym rzêdzie lub kolumnie - patrz¹c od strony strza³ki. \n Korzystaj¹c z tych podpowiedzi, nale¿y wype³niæ diagram 24 literami. \n\n Twórca: Jan Iwaszkiewicz i spó³ka", 
				"Jak w to graæ?", 
				JOptionPane.INFORMATION_MESSAGE);
	
		if(z ==  mZapisz){
			JOptionPane.showMessageDialog(null, "Zapisano w pliku","Zapis",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
}
}

