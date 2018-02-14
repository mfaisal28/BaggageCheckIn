import java.util.TreeMap;

public class AllAirports {
	
	private TreeMap<Integer,Airport> airportList;
	
	
	public AllAirports() 
	{
		airportList = new TreeMap<Integer,Airport>();
	}
	
	public Airport FindbyName(String Name)
	{		
		
		for(Airport a : airportList.values()) 
		{
			if(a.getName().equals(Name.trim()))
			{
				return a;
			}
		}
		
		return null;
		
	}
	
	public void Add(Airport a) 
	{		
		airportList.put(a.getID(), a);	
	}
	
	
	

}
