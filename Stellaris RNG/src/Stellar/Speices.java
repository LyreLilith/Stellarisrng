package Stellar;

public class Speices {
    
	String Speices;
	
	Speices(String Origin)
	{
		Speices=ApperanceM(Origin);
	}
	
	private  String ApperanceM(String Origin)
	{
		 String Speices;
		if (Origin.equals("Ocean Paradise"))
		{
			Speices="Aquatic";
		}
		
		else if (Origin.equals("Calamitous Birth"))
		{
			Speices="Lithoid";
		}
		else if (Origin.equals("Resource Consolidation"));
		{
			Speices="Machine Intelligence";
		}
		
		int num;
		 num = (int) (Math.random()*12)+1;
		
		switch (num)
		{
		case 1: Speices="Humanoid";
		break;
		case 2: Speices="Aquatic";
		break;
		case 3: Speices ="Mammalian";
		break;
		case 4: Speices = "Reptillian";
		break;
		case 5: Speices = "Avian";
		break;
		case 6: Speices = "Arthropoid";
		break;
		case 7: Speices ="Molluscoid";
		break;
		case 8: Speices = "Fungoid";
		break;
		case 9: Speices = "Plantoid";
		break;
		case 10: Speices = "Lithoid";
		break;
		case 11: Speices = "Necroid";
		break;
		case 12: Speices = "Machine";
			if (testOrg(Origin))
			{
				Speices=notRobo();
			}
			break;
			}
		return Speices;
	}
	
	private  String  notRobo()
	{
		String Speices="";
		int num;
		 num = (int) (Math.random()*11)+1;
		
		switch (num)
		{
		case 1: Speices="Humanoid";
		break;
		case 2: Speices="Aquatic";
		break;
		case 3: Speices ="Mammalian";
		break;
		case 4: Speices = "Reptillian";
		break;
		case 5: Speices = "Avian";
		break;
		case 6: Speices = "Arthropoid";
		break;
		case 7: Speices ="Molluscoid";
		break;
		case 8: Speices = "Fungoid";
		break;
		case 9: Speices = "Plantoid";
		break;
		case 10: Speices = "Lithoid";
		break;
		case 11: Speices = "Necroid";
		break;
		}
		return Speices;
	}
	
		private boolean testOrg(String o)
		{
			if (o.equals("Mechanist")||o.equals("Lost Colony")||o.equals("Syncretic Evolution")||o.equals("Life-Seeded")||o.equals("Post-Apocalyptic")
				||o.equals("Void Dwellers")||o.equals("Scion")||o.equals("On the Shoulder of Giants")||o.equals("Common Ground")||o.equals("Hegemon")
				||o.equals("Lost Colony")||o.equals("Clone Army"))
			{
			return true;	
			}
			return false;
		}
	
public String getAppearance() {
	return Speices;
}
}
