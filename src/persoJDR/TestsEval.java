package persoJDR;

import java.io.PrintStream;

public class TestsEval {

    // IL EST NORMAL QUE CE FICHIER NE COMPILE PAS TEL QUEL...

    public static void main(String[] args) {
	final int POINTS10 = 1, POINTS20 = 1, POINTS30 = 1, POINTS40 = 1, POINTS45 = 1, POINTS50 = 1, POINTS60 = 1,
		POINTS70 = 1, POINTS80 = 2, POINTS90 = 2, POINTS100 = 2, POINTS110 = 1;
	final int POINTS = POINTS10 + POINTS20 + POINTS30 + POINTS40 + POINTS45 + POINTS50 + POINTS60 + POINTS70
		+ POINTS80 + POINTS90 + POINTS100 + POINTS110;
	int somme = 0;
	PrintStream sout = System.out, serr = System.err;

	/* Test 10 : construction Troll */
	Personnage p = new Troll("trollTest");
	System.out.println("Test 10 : construction Troll(\"trollTest\") :: OK");
	somme += POINTS10;

	System.out.println("******************");

	/* Test 20 : Personnage.toString() */
	boolean test20 = p.toString().equals("Troll [Personnage [nom=trollTest, forcePhysique=10, forceMentale=42]]");
	(test20 ? sout : serr).printf("Test 20 : Personnage.toString().equals(CONTROLE)=true :: %b\n", test20);
	(test20 ? sout : serr).println(
		"Test 20 (contrôle) : Personnage.toString()=\"Troll [Personnage [nom=trollTest, forcePhysique=10, forceMentale=42]]\" :: "
			+ p);
	somme += test20 ? POINTS20 : 0;

	System.out.println("******************");

	/*
	 * Test 30 : classe Personnage doit être abstract
	 */
//		Personnage p30 = new Personnage();
	boolean test30;

	somme += test30 ? POINTS30 : 0;

	System.out.println("******************");

	/* Test 40 : Personnage.getNom/setNom */

	boolean test40;

	somme += test40 ? POINTS40 : 0;

	System.out.println("******************");

	/*
	 * Test 45 : autres Personnage.getters/setters
	 */
	boolean test45;

	somme += (test45 ? POINTS45 : 0);

	System.out.println("******************");

	/*
	 * Test 50 : Personnage.joue() abstrait, Troll.joue() concret
	 */

	boolean test50;

	somme += (test50 ? POINTS50 : 0);

	System.out.println("******************");

	/*
	 * Test 60 : constructeur Personnage par défaut : nom par défaut : monPerso2
	 */
	boolean test60;

	somme += test60 ? POINTS60 : 0;

	System.out.println("******************");

	/* Test 70 : Chevalier.toString() */
	boolean test70;

	somme += test70 ? POINTS70 : 0;

	System.out.println("******************");

	/* Test 80 : */
	boolean test80;

	somme += (test80 ? POINTS80 : 0);

	System.out.println("******************");

	/* Test 90 */
	boolean test90;

	somme += (test90 ? POINTS90 : 0);

	System.out.println("******************");

	/* Test 100 */
	boolean test100;

	somme += (test100 ? POINTS100 : 0);

	System.out.println("******************");

	/* Test 110 */
	boolean test110;

	somme += (test110 ? POINTS110 : 0);

	System.out.println("******************");
	System.out.println("******************");

	/* RESULTAT */
	System.out.printf("TOTAL=%d / %d\n", somme, POINTS);
    }
}
