public class LF extends Taylor{

//--------- Attributo aggiuntivo ----//




// ------- condizioni iniziali ------//
	
		  CondIniz ci = new CondIniz();

//------ membro di verifica -----------//

	public void verifica(){
	
	System.out.println("LF c'è");

	} // metodo di verifica

//------- costruttore leap frog ------//

		public LF(){
		
				 o_grande      = 2;
				 coeff_y_i_uno = o_grande*ci.delta_x*(-ci.lambda);
				 i_iniziale    = 2;
				 coeff_y_i_due = 1;

				 System.out.println("\n\t Leapfrog:");
		
		} // costruttore


}// class

