public class opp{
	public static void main(String[] args){
	    int onnu = 10;
		int rendu = 20;
		
		System.out.println((onnu>rendu) + "   -first output" );
		System.out.println((rendu>onnu) + "   -second output");
		
		System.out.println(( 10&20) +"   -third one");
		System.out.println((10|20) + "   -fourth ouptut");
		
		System.out.println((10*20) + "   - multiplication");
		System.out.println((float)(rendu/onnu) + "   - division" );
		
		System.out.println((10^rendu) + "  exclusive or");
		
		int moonu = rendu++;
		int naalu = ++onnu;
		
		System.out.println((moonu>=naalu) + " its by relational");
		
		System.out.println((10<<2) + "  by LS");
		System.out.println((10>>>1) + "by RSZ");
	
		
		System.out.println((~onnu) + "by compliment");
	
	}
	}