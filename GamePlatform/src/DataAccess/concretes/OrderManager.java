package DataAccess.concretes;

import java.util.List;

import DataAccess.abstracts.OrderService;
import Entities.concretes.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("Sipariş Eklendi " + order.getId());
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariş Güncellendi " + order.getId());
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariş Silindi " + order.getId());
		
	}

	@Override
	public Order get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
