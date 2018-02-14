
public class Airport {
	
	private int Terminal_Id;
	private String  Name;
	
	
	public Airport(int Terminal_Id, String Name) 
	{
		this.Terminal_Id = Terminal_Id;
		this.Name = Name.trim();
	}
	
	public String getName() {		
		return Name;
		
	}

	public int getID() {		
		return Terminal_Id;
		
	}
}


