package Stellar;

public class Trait {
	String Des;
	int Point;
	Trait(String Va, int po) {
		Point=po;
		Des=Va;
	}
	
	public int getPoints()
	{
		return Point;
	}
	public String getDes()
	{
		return Des;
	}
	@Override
	public String toString()
	{
		return "Trait: "+Des;
	}
}
	