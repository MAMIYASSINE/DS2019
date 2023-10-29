package Ex2;

public class BoiteCourier {
	
	Courrier tab[];
	BoiteCourier(int n)
	{
		
		tab=new Courrier[n];
	}
	double affranchir()
	{
		double S=0;
		for(int i=0;i<tab.length;i++)
		{
			S=S+tab[i].affranchir();
		}
		return S;
	}
	int courriersInvalides()
	{
		int S=0;
		for(int i=0;i<tab.length;i++)
		{
			if(!tab[i].estValide())
			{
				S++;
			}
		}
		return S;
	}
	void afficher()
	{
		for(int i=0;i<tab.length;i++)
		{
			tab[i].decrire();
			if(!tab[i].estValide())
			{
				System.out.println("courrier invalide");
			}
		}
		
	}
	

}
