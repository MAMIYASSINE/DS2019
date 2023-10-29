package Ex2;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Courrier C=new Courrier(true,"aa");
		C.decrire();
		System.out.println(C.affranchir());
		Lettre L=new Lettre(true,"aa",10,"a5");
		L.decrire();
		System.out.println(L.affranchir());*/
		BoiteCourier B=new BoiteCourier(4);
		B.tab[0]=new Courrier(true,"aa");
		B.tab[1]=new Lettre(true ,"ee", 10,"a5");
		B.tab[2]=new Colis(false,"zz",10,15);
		B.tab[3]=new Courrier(false,"");
		B.afficher();
		System.out.println("Total affranchir: "+B.affranchir());
		System.out.println("Courrier invalide: "+B.courriersInvalides());
		

	}

}
