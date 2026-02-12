package cycles;
public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec(double braquet, double facteurPuissanceMoteur) {
		super(braquet);
		this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double DEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		VeloElec.DEFAUT_FACTEUR_PUISSANCE_MOTEUR=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur=facteurPuissanceMoteur;
	}
	
	public String toString() {
		return "VeloElec[facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec t1 = new VeloElec();
		System.out.println(t1);
		System.out.println(t1.getFacteurPuissanceMoteur());
		System.out.println(t1.getPuissance(7));
		System.out.println(t1.getDiamRoue());
		System.out.println(t1.getBraquet());
		System.out.println(t1.getGenAlea());
		
		System.out.println(VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		System.out.println(VeloElec.getDEFAUT_BRAQUET());
	}
}