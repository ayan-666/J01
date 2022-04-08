package classes ;

import java.lang.* ;
import interfaces.*;

public class Appitizers extends FoodItem{
	String size ;

	public void setSize(String size){this.size = size ;}
	public String getSize(){return size;}

	public void showInfo(){
		System.out.println("\t||Food Fid : " + fid);
		System.out.println("\t||Food Name : " + name);
		System.out.println("\t||Available Food Quantity : " + availableQuantity ) ;
		System.out.println("\t||Price : " + price ) ;
		System.out.println("\t||Size : " + size ) ;
	}
}