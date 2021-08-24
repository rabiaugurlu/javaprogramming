package classesWithAttributrs;

public class Main {

	public static void main(String[] args) {
int id;
String name;
String description;
int price;
int stockAmount;
String renk;
Product product= new Product(1,  "Laptop", "ASUS Laptop", 3000,  2, "Siyah");
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("ASUS Laptop");
		product.setPrice(5000);
		product.setStockAmount(3); */
		
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		
		
		System.out.println(product.getKod());

	}

}
