package ders04Odev02.Adapters;

import java.rmi.RemoteException;

import ders04Odev02.Entities.Customer;
import ders04Odev02.Interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckPerson(Customer customer) {
		KPSPublicSoapProxy soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		  try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName(), customer.getLastName(), customer.getDob().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}


	

}
