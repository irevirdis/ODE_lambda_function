public class Innesco{

public static void main(String args[]){

// ------- istanza per la costruzione delle X ------//
//
		Vettore x = new Vettore();
//		x.build_X();


//---------- istanza per backward euler-------------//
 
		BE be = new BE();

// 		be.verifica(); // è commentata

		be.buildArray(be.coeff_y_i_uno,be.coeff_y_i_due,be.i_iniziale,be.o_grande);


//---------- istanza per forward euler-------------//
 
		FE fe = new FE();

		fe.buildArray(fe.coeff_y_i_uno,fe.coeff_y_i_due,fe.i_iniziale,fe.o_grande);


//---------- istanza per leap frog ----------------//
 
		LF lf = new LF();

		lf.buildArray(lf.coeff_y_i_uno,lf.coeff_y_i_due,lf.i_iniziale,lf.o_grande);


// ----------- classe per soluzione analitica ------//

		Analitic analitic = new Analitic();
		analitic.analiticSolut(x.x_inferiore,x.x_superiore,x.delta_x,x.lambda,x.build_X());

//------------- classe per raggruppare i risultati---//
//
//

//		BuildMatrix matrix = new BuildMatrix();
//		matrix.raggruppa();



} // chiude il main

} // chiude la classe principale
