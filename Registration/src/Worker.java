import java.util.ArrayList;

public class Worker {
	
	private String Name;
	private int ChangedLicenses;
	private int AllChangedLicenses;
	
	public Worker() {
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getChangedLicenses() {
		return ChangedLicenses;
	}
	public void setChangedLicenses(int ChangedLicenses) {
		this.ChangedLicenses = ChangedLicenses;
	}
	public int getAllChangedLicenses() {
		return AllChangedLicenses;
	}
	public void setAllChangedLicenses(int AllChangedLicenses) {
		this.AllChangedLicenses = AllChangedLicenses;
	}
	
	public void ChangingLicenses( ArrayList<AutomobileInquiry> AppList, AutomobileInquiry app) {
		//AutomobileInquiry min = AppList.get(0);
		for(int i=0; i<AppList.size(); i++) {
			//if(AppList.get(i) < min)
				//min = AppList.get(i);
			if(app.getAppNumber() <  Long.MAX_VALUE);
		}
			
		
		this.ChangedLicenses++;
		this.AllChangedLicenses++;
	}

}
