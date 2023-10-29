package Ex2;

public class Lettre extends Courrier {

	private double poids;
	private String format;
	Lettre(boolean mode, String adresse,double poids,String format) {
		super(mode, adresse);
		// TODO Auto-generated constructor stub
		if((format.toUpperCase().equals("A3") ||(format.toUpperCase().equals("A4"))))
		{
			this.format=format.toUpperCase();
		}
		else
		{
			System.out.println("Format invalide ");
			this.format="A3";
		}
		this.poids=poids;
	}
	@Override
	void decrire()
	{
		super.decrire();
		System.out.println("Poids: "+poids+" g  Format: "+format);
	}
	@Override
	double affranchir()
	{
		double m=0;
		m=format.equals("A4")? ((2.50+(0.5*(poids/1000)))) :((3.50+(0.5*(poids/1000))));
		m=this.mode == true? (m*2): (m);
		return m;
	}
}
