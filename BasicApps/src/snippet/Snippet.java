package snippet;

public class Snippet {
	System.out.println("List of all Customers  :");
			System.out.println("");
	
			cf.AllCustomers();
			for (Customer c1 : customerService.list.values()) {
				System.out.println(c1.toString());
			}
			System.out.println("---------");
	
}

