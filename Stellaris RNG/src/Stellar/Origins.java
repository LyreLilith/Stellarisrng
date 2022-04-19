package Stellar;
public class Origins {
String Origin;
	
	Origins()
	{
	}

	  String OrgType(){
	
		int num;
		 num = (int) (Math.random()*22)+1;
		String ori="";
		switch (num)
		{
		case 1: ori="Prosperous Unification";
		break;
		case 2: ori="Galactic Doorstep";
		break;
		case 3: ori ="Lost Colony";
		break;
		case 4: ori = "Mechanist";
		break;
		case 5: ori = "Syncretic Evolution";
		break;
		case 6: ori = "Tree of Life";
		break;
		case 7: ori ="Resource Consolidation";
		break;
		case 8: ori = "Clone Army";
		break;
		case 9: ori = "Life-Seeded";
		break;
		case 10: ori = "Post-Apocalyptic";
		break;
		case 11: ori = "Remnants";
		break;
		case 12: ori = "Calamitous Birth";
		break;
		case 13: ori = "Common Ground";
		break;
		case 14: ori = "Hegemon";
		break;
		case 15: ori = "Doomsday";
		break;
		case 16: ori ="On the Shoulders of Giants";
		break;
		case 17: ori = "Scion";
		break;
		case 18: ori = "Shattered Ring";
		break;
		case 19: ori = "Void Dwellers";
		break;
		case 20: ori = "Necrophage";
		break;
		case 21: ori = "Here Be Dragons";
		break;
		case 22: ori = "Ocean Paradise";
		break;
		default: ori = "Prosperous Unification";
		break;
		}
		    return ori;
		}
	
}


