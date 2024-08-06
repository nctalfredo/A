package course.springframework.services;

import java.util.List;
import course.springframework.model.*;

public interface ProductService {
	Product getProduct(int id);
	List<Product> listProducts();
}