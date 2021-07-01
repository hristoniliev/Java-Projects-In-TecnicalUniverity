import java.util.regex.Pattern;
public class MVRCSSofia  {

	public MVRCSSofia() {
		// TODO Auto-generated constructor stub
	}
		public long AcceptApp(AutomobileInquiry app) {
			if(Pattern.matches("^CA[0-9]{4}[A-Z]{2}$", app.getLicensePlate()) || (Pattern.matches("^C[0-9]{4}[A-Z]{2}$", app.getLicensePlate()))) {
				System.out.println("The car" +app.getLicensePlate() + " is from Sofia!");
				}else
					System.out.println("The car"+app.getLicensePlate()+" is not from Sofia!");
			return 0;
		}

	}



