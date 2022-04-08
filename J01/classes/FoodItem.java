package classes ;

import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity{
	protected String fid ;
	protected String name ;
	protected int availableQuantity ;
	protected double price ;


	public void setFid(String fid){this.fid = fid ; }
	public void setName(String name){this.name = name ;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity ; }
	public void setPrice(double price){this.price = price ; }

	public String getFid(){return fid ; }
	public String getName(){return name ; }
	public int getAvailableQuantity(){return availableQuantity ;}
	public double getPrice(){return price ;}

	public abstract void showInfo() ;

	public void addQuantity(int amount){
		if(amount > 0){
			System.out.println("\t=======================================================");
			System.out.println("\tAvailable FoodItem Before : " + availableQuantity) ;
			System.out.println("\tAmount of Adding FoodItem : " + amount ) ;

			availableQuantity += amount ;

			System.out.println("\tAbailable FoodItem Now : " + availableQuantity ) ;
			System.out.println("\t=======================================================");
		}

		else{
			System.out.print("\t** You have to Add FoodItem and so amount must be positive.");
		}
	}


	public void sellQuantity(int amount){
		if(amount > 0 && amount <= availableQuantity){
			System.out.println("\t=====================================================");
			System.out.println("\tPrevious Amount for Sell : " + availableQuantity);
			System.out.println("\tOrder for Sell : " + amount) ;

			availableQuantity -= amount ;

			System.out.println("\tAmount for Sell Now : " + availableQuantity ) ;
			System.out.println("\t====================================================");
		}
	}
}