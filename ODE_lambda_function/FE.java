public class FE extends Taylor{

//----- istanza per le condizioni iniziali-----//

		CondIniz ci = new CondIniz();

// ------ membro di verifica ----------//

		public void verifica (){
		
		System.out.println("FE c'è");

		} // verifica


//----------- costruttore -------------//

		public FE(){

				  coeff_y_i_due = 0;
				  coeff_y_i_uno = (1-ci.lambda*ci.delta_x);
				  i_iniziale  = 1 ;
				  o_grande    = 1;
				System.out.println("\n\t Forward euler:");		
//				  System.out.println("Da costruttore FE \t: coeff y_(i-1)=" + coeff_y_i_uno);
		
		} // costruttore

} // class
