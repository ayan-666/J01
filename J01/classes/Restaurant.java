package classes ;

import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations{
	protected String rid ;
	protected String name ;
	protected FoodItem fooditems[] = new FoodItem[100] ;


	public void setName(String name){this.name = name ;}
	public void setRid(String rid){this.rid = rid ;}
	public String getName(){return name ;}
	public String getRid(){return rid ;}

	public void insertFoodItem(FoodItem f){
		boolean flag = false ;

		for(int i = 0 ; i < fooditems.length ; i++){
			if(fooditems[i] == null){
				fooditems[i] = f ;
				flag = true ;
				break ;
			}
		}

		if(flag) System.out.println("\tFood Item Added.") ;
		else System.out.println("\tNot possible to add the item.");
	}


	public void removeFoodItem(FoodItem f){
		boolean flag = false ;

		for(int i = 0 ; i < fooditems.length ; i++){
			if(fooditems[i] == f){
				fooditems[i] = null;
				flag = true ;
				break ;
			}
		}

		if(flag) System.out.println("\tFood Item Removed.") ;
		else System.out.println("\tFood Item Not Found.");
	}

	public FoodItem getFoodItem(String fid){
		FoodItem f = null ;

		for(int i=0; i<fooditems.length; i++){

			if(fooditems[i] != null){

				if(fooditems[i].getFid().equals(fid)){
					f = fooditems[i];
					break;
				}
			}
		}
		return f;
	}

	public void showAllFoodItems(){
		for(FoodItem f : fooditems){

			if(f != null){
				
				f.showInfo();
			}
		}
	}

}