package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
	Order get(int id);
	List<Order> getAll();
}
