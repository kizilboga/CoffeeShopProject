package ders04Odev02.Classes;

import ders04Odev02.Entities.Customer;
import ders04Odev02.Interfaces.BaseCustomerManager;
import ders04Odev02.Interfaces.CustomerCheckService;
import ders04Odev02.Interfaces.CustomerService;


public class NeroCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Nero customer manager : validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Nero Customer Manager : Validation Error - Not a valid person.");
		}
	}
    
}
