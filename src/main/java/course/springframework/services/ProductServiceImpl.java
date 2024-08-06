package course.springframework.services;
import java.util.List;

import course.springframework.model.Author;
import course.springframework.model.Product;
import course.springframework.model.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;

@Service
public class ProductServiceImpl implements ProductService{
	
	public ProductServiceImpl() {
		loadProducts();
	}
	
	List<Product> products = new ArrayList<Product>();

	@Override
	public Product getProduct(int id) {
		for (Product p: products) {
			if(p.getId() == id) 
				return p;
		}
		return null;
	}

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return products;
	}
	
	private void loadProducts() {
		
		 Author jt = new Author();
		 jt.setFirstName("Dylan");
		 jt.setLastName("Larrosa");
		 jt.setId(1);
		 jt.setImage("instructor_jt.jpg");
		 
		 ProductCategory springIntroCat = new ProductCategory();
		 springIntroCat.setId(1);
		 springIntroCat.setCategory("Spring Introduction");

		 ProductCategory springCoreCat = new ProductCategory();
		 springCoreCat.setId(2);
		 springCoreCat.setCategory("Spring Core");

		 ProductCategory springBootCat = new ProductCategory();
		 springBootCat.setId(3);
		 springBootCat.setCategory("Spring Boot");

		 ProductCategory thymeleafCat = new ProductCategory();
		 thymeleafCat.setId(4);
		 thymeleafCat.setCategory("Thymeleaf");
		 
		 ProductCategory geapCat = new ProductCategory();
		 geapCat.setId(5);
		 geapCat.setCategory("G.E.A.P");
				 
		 Product springIntro = new Product();
		 springIntro.setId(1);
		 springIntro.setCourseName("Introduction to Spring");
		 springIntro.setCourseSubtitle("Start Learning Spring!");
		 springIntro.setAuthor(jt);
		 springIntro.setCourseDescription("Why would you want to learn about the Spring Framework? Simple"
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the"
				    +
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 springIntro.setPrice(new BigDecimal("0"));
		 springIntro.setImageUrl("SpingIntroThumb.png");
		 springIntro.getProductCategories().add(springIntroCat);
		 springIntro.getProductCategories().add(springBootCat);
		 products.add(springIntro);
		
		 Product springCoreUltimate = new Product();
		 springCoreUltimate.setId(2);
		 springCoreUltimate.setCourseName("Spring Core Ultimate");
		 springCoreUltimate.setCourseSubtitle("Ultimate Bundle of Spring Core!");
		 springCoreUltimate.setAuthor(jt);
		 springCoreUltimate.setCourseDescription("Why would you want to learn about the Spring Framework? Simple" 
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the" 
				 	+
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 springCoreUltimate.setPrice(new BigDecimal("199"));
		 springCoreUltimate.setImageUrl("springCoreUltimateThumb.png");
		 springCoreUltimate.getProductCategories().add(springCoreCat);
		 springCoreUltimate.getProductCategories().add(springBootCat);
		 products.add(springCoreUltimate);
		 
		 Product thymeleaf = new Product();
		 thymeleaf.setId(3);
		 thymeleaf.setCourseName("thymeleaf");
		 thymeleaf.setCourseSubtitle("thymeleaf and Spring!");
		 thymeleaf.setAuthor(jt);
		 thymeleaf.setCourseDescription("Why would you want to learn about the Spring Framework? Simple"
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the"
				    +
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 thymeleaf.setPrice(new BigDecimal("199"));
		 thymeleaf.setImageUrl("ThymeleafThumb.png");
		 thymeleaf.getProductCategories().add(thymeleafCat);
		 products.add(thymeleaf);
		 
		 Product springCore = new Product();
		 springCore.setId(4);
		 springCore.setCourseName("Spring Core");
		 springCore.setCourseSubtitle("Spring Core - mastering Spring!");
		 springCore.setAuthor(jt);
		 springCore.setCourseDescription("Why would you want to learn about the Spring Framework? Simple" 
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the" 
				 	+
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 springCore.setPrice(new BigDecimal("199"));
		 springCore.setImageUrl("springCoreThumb.png");
		 springCore.getProductCategories().add(springCoreCat);
		 springCore.getProductCategories().add(springBootCat);
		 products.add(springCore);
		
		 Product springCoreAdv = new Product();
		 springCoreAdv.setId(5);
		 springCoreAdv.setCourseName("Spring Core Advanced");
		 springCoreAdv.setCourseSubtitle("Advanced Spring Core!");
		 springCoreAdv.setAuthor(jt);
		 springCoreAdv.setCourseDescription("Why would you want to learn about the Spring Framework? Simple" 
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the" 
				 	+
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 springCoreAdv.setPrice(new BigDecimal("199"));
		 springCoreAdv.setImageUrl("SpringCoreAdvanced.png");
		 springCoreAdv.getProductCategories().add(springCoreCat);
		 springCoreAdv.getProductCategories().add(springBootCat);
		 products.add(springCoreAdv);
		 
		 Product springCoreDevOps = new Product();
		 springCoreDevOps.setId(6);
		 springCoreDevOps.setCourseName("Spring Core Dev-Ops");
		 springCoreDevOps.setCourseSubtitle("Deploying String in the Enterprise and the cloud!");
		 springCoreDevOps.setAuthor(jt);
		 springCoreDevOps.setCourseDescription("Why would you want to learn about the Spring Framework? Simple" 
				 	+
				    "My Introduction Spring Framework Tutorial is designed to give you an introduction to the" 
				 	+
				    "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to make your application more modular and flexible.");
		 springCoreDevOps.setPrice(new BigDecimal("199"));
		 springCoreDevOps.setImageUrl("SpringCoreDevOps.png");
		 springCoreDevOps.getProductCategories().add(springCoreCat);
		 springCoreDevOps.getProductCategories().add(springBootCat);
		 products.add(springCoreDevOps);


	}

}