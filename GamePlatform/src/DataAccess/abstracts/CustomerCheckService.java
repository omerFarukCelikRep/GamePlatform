package DataAccess.abstracts;

import Entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
