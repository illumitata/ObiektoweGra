package gra;

import javax.swing.JOptionPane;

public class Wygrana {

	public Wygrana() {
		
		Pole[][] kratki = getPole();
		
		if( (kratki[0][0].getK()==3)&&(kratki[0][1].getK()==0)&&(kratki[0][2].getK()==1)&&(kratki[0][3].getK()==0)&&(kratki[0][4].getK()==4)&&(kratki[0][5].getK()==2)&&
			(kratki[1][0].getK()==0)&&(kratki[1][1].getK()==2)&&(kratki[1][2].getK()==3)&&(kratki[1][3].getK()==0)&&(kratki[1][4].getK()==1)&&(kratki[1][5].getK()==4)&&
			(kratki[2][0].getK()==2)&&(kratki[2][1].getK()==1)&&(kratki[2][2].getK()==0)&&(kratki[2][3].getK()==4)&&(kratki[2][4].getK()==3)&&(kratki[2][5].getK()==0)&&
			(kratki[3][0].getK()==4)&&(kratki[3][1].getK()==0)&&(kratki[3][2].getK()==2)&&(kratki[3][3].getK()==3)&&(kratki[3][4].getK()==0)&&(kratki[3][5].getK()==1)&&
			(kratki[4][0].getK()==1)&&(kratki[4][1].getK()==4)&&(kratki[4][2].getK()==0)&&(kratki[4][3].getK()==2)&&(kratki[4][4].getK()==0)&&(kratki[4][5].getK()==3)&&
			(kratki[5][0].getK()==0)&&(kratki[5][1].getK()==3)&&(kratki[5][2].getK()==4)&&(kratki[5][3].getK()==1)&&(kratki[5][4].getK()==2)&&(kratki[5][5].getK()==0)
		){
			JOptionPane.showMessageDialog(null, "Ty to jesteœ jednak dobry dzik!\n U³o¿y³eœ wszystko jak trzeba.");
		}
	}
}
