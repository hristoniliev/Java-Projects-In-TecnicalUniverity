
public class Main {
	
	public static void main(String[] args) {
		
		AutomobileInquiry app1 = new AutomobileInquiry("fdhgfd", "kjhgf", "CA4578VR");
		AutomobileInquiry app2 = new AutomobileInquiry("uytr", "xcvbnnb", "C0011VR");
		AutomobileInquiry app3 = new AutomobileInquiry("wertgfd", "kjdfdfghgf", "A1144KL");
		AutomobileInquiry app4 = new AutomobileInquiry("qaswed", "zxcdsa", "KL4578VR");
		app1.getCityLicensePlate();
		app2.getCityLicensePlate();
		app3.getCityLicensePlate();
		app4.getCityLicensePlate();
		MVRCS Desk = new MVRCS();
		System.out.println("Desk Number: " + Desk.getDeskNumber());
		Desk.AcceptApp(app1);
		Desk.AcceptApp(app2);
		Desk.AcceptApp(app3);
		Desk.AcceptApp(app4);
		System.out.println(Desk.AppList);
		Desk.DeleteApplication(102);
		System.out.println(Desk.AppList);
		MVRCSSofia sf = new MVRCSSofia();
		sf.AcceptApp(app1);
		sf.AcceptApp(app2);
		sf.AcceptApp(app3);
		sf.AcceptApp(app4);
	}
}
