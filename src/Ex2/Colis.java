package Ex2;

public class Colis extends Courrier {

	private double poids;
	private double volume;
	Colis(boolean mode, String adresse,double poids,double volume) {
		super(mode, adresse);
		// TODO Auto-generated constructor stub
		this.poids=poids;
		this.volume=volume;
	}
	@Override
	void decrire()
	{
		super.decrire();
		System.out.println("Poids: "+poids+" g volume :"+volume+" L");
		
	}
	@Override
	double affranchir()
	{
		double m=0;
		m=0.25*volume+(poids/1000)*1.0;
		return m;
	}
	

}
