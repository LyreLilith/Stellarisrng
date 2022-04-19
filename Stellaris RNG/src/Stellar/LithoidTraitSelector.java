package Stellar;

import java.util.ArrayList;

public class LithoidTraitSelector {
	 ArrayList<Trait> lt;
	LithoidTraitSelector()
	{
		lt=LitoTraits();
	}
	LithoidTraitSelector(String Trait1){
		
	}
	
		public ArrayList<Trait> LitoTraits(){
		Traits T = new Traits();
		while(true)
		{
			int m1 = (int) (Math.random()*41);
			int m2 = (int) (Math.random()*41);
			int m3 = (int) (Math.random()*41);
			int m4 = (int) (Math.random()*41);
			int[]nums= new int[] {m1,m2,m3,m4};
			for(int n: nums)
			{
				System.out.println("Number "+n);
			}
			
			int [] testTraits = new int[] {m1,m2,m3,m4};
			
		Trait r1 = T.gettBioL(m1);	
		Trait r2 = T.gettBioL(m2);
		Trait r3 = T.gettBioL(m3);
		Trait r4 = T.gettBioL(m4);
		System.out.print ("List Made");
		if (repeats(m1,m2,m3,m4))
		{	System.out.println("Repeats True");
			continue;			
		}
		int p1= r1.getPoints();
		int p2 = r2.getPoints();
	    int p3 =r3.getPoints();
	    int p4 = r4.getPoints();
	    int sum = p1+p2+p3+p4-2;
	    if (sum<0||sum>2)
	    {
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
	    		notCompat(traits,"Gaseous Byproducts","Scintillating Skin","Volatile Excretions")||
	    		notCompat(traits,"Natural Engineers","Natural Physicists","Natural Sociologists")){  
	        	continue;}
	        return traits;
	    }
	    	 }
		
		public ArrayList<Trait> LitoTraits(String Trait1){
			Traits T = new Traits();
			while(true)
			{
				int m1 = (int) (Math.random()*41);
				int m2 = (int) (Math.random()*41);
				int m3 = (int) (Math.random()*41);
				int m4 = (int) (Math.random()*41);
				int[]nums= new int[] {m1,m2,m3,m4};
				for(int n: nums)
				{
					System.out.println("Number "+n);
				}
				
				int [] testTraits = new int[] {m1,m2,m3,m4};
				
			Trait r1 = T.gettBioL(m1);	
			Trait r2 = T.gettBioL(m2);
			Trait r3 = T.gettBioL(m3);
			Trait r4 = T.gettBioL(m4);
			System.out.print ("List Made");
			if (repeats(m1,m2,m3,m4))
			{	System.out.println("Repeats True");
				continue;			
			}
			int p1= r1.getPoints();
			int p2 = r2.getPoints();
		    int p3 =r3.getPoints();
		    int p4 = r4.getPoints();
		    int sum = p1+p2+p3+p4-2;
		    if (sum<0||sum>2)
		    {
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
		    		notCompat(traits,"Gaseous Byproducts","Scintillating Skin","Volatile Excretions")||
		    		notCompat(traits,"Natural Engineers","Natural Physicists","Natural Sociologists")){  
		        	continue;}
		        return traits;
		    }
		    	 }+++
	

	 private boolean repeats(int m1, int m2, int m3, int m4) {
		System.out.println("Repeats Method Reached");
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
	
	 private boolean notCompat( ArrayList<Trait> bioL, String c1, String c2, String c3) {
		 String t1 = bioL.get(0).getDes();
		 String t2 = bioL.get(1).getDes();
		 String t3 = bioL.get(2).getDes();
		 String t4 = bioL.get(3).getDes();
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
	 private boolean notCompat(ArrayList<Trait> bioL, String c1, String c2) {
String t1 = bioL.get(0).getDes();
String t2 = bioL.get(1).getDes();
String t3 = bioL.get(2).getDes();
String t4 = bioL.get(3).getDes();
if (  (t1.equals(c1)||t2.equals(c1)||t2.equals(c1)||t3.equals(c1))
	&&
 (t1.equals(c2)||t2.equals(c2)||t3.equals(c2)||t4.equals(c2))) {
return true;
}
return false;
}
	
	public ArrayList<Trait> getLt() {
		return lt;
	}

	}



