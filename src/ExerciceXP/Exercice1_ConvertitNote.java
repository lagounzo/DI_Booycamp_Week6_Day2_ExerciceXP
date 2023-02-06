	/*
 Exercice 1 : 
 
 Convertit Les Notes De 100 Points
								
								
Écrivez un programme Java qui convertit les notes de 100 points en notes alphabétiques.
								 */


package ExerciceXP;

import java.util.Scanner;

public class Exercice1_ConvertitNote {

	public Exercice1_ConvertitNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println(" Entrer une valeur ");

		try (Scanner convertir = new Scanner(System.in)) {
			int valleur = convertir.nextInt();

			if (valleur <= 100 && valleur >= 93) {

				// System.out.println (" Entrer une valeur comprise entre 93-100 ") ;
				System.out.println(" Votre classement par lettre est : UN ");
			}

			if (valleur <= 92 && valleur >= 90 ) {

				// System.out.println (" Entrer une valeur comprise entre 90-92 ") ;
				System.out.println(" Votre classement par lettre est : A- ");
			}
			
			if (valleur <= 89 && valleur >= 87 ) {

				// System.out.println (" Entrer une valeur comprise entre 89-87 ") ;
				System.out.println(" Votre classement par lettre est : B+ ");
			}
			
			if (valleur <= 83 && valleur >= 86 ) {

				// System.out.println (" Entrer une valeur comprise entre 83-86 ") ;
				System.out.println(" Votre classement par lettre est : B ");
			}
			
			if (valleur <= 80 && valleur >= 82 ) {

				// System.out.println (" Entrer une valeur comprise entre 80-82 ") ;
				System.out.println(" Votre classement par lettre est : B- ");
			}
			
			if (valleur <= 79 && valleur >= 77 ) {

				// System.out.println (" Entrer une valeur comprise entre 79-77 ") ;
				System.out.println(" Votre classement par lettre est : C+ ");
			}
			
			if (valleur <= 70 && valleur >= 76 ) {

				// System.out.println (" Entrer une valeur comprise entre 70-76 ") ;
				System.out.println(" Votre classement par lettre est : C ");
			}
			
			if (valleur <= 60 && valleur >= 69 ) {

				// System.out.println (" Entrer une valeur comprise entre 60-69 ") ;
				System.out.println(" Votre classement par lettre est : ré ");
			}
			
			if (valleur <=69  && valleur == 0 ) {

				// System.out.println (" Entrer une valeur comprise entre 069 ") ;
				System.out.println(" Votre classement par lettre est : F ");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
