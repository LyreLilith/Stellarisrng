package Stellar;
import java.util.ArrayList;
import java.util.Scanner;



class main_runner {
	//ArrayList<Player> Players;
	// ArrayList<String> names ;
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		
		 String papa = scan.nextLine();
		 int size = papa.length();
		 double word = 0;
	 			 for(int j=0; j<size; j++ ) {
	 				word+=papa.valueOf(j); 
	 			 }
	 			 word/=papa.length();
	 			 System.out.println(word);
	 			 
	 }
		 /*   double[] cool = {5.1, 6,7.9,11,22.9,.3,7,19};
		   Sort s = new Sort(cool);
		   System.out.println(s);
		   double[] coo=s.getSort();
		   Find k = new Find(coo,0,coo.length,5.1);
		    }
		ArrayList<Player> Players = new ArrayList<Player>();
		 ArrayList<String> names = new ArrayList<String>();
		
		 System.out.println("Please Enter the Player names.");
		 String nanas = new String();
		 nanas=scan.nextLine();
	     // System.out.println("Please Enter any Exclusions\nenter \"o\" for Origins, \"s\" for speices and \"t\" for traits\n enter \"f\" when finished.");	
	    
	      
	     
	      while(!(input.equalsIgnoreCase("f")))
	      {
	    		
	    	 input=scan.nextLine();
	    	  		if(input.equalsIgnoreCase("o"))
	    	  		{
	    	  			System.out.println("Please enter the Origins, 1 per line. Enter \"f\" when finished");
	    	  			String baO = scan.nextLine();
	    	  			while(!baO.equalsIgnoreCase("f"))
	    	  			{
	    	  			    noOr.add((baO)); 
	    	  			    baO = scan.nextLine();
	    	  			}
	    	  		}
	    	  		if(input.equalsIgnoreCase("s"))
	    	  		{
	    	  			System.out.println("Please enter the Speices, 1 per line. Enter \"f\" when finished");
	    	  			String baS = scan.nextLine();
	    	  			while(!baS.equalsIgnoreCase("f")) {
	    	  			noSp.add(baS);
	    	  			baS = scan.nextLine();
	    	  			}
	    	  		}

	    	  		if(input.equalsIgnoreCase("t")) {
	    	  			String baT = scan.nextLine();
	    	  			System.out.println("Please enter the traits, 1 per line. Enter \"f\" when finished");
	    	  			while(!baT.equalsIgnoreCase("f"))
	    	  			{
	    	  				noTr.add(baT);
	    	  				baT= scan.nextLine();
	    	  			}
	    	  		}
	    	  		
	    	  	
	    	  			
	    		  
	      
	    	  Player p = new Player(nanas);
	    	  
	      
	     	
	
		 System.out.println(p.toString());
	 
	
	*/ 
	 
	 }


