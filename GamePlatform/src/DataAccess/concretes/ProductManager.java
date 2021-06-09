package DataAccess.concretes;

import java.util.List;

import DataAccess.abstracts.ProductService;
import Entities.concretes.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("�r�n Eklendi " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n G�ncellendi " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n Silindi " + product.getName());
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
