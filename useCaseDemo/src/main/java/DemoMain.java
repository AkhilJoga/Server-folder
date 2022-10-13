import java.util.ArrayList;
import java.util.List;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoMain dm= new DemoMain();
		List<Address> addList2=dm.called();
		
		for(Address add :addList2) {
			System.out.println(add.getCity());
		}
		
	}
	public List<Address> called() {
		Address a1= new Address();
		Address a2 =new Address();
		a1.setCity("Vizag");
		a1.setCountry("India");
		a2.setCity("Chennai");
		a2.setCountry("India");
		List<Address> addList = new ArrayList<Address>();
		addList.add(a1);
		addList.add(a2);
		return addList;
	}

}
