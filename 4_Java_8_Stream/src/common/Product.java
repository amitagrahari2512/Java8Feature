package common;

public class Product{  
    public int id;  
    public String name;  
    public float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" : " + this.name + " : "+ this.price;
	}  
    
    
    
}  