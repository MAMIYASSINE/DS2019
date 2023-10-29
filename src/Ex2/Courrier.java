package Ex2;

public class Courrier {
	protected boolean mode;
	protected String adresse;
	protected static final double tarif=0.5;
	Courrier( boolean mode,String adresse)
	{
		this.mode=mode;
		this.adresse=adresse;
	}
	boolean estValide()
	{
		if((! this.adresse.isEmpty()) &&(this.adresse != null))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString()
	{
		String modeex="";
		modeex= mode==true? "express" : "normal";
		return "Mode d'expedition: "+modeex+" Adresse: "+adresse+" Tarif: "+tarif;
	}
	void decrire()
	{
		System.out.println(this);
	}
	double 	affranchir()
	{
		if(this.estValide())
		{
			if(this.mode==false)
			{
				return tarif;
			}
			else
			{
				return tarif*2;
			}
		}
		else
		{
			return 0;
		}
	}
	

}
