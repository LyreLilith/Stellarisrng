package Stellar;

import java.util.ArrayList;

public class roboTraitSelector {
static ArrayList<Trait> rt;
	
	
	
	roboTraitSelector()
	{
		rt=roboTrait();
	}
	
	 public ArrayList<Trait> roboTrait(){
		 Traits T = new Traits();
	while(true)
	{
		int m1 = (int) (Math.random()*18);
		int m2 = (int) (Math.random()*18);
		int m3 = (int) (Math.random()*18);
		int m4 = (int) (Math.random()*18);
		int []testTraits= new int[] {m1,m2,m3,m4};
		Trait r1 = T.getRobo(m1);	
		Trait r2 = T.getRobo(m2);
		Trait r3 = T.getRobo(m3);
		Trait r4 = T.getRobo(m4);
		if (repeats(m1,m2,m3,m4))
		{
			System.out.println("Repeats True");
		continue;			
	}
	System.out.print("Point Sum Reached");
	int p1= r1.getPoints();
	int p2 = r2.getPoints();
    int p3 =r3.getPoints();
    int p4 = r4.getPoints();
    int sum = p1+p2+p3+p4-2;
    if (sum<0||sum>2)
    {
    	System.out.println("Point Sum fail");
    	continue;
    }
   
    ArrayList<Trait> traits = new ArrayList<Trait>();
    traits.add(r1);
    traits.add(r2);
    traits.add(r3);
    traits.add(r4);
    
    if( notCompat(traits,"Double Jointed", "Bulky")||
    	notCompat(traits,"Durable","High Maintenance")||
    	notCompat(traits,"Emotion Emulators","Uncanny")||
    	notCompat(traits,"Learning Algorithms","Repurposed Hardware")||
    	notCompat(traits,"Mass-Produced","Custom-Made")||
    	notCompat(traits,"Recycled","Luxurious")||
    	notCompat(traits,"Streamlined Protocols","High Bandwidth")) {
    	continue;}
    return traits;
}
	}
	 
	 private boolean repeats(int m1, int m2, int m3, int m4) {
			System.out.println("Repeats Reached");
			if(m1==m2||m1==m3||m1==m4)
			{
			return true;	
			}
			if(m2==3||m2==m4||m3==m4)
			{
			return true;	
			}
			return false;
		}

	public ArrayList<Trait> getRt()
	{
		return rt;
	}
	/*
	 * @param ArrayList<Trait> list of traits to test
	 * @param String first of binary explustion Strings
	 * @param String second of binary exclustion Strings
	 * @param String thrid of binary excluton Strings
	 * @return boolean true if incompatable
	 */
	private boolean notCompat( ArrayList<Trait> robo, String c1, String c2, String c3) {
		 String t1 = robo.get(0).getDes();
		 String t2 = robo.get(1).getDes();
		 String t3 = robo.get(2).getDes();
		 String t4 = robo.get(3).getDes();
		 if ( ( (t1.equals(c1)||t2.equals(c1)||t2.equals(c1)||t3.equals(c1))
					&&
				(t1.equals(c2)||t2.equals(c2)||t3.equals(c2)||t4.equals(c2)))
				 || 
			 ((t1.equals(c1)||t2.equals(c1)||t2.equals(c1)||t3.equals(c1))
			 		&&
			 (t1.equals(c3)||t2.equals(c3)||t2.equals(c3)||t3.equals(c3)))
			 	||
			 ((t1.equals(c2)||t2.equals(c2)||t2.equals(c2)||t3.equals(c2))
					 &&
			(t1.equals(c3)||t2.equals(c3)||t2.equals(c3)||t3.equals(c3)))) {
		return true;}
		 return false;}
	
/*
* 
* @param ArrayList<Trait> list of traits to test
* @param String first String to compare
* @param String second String to compare 
* @return boolean true if incompatable
*/
	private boolean notCompat( ArrayList<Trait> robo, String c1, String c2) {
String t1 = robo.get(0).getDes();
String t2 = robo.get(1).getDes();
String t3 = robo.get(2).getDes();
String t4 = robo.get(3).getDes();
if (  (t1.equals(c1)||t2.equals(c1)||t2.equals(c1)||t3.equals(c1))
	&&
(t1.equals(c2)||t2.equals(c2)||t3.equals(c2)||t4.equals(c2))) {
return true;
}
return false;
}
	 
	
}
