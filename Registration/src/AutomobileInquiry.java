import java.util.regex.Pattern;
public class AutomobileInquiry {
	
	private final String PreviousOwner;
	private final String NewOwner;
	private final String LicensePlate; //= "^[A-Z]{1,2}[0-9]{4}[A-Z]{2}";
	private long AppNumber;
	

	public AutomobileInquiry(String PreviousOwner, String NewOwner, String LicensePlate) {
		this.PreviousOwner = PreviousOwner;
		this.NewOwner = NewOwner;
		this.LicensePlate = LicensePlate;
		this.AppNumber = 0L;
		// TODO Auto-generated constructor stub
	}
	
	public String getPreviousOwner() {
		return PreviousOwner;
	}
	public String getNewOwner() {
		return NewOwner;
	}
	public String getLicensePlate() {
		return LicensePlate;
	}
	public long getAppNumber() {
		return AppNumber;
	}
	public void setAppNumber(long AppNumber) {
		this.AppNumber = AppNumber;
	}
	
	public void getCityLicensePlate() {
		if(Pattern.matches("^[A-Z]{1}[0-9]{4}[A-Z]{2}$", this.LicensePlate)) {
			System.out.println(this.LicensePlate.charAt(0));
		}
			else  
					if(Pattern.matches("^[A-Z]{2}[0-9]{4}[A-Z]{2}$", this.LicensePlate)) {
					System.out.println(this.LicensePlate.charAt(0)+ ""+this.LicensePlate.charAt(1));
			}else
				System.out.println("1");
			
		}
	
	@Override
	public String toString() {
		return "Previous Owner:" +this.PreviousOwner+ "New Owner:" +this.NewOwner+ "License Plate:" +this.LicensePlate+ "Application Number:" +this.AppNumber+ "\n";
	}
	}
