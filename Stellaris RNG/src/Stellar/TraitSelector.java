package Stellar;

import java.util.ArrayList;

public class TraitSelector {
ArrayList<Trait> traits;
	TraitSelector(String Appearance)
	{
		traits=traitSelector(Appearance);
	}
	
	
	public  ArrayList<Trait> traitSelector(String Appearance)
	{
		
		roboTraitSelector  rb = new roboTraitSelector(); //Tested This works!!!!!!!!!!
		//LithoidTraitSelector lt = new LithoidTraitSelector();
		BioTraitSelector bt = new BioTraitSelector();
		
		if(Appearance.equals("Machine")) {
			return rb.getRt();
		//}
		//if(Appearance.equals("Lithoid")) {
			//return lt.getLt();
		}
		return bt.getBt();
	}
	
	public ArrayList<Trait> getTraits(){
		return traits;
	}
}

