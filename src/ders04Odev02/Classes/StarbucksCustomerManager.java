package ders04Odev02.Classes;

import ders04Odev02.Entities.Customer;
import ders04Odev02.Interfaces.BaseCustomerManager;
import ders04Odev02.Interfaces.CustomerService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	ders04Odev02.Interfaces.CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ders04Odev02.Interfaces.CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Starbucks Manager : Validation Error - Not a valid person.");
		}

	}


}
