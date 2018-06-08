public class BE extends Taylor{

//------ istanza per usare le condizioni iniziali------//

		  CondIniz ci = new CondIniz();

//------------ metodo membro di verifica---------------//

public void verifica(){
//System.out.println("Da classe BE(membro=verifica()) \t: coeff di y_(i-1) \t:" + coeff_y_i_uno);
System.out.println("BE c'è");
}

// ---------------costruttore--------------------------//

		public BE() {

coeff_y_i_due = 0;
coeff_y_i_uno = 1/(1 + ci.lambda*ci.delta_x); 
i_iniziale = 1;
o_grande = 1;

System.out.println("\n\t Backward Euler: ");
//System.out.println("Da costruttore in BE: coeff y_(i-1) \t:" + coeff_y_i_uno);


} // costruttore 
} // class
