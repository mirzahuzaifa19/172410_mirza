package accountProject;

import java.util.Date;

public class TestDiscountSystem {

	public static void main(String[] args) {
		//Customer c1 = new Customer("mirza", false, "Premium");
       Customer c2 = new Customer("Kiran", false, "Gold");
  
        Visit v1 = new Visit(c2, new Date());
       //  System.out.println(v1.toString());
        v1.setProductExpense(100);
        v1.setServiceExpense(8);
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
	}


