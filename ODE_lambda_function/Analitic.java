public class Analitic extends Vettore{

// ---------------- uso delle condizioni iniziali------//
	
	public double[] analiticSolut(double a,double b,double c,double d,double e []){
	
	x_inferiore = a;
	x_superiore = b;
	delta_x     = c;
	lambda      = d;
//		  x  = e;

	System.out.println("\n\t Analitici:");

	double y_analitic [];
	y_analitic = new double [n];
	y_analitic[0] = ci.y_iniziale;

	for (int i=1; i<n; i++){
	
	y_analitic[i] = java.lang.Math.exp(-lambda*e[i]);
	

	System.out.print("\n" +  y_analitic[i] );

	} // for cycle

	return y_analitic;	


	} // membro analiticSolution



} // class
