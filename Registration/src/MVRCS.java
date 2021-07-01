import java.util.ArrayList;
import java.util.Scanner;
public class MVRCS {
	
	public ArrayList<AutomobileInquiry> AppList = new ArrayList<AutomobileInquiry>();
	private int DeskNumber;
	public long CurrentSerialNumber;

	public MVRCS() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter desk number: ");
		Scanner sc = new Scanner(System.in);
		int DeskNumber = sc.nextInt();
		this.DeskNumber = DeskNumber;
		this.CurrentSerialNumber = 100;
		sc.close();
	}

	public int getDeskNumber() {
		return DeskNumber;
	}
	
	public long AcceptApp(AutomobileInquiry app) {
		app.setAppNumber(this.CurrentSerialNumber);
		this.AppList.add(app);
		return this.CurrentSerialNumber++;	
	}
	
	public void DeleteApplication(long CurrentSerialNumber) {
		for(AutomobileInquiry app : this.AppList) {
			if(app.getAppNumber() == CurrentSerialNumber) {
				this.AppList.remove(app);
				System.out.println("eRROR1");

			}
		}
	}
}
