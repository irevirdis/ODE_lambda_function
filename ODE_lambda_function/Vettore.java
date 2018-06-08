public class Vettore{

  //--------------- 	VARIABILI MEMBRO -----------------//
		  // Condizioni iniziali

		  // istanza delle condizioni iniziali dalla classe 
		  // apposita
		  CondIniz ci = new CondIniz();

		  double x_inferiore = ci.x_iniziale;
		  double x_superiore = ci.x_finale;
		  double delta_x = ci.delta_x;
		  double lambda = ci.lambda;
		  // lunghezza del vettore:

 int n =(int) ((x_superiore-x_inferiore)/delta_x);

 //--------------- METODO MEMBRO ----------------------//

// Costruzione del vettore
	public double[] build_X(){
	double x []; 
	x = new double[n];
	x [0] = x_inferiore;

	System.out.println("\n\t Vettore X:");
	
	for ( int i=1; i<n; i++ )
	{
	x [i] = x [i-1] + delta_x;

		System.out.print("\n" + x [i]);
//		System.out.println("\n da classe vettore: \t lunghezza di X: \t" + n);
	}// for cycle


	return x;	
	} // build_X


}// class
