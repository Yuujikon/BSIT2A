/**
 * @(#)Book.java
 *
 * Book application
 *
 * @author 
 * @version 1.00 2024/10/8
 */
import  java.util.*;
 
public class Book {
	private static String author;
	private static double price;
	private static String title;
	
	public void setTitle(String x){
		this.title = x;
	}
    
    public void setAuthor(String x){
		this.author = x;
	}
	
	public void setPrice(double x){
		this.price = x;
	}
	
	//getter
	public String getTitle(){
		return title;
	}
    
    public String getAuthor(){
		return author;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void applyDiscount(double x){
		this.price -= (x / price) * 100;
	} 
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	Book bk = new Book();
    	
    	System.out.print("Enter title: ");
    	bk.setTitle(sc.nextLine());
    	System.out.print("Enter author: ");
    	bk.setAuthor(sc.nextLine());
    	System.out.print("Enter price: ");
    	bk.setPrice(sc.nextDouble());
    	
    	System.out.print("Add the discount? 'y' for y, 'n' for no: ");
    	char input = sc.next().charAt(0);
    	
    	if(input == 'y'){
    		System.out.print("Enter a Discount price: ");
    		bk.applyDiscount(sc.nextDouble());
    	}
    	
    	System.out.println("Athor: " + bk.getAuthor() + "\n"+
    			"Title: " + bk.getTitle() + "\n"+
    			"Price: " + bk.getPrice() + "");
    }
}
