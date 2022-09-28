import java.util.jar.Attributes.Name;

public class Main {

	public static void main(String[] args) {
	
		
		Product product = new Product(id:1);
		
		//product.name="Laptop";
		//product.id=1;
		//product.description="Asus Laptop";
		//product.price=5000;
		//product.stockAmount=3;
		
		
		
		ProductManager productManager =new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get);
	
	
	}

}
