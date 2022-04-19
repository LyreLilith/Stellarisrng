package Stellar;

import java.util.ArrayList;


public  class Traits {
	private ArrayList<Trait> bio = new ArrayList<Trait>();
	private ArrayList<Trait> bioL = new ArrayList<Trait>();
	private ArrayList<Trait> robo = new ArrayList<Trait>();
	//Robo
	 Traits()
	 {
		 traitMakers();
		
	 }
	public void traitMakers() {
		System.out.print("TraitMaker");
		 Trait t0= new Trait("Power Drills",2);
		  Trait t1= new Trait("Superconductive",2);
		  Trait t2= new Trait("Efficient Processors",3);
		  Trait t3= new Trait("Logic Engines",2);
		  Trait t4= new Trait("Double-Jointed",1);
		  Trait t5= new Trait("Bulky",-1);
		  Trait t6= new Trait("Enhanced Memory",2);
		  Trait t7= new Trait("Emotion Emulators",1);
		  Trait t8= new Trait("Uncanny",-1);
		  Trait t9= new Trait("Durable",1);
		  Trait t10= new Trait("High Maintenace",-1);
		  Trait t11= new Trait("Learning Algorithms",1);
		  Trait t12= new Trait("Repurposed Hardware",-1);
		  Trait t13= new Trait("Mass-Produced",1);
		  Trait t14= new Trait("Custom-Made",-1);
		  Trait t15= new Trait("Recycled",2);
		  Trait t16= new Trait("Luxurious",-2);
		  Trait t17= new Trait("Streamlined Protocols",2);
		  Trait t18= new Trait("High Bandwidth",-2);	
		//Bio
		  
		  Trait b0= new Trait("Adaptive", 2);
		  Trait b1 = new Trait("Extremely Adaptive", 4);
		  Trait b2 = new Trait("Agrarian", 2);
		  Trait b3 = new Trait("Charismatic", 2);
		  Trait b4 = new Trait("Communal", 1);
		  Trait b5 = new Trait ("Conformists", 2);
		  Trait b6 = new Trait ("Conservationist",1);
		  Trait b7 = new Trait ("Docile",2);
		  Trait b8 = new Trait ("Enduring", 1);
		  Trait b9 = new Trait ("Venerable",4);
		  Trait b10 = new Trait ("Industrious", 2);
		  Trait b11 = new Trait ("Intelligent", 2);
		  Trait b12 = new Trait  ("Natural Engineers", 1);
		  Trait b13 = new Trait ("Natural Physicsts", 1);
		  Trait b14 = new Trait ("Natural Sociologists", 1);
		  Trait b15 = new Trait ("Nomadic", 1);
		  Trait b16 = new Trait ("Quick Learners",1);
		  Trait b17 = new Trait ("Quick Learners",1);
		  Trait b18 = new Trait ("Rapid Breeders",2);
		  Trait b19 = new Trait ("Resilient",1);
		  Trait b20 = new Trait ("Strong",1);
		  Trait b21 = new Trait ("Very Strong", 3);
		  Trait b22 = new Trait ("Talented",1);
		  Trait b23 = new Trait ("Thrifty",2);
		  Trait b24 = new Trait ("Traditional",1);
		  Trait b25 = new Trait ("Nonadaptive", -1);
		  Trait b26 = new Trait ("Repugnant",-2);
		  Trait b27 = new Trait ("Solitary",-1);
		  Trait b28 = new Trait ("Deviants",-1);
		  Trait b29 = new Trait ("Wasteful",-1);
		  Trait b30 = new Trait ("Unruly",-2);
		  Trait b31 = new Trait ("Fleeting", -1);
		  Trait b32 = new Trait ("Sedentary",-1);
		  Trait b33 = new Trait ("Slow Learners",-1);
		  Trait b34 = new Trait ("Slow Breeders", -2);
		  Trait b35 = new Trait ("Weak",-1);
		  Trait b36 = new Trait ("Quarrelsome",-1);
		  Trait b37 = new Trait ("Decadent",-1);
		  Trait bB0= new Trait ("Photorophic", 1);
		  Trait bB1 = new Trait ("Radiotrophic", 2);
		  Trait bB2 = new Trait ("Budding", 2);
		  Trait bL0 = new Trait ("Gaseous Byproducts", 2);
		  Trait bL1 = new Trait ("Scintillating Skin", 2);
		  Trait bL2 = new Trait ("Volatile Excretions", 2);
		  System.out.println("Traits made");
			bio.add(b1);
			bio.add(b2);
			bio.add(b3);
			bio.add(b4);
			bio.add(b5);
			bio.add(b6);
			bio.add(b7);
			bio.add(b8);
			bio.add(b9);
			bio.add(b10);
			bio.add(b11);
			bio.add(b12);
			bio.add(b13);
			bio.add(b14);
			bio.add(b15);
			bio.add(b16);
			bio.add(b17);
			bio.add(b18);
			bio.add(b19);
			bio.add(b20);
			bio.add(b20);
			bio.add(b21);
			bio.add(b22);
			bio.add(b23);
			bio.add(b24);
			bio.add(b25);
			bio.add(b26);
			bio.add(b27);
			bio.add(b28);
			bio.add(b29);
			bio.add(b30);
			bio.add(b31);
			bio.add(b32);
			bio.add(b33);
			bio.add(b34);
			bio.add(b35);
			bio.add(b36);
			bio.add(b37);
			//Lithoid
			ArrayList<Trait>bioL= new ArrayList<Trait>();
			bioL.addAll(bio);
			bioL.add(bL0);
			bioL.add(bL1);
			bioL.add(bL2);
			//Robo
			robo.add(t1);
			robo.add(t2);
			robo.add(t3);
			robo.add(t4);
			robo.add(t5);
			robo.add(t6);
			robo.add(t7);
			robo.add(t8);
			robo.add(t9);
			robo.add(t10);
			robo.add(t11);
			robo.add(t12);
			robo.add(t13);
			robo.add(t14);
			robo.add(t15);
			robo.add(t16);
			robo.add(t17);
			robo.add(t18);
			
			
;		
		System.out.println("bio" + bio.size());
		System.out.println("bioL "+  bioL.size());
		System.out.println("robo "+ robo.size());
		}
	
	
	
	
	public static void mergeSort(int[] intTraits, int high, int low) {
		if(high<=low) {
			return;
			
		}
		
	}
	
	public  Trait getBio(int num){System.out.println(num+ " Bio");
		return bio.get(num);
		
	}
	public  Trait gettBioL(int num){System.out.println(num+" BioL");
		return bioL.get(num);
	}
	public  Trait getRobo(int num){System.out.println(num+" Robo");
		return robo.get(num);
	}
	
	
	//This is the final incarnation of Inteligent AI
	
	 
}
			
	 
	
