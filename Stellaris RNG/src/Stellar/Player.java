package Stellar;

import java.util.ArrayList;

public class Player {
   
	String name;
	String Origin;
	String Appearance;
	
	
    ArrayList<Trait> traits= new ArrayList<Trait>();
   
   Player(String Name)
   
   { name=Name;
   System.out.println(name);
	  Origins O = new Origins();
	  Origin = O.OrgType();
	  Speices S = new Speices(Origin);
	  Appearance=  S.getAppearance();
	 TraitSelector tS = new TraitSelector(Appearance);
	 traits = tS.getTraits();
	  
}
   


public  String getOrigin()
{
	return Origin;
}
public String getAppearance()
{
	return Appearance;
}


@Override
public String toString() {
	String retu = new String( "\nPlayer Name:"+name+"\n\t"+Origin+"\n\t"+Appearance);
	for (int i =0; i<4; i ++)
	{
		retu+="\n"+traits.get(i);
	}
	return retu;
}
}