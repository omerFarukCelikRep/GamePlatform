package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.Product;


public interface ProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}
