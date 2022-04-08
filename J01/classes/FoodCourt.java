package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements RestaurantOperations, EmployeeOperations{

	protected Restaurant restaurants[] = new Restaurant[100];
	protected Employee employees[] = new Employee[100];
	
	
	static int res1 = 0 ;
	public void insertRestaurant(Restaurant r){

		boolean flag = false;
		
		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] == null){

				restaurants[i] = r;
				flag = true;
				res1++;
				break;
			}
		}
		if(flag) {
			System.out.println("\n\t=======================");
			System.out.println("\t||Restaurant Inserted  ||\n"+"\t||Total Restaurant : "+res1+" ||");
			System.out.println("\t=======================");
		}
		else System.out.println("\n\tRestaurant can Not be Inserted");
	}
	
	
	static int res2 = 0;
	public void removeRestaurant(Restaurant r){

		boolean flag = false;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] == r){

				restaurants[i] = null;
				flag = true;
				res2++;
				res1--;
				break;
			}
		}
		if(flag) {
			System.out.println("\n\t==========================");
			System.out.println("\t||Restaurant Removed    ||\n"+"\t||Remove Restaurant : "+res2+" ||\n\t||Total Restaurant : "+res1+"  ||");
			System.out.println("\t==========================");
		}
		else System.out.println("\n\tRestaurant can Not be Removed");
	}
	
	
	
	public Restaurant getRestaurant(String rid){
		
		Restaurant r = null;

		for(int i=0; i<restaurants.length; i++){

			if(restaurants[i] != null){

				if(restaurants[i].getRid().equals(rid)){

					r = restaurants[i];
					break;
				}
			}
		}
		return r;
	}
	
	
	
	public void showAllRestaurants(){

		for(Restaurant r : restaurants){

			if(r!= null){
				
				System.out.println("\tRestaurant rid: "+ r.getRid());
				System.out.println("\tRestaurant Name: "+ r.getName());
				r.showAllFoodItems();
				System.out.println();
			}
		}
	}
	
	
	static int emp1 = 0;
	public void insertEmployee(Employee e){
		boolean flag = false;
		
		for(int i=0; i<employees.length; i++){

			if(employees[i] == null){

				employees[i] = e;
				flag = true;
				emp1++;
				break;
			}
		}
		if(flag) {
			System.out.println("\n\t=======================");
			System.out.println("\t||Employee Inserted  ||\n"+"\t||Total Employee : "+emp1+" ||");
			System.out.println("\t=======================");
		}
		else System.out.println("\n\tEmployee can Not be Inserted");
	}
	
	
	static int emp2 = 0 ;
	public void removeEmployee(Employee e){

		boolean flag = false;

		for(int i=0; i<employees.length; i++){

			if(employees[i] == e){

				employees[i] = null;
				flag = true;
				emp2++;
				emp1--;
				break;
			}
		}
		if(flag) {
			System.out.println("\n\t=======================");
			System.out.println("\t||Employee Removed    ||\n"+"\t||Remove Employee : "+emp2+" ||\n\t||Total Employee : "+emp1+"  ||");
			System.out.println("\t=======================");
		}
		else System.out.println("\tEmployee can Not be Removed");
	}
	
	
	public void showAllEmployees(){

		for(Employee e : employees){

			if(e!= null){

				System.out.println("\tEmployee Name: "+ e.getName());
				System.out.println("\tEmployee Id: "+ e.getNid());
				System.out.println("\tSalary: "+ e.getSalary());
				System.out.println();
			}
		}
	}
	
	
	
	public Employee getEmployee(String nid){

		Employee e = null;
		
		for(int i=0; i<employees.length; i++){

			if(employees[i] != null){

				if(employees[i].getNid().equals(nid)){
					
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
}
