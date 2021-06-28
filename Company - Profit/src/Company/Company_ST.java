package Company;

public class Company_ST extends Company {
	
	private String Owner;
	private double InitialCapital;
	private double CurrentCapital;

	public Company_ST(String CompanyName, String EstablishedDate, String ID, 
					  String Owner, double InitialCapital, double CurrentCapital) {
		
		super(CompanyName, EstablishedDate, ID);
		this.Owner = Owner;
		this.InitialCapital = InitialCapital;
		this.CurrentCapital = CurrentCapital;
	}
	
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String Owner) {
		this.Owner = Owner;
	}
	
	public double getInitialCapital() {
		return InitialCapital;
	}
	public void setInitialCapital(double InitialCapital) {
		this.InitialCapital = InitialCapital;
	}
	
	public double getCurrentCapital() {
		return CurrentCapital;
	}
	public void getCurrentCapital(double CurrentCapital) {
		this.CurrentCapital = CurrentCapital;
	}
	
	public double Profit() {
		return CurrentCapital - InitialCapital;
		
	}
}
