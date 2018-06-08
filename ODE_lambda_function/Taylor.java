public class Taylor{

		  /*
			*  Classe per l'astrazione dei metodi di Eulero
			*/

//--------------- Attributi: variabili membro------------//

		  public double coeff_y_i_uno;
		  public double coeff_y_i_due;
		  
		  public int i_iniziale;

		  public int o_grande;

//--------------- Metodo membro-------------------------//

		public double[] buildArray(double a, double b, int c, int d){

				  coeff_y_i_uno = a;
				  coeff_y_i_due = b;
				  i_iniziale = c;
				  o_grande = d;


				  // 1 ) istanza per usare la lunghezza di X
       		  Vettore x_vett = new Vettore();
	           // 2 ) istanza per le condizioni iniziali su y
				  CondIniz ci = new CondIniz();

		double y_istante_gen [];
		y_istante_gen = new double [x_vett.n];
		y_istante_gen [0] = ci.y_iniziale;

		if (o_grande==2){
             
		 y_istante_gen [1] = (1-ci.lambda*ci.delta_x)*y_istante_gen[0];
		
				  for ( int i=i_iniziale; i< (x_vett.n); i++){

		y_istante_gen[i] = (coeff_y_i_uno*y_istante_gen[i-1]) + coeff_y_i_due*y_istante_gen[i-2];
	
		System.out.println(y_istante_gen [i]);
		} // for
		} // if

		else {
				  for (int i=i_iniziale; i<x_vett.n; i++){
		y_istante_gen [i] = (coeff_y_i_uno*y_istante_gen [i-1]);
	
		System.out.println(y_istante_gen [i]);
		} // for
		} // else
		 
//		System.out.println("da buildarray di taylor: coeff y_(i-1)\t:" + coeff_y_i_uno);
//		System.out.println(y_istante_gen.length);

		return y_istante_gen;

		
		} // buildArray

} // class
