public class BuildMatrix{

/*
 * Raggruppamento delle approssimazioni in colonne 
 * di matrice: 
 *
 *			__ 1   2     3     4       5     _
 *			|                                 |
 *       |	X  y_fe  y_be  y_lf  y_analt   |
 *			|_                               _|
 *	
 */ 
			int metodi = 5;

// --------------- istanza per costruzione X ---------------//			
			Vettore x = new Vettore();

//----------------- array multidim -------------------------//


		  double risultati [][] = new double [x.n][metodi];
		
//-------------- istanze per usare metodi ------------------//

		       BE be = new BE();
		       FE fe = new FE();
		       LF lf = new LF();
 Analitic analitic = new Analitic();		  

//-------------- assegnazione colonne ----------------------//
//            e restituzione dell'output
//----------------------------------------------------------//

 		public double[][] raggruppa(){

		 System.out.println("\n\t Prima colonna di matrice:");
				 
		risultati[][1]={ be.buildArray(be.coeff_y_i_uno,be.coeff_y_i_due,be.i_iniziale,be.o.grande)};


		System.out.println(risultati[][1]);
		
		return risultati;

		} // metodo raggruppa
 	


} // class
