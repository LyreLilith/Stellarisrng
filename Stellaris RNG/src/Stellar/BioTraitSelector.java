package Stellar;

import java.util.ArrayList;

public class BioTraitSelector{
	ArrayList<Trait> bt;
	
	BioTraitSelector()
	{
		bt=bioTrait();
	}
	
	
	 public ArrayList<Trait> bioTrait(){
		 Traits T = new Traits();
	while(true)
	{
		int m1 = (int) (Math.random()*18);
		int m2 = (int) (Math.random()*18);
		int m3 = (int) (Math.random()*18);
		int m4 = (int) (Math.random()*18);
		int []testTraits= new int[] {m1,m2,m3,m4};
		Trait r1 = T.getBio(m1);	
		Trait r2 = T.getBio(m2);
		Trait r3 = T.getBio(m3);
		Trait r4 = T.getBio(m4);
		if (repeats(r1.getDes(),r2.getDes(),r3.getDes(),r4.getDes()))
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
    
	if (notCompat(traits, "Charismatic", "Repugnant")||
		notCompat(traits, "Communal", "Solitary")||
		notCompat(traits,"Conformists", "Deviants")||
		notCompat(traits,"Conservationist","Wasteful")||
		notCompat(traits,"Docile", "Unruly")||
		notCompat(traits,"Nomadic","Sedentary")||
		notCompat(traits,"Quick Learners","Slow Learners")||
		notCompat(traits,"Rapid Breeders","Slow Breeders")||
		notCompat(traits,"Adaptive","Extremely Adaptive","Nonadaptive")||
		notCompat(traits,"Enduring","Venerable","Fleeting")||
		notCompat(traits,"Strong","Very Strong","Weak")||
		notCompat(traits,"Quarrelsome","Decadent","Traditional")||
		notCompat(traits,"Natural Engineers","Natural Physicists","Natural Sociologists")){  
    	continue;}
    return traits;
}
	 }
	
	 private boolean repeats(String t1, String t2, String t3, String t4) {
	     if (t1.equals(t2)||t1.equals(t3)||t1.equals(t4)) {
	    	 return true;
	     }
	     if(t2.equals(t3)||t2.equals(t4))
	     {
	    	 return true;
	     }
	     if(t3.equals(t4)) {
	    	 return true;
	     }
	     return false;
	    		 
		
	}
	
	 public ArrayList<Trait> getBt(){
		 return bioTrait();
	 }
	 
	 private boolean notCompat( ArrayList<Trait> bio, String c1, String c2, String c3) {
				 String t1 = bio.get(0).getDes();
				 String t2 = bio.get(1).getDes();
				 String t3 = bio.get(2).getDes();
				 String t4 = bio.get(3).getDes();
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
	 private boolean notCompat( ArrayList<Trait> bio, String c1, String c2) {
	 String t1 = bio.get(0).getDes();
	 String t2 = bio.get(1).getDes();
	 String t3 = bio.get(2).getDes();
	 String t4 = bio.get(3).getDes();
	if (  (t1.equals(c1)||t2.equals(c1)||t2.equals(c1)||t3.equals(c1))
			&&
		 (t1.equals(c2)||t2.equals(c2)||t3.equals(c2)||t4.equals(c2))) {
		return true;
	}
	return false;
}

}
	

