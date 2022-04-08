package classes ;

import java.lang.*;
import interfaces.*;

public class MainDish extends FoodItem{
	private String category ;

	public void setCategry(String category){this.category = category ;}
	public String getCategory(){return category ;}

	public void showInfo(){
		System.out.println("\t||Food Fid : " + fid);
		System.out.println("\t||Food Name : " + name);
		System.out.println("\t||Available Food Quantity : " + availableQuantity ) ;
		System.out.println("\t||Price : " + price ) ;
		System.out.println("\t||Category : " + category ) ;
	}
}