package ders04Odev02.Interfaces;

import ders04Odev02.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Customer saved succesfully: "+ customer.getFirstName());
		
	}

}
