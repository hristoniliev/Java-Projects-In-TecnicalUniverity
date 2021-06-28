package Company;

public class Company {
	
	private String CompanyName;
	private String EstablishedDate;
	private String ID;
	
	public Company(String CompanyName, String EstablishedDate, String ID ) {
		this.CompanyName = CompanyName;
		this.EstablishedDate = EstablishedDate;
		this.ID = ID;
	}
	
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String CompanyName ) {
		this.CompanyName = CompanyName;
	}
	
	public String getEstablishedDate() {
		return EstablishedDate;
	}
	public void setEstablishedDate(String EstablishedDate) {
		this.EstablishedDate = EstablishedDate;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		if(ID.length() <= 10)
		this.ID = ID;
	}
}
