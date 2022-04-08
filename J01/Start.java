import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.io.*;

public class Start
{
	public static void main(String args[])
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(isr);
		Scanner sc = new Scanner(System.in);
		FoodCourt f = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("\t|||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("\t|| Welcome to Food Court Management System ||");
		System.out.println("\t|||||||||||||||||||||||||||||||||||||||||||||\n\n");

		boolean repeat = true;
		
		while(repeat)
		{
			int choice = 0;
			try
			{
				System.out.println("\t|||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("\t||  What do you want to do?                ||");
				System.out.println("\t||	1. Employee Management             ||");
				System.out.println("\t||	2. Restaurant Management           ||");
				System.out.println("\t||	3. Restaurant FoodItem Management  ||");
				System.out.println("\t||	4. FoodItem Quantity Add-Sell      ||");
				System.out.println("\t||	5. Exit                            ||");
				System.out.println("\t|||||||||||||||||||||||||||||||||||||||||||||");

				System.out.print("\nYour Choice: ");
				choice = sc.nextInt();
			}

			catch(InputMismatchException ims)
			{
				System.out.println("\n\t*****************************");
				System.out.println("\t| Input Missmatch Exception |");
				System.out.println("\t*****************************\n");
				sc.next();
			}

			finally
			{

				switch(choice)
				{
					case 1:

					int option1 = 0 ;

					try{
						

						System.out.println("\t----------------------------------------");
						System.out.println("\t||You have choosen Employee Management||");
						System.out.println("\t----------------------------------------");

						System.out.println("\n\t-----------------------------------------------");
						System.out.println("\t||Choose any one Option from the followings  ||");
						System.out.println("\t||	1. Insert New Employee               ||");
						System.out.println("\t||	2. Get an Employee                   ||");
						System.out.println("\t||	3. Removing an Existing Employee     ||");
						System.out.println("\t||	4. Show All Employees                ||");
						System.out.println("\t||	5. Go Back                           ||");
						System.out.println("\t-----------------------------------------------");
						
						System.out.print("\nYour Option: ");
						option1 = sc.nextInt();
					}

					catch(InputMismatchException ims){
						System.out.println("\n\t*****************************");
						System.out.println("\t| Input Missmatch Exception |");
						System.out.println("\t*****************************");
						sc.next();
					}
					catch(Exception ioe){
						System.out.print(ioe.getMessage());
					}
					finally{
						
						switch(option1)
						{
							case 1:

							try{
							
								System.out.println("\t=======================");
								System.out.println("\t||Insert New Employee||");
								System.out.println("\t=======================");
								
								System.out.print("\n\tEnter Employee ID:     ");
								String nid1 = cin.readLine();
								System.out.print("\tEnter Employee Name:   ");
								String name1 = cin.readLine();
								System.out.print("\tEnter Employee Salary: ");
								double salary1 = sc.nextDouble();
								
								Employee e1 = new Employee();
								e1.setNid(nid1);
								e1.setName(name1);
								e1.setSalary(salary1);
								
								f.insertEmployee(e1);
							}
							catch(InputMismatchException ims1){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(Exception e){
								e.printStackTrace();
							}
								break;
								
							case 2:

							try{
							
								System.out.println("\n\t ====================");
								System.out.println("\t || Get An Employee ||");
								System.out.println("\t ====================\n");
								
								System.out.print("Enter Employee ID: ");
								String nid2 = cin.readLine();
								
								Employee e2 = f.getEmployee(nid2);
								
								if(e2 !=null)
								{
									System.out.println("\n\t===================================");
									System.out.println("\t|| Employee ID: "+e2.getNid());
									System.out.println("\t|| Employee Name: "+e2.getName());
									System.out.println("\t|| Employee Salary: "+e2.getSalary());
									System.out.println("\t===================================\n");
								}
								else{
									System.out.println("\n\t ======================");
									System.out.println("\t ||Employee Not Found. ||");
									System.out.println("\t ========================");
								}
							}
							catch(InputMismatchException mis2){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
							catch(NullPointerException npe){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								
								break;
								
							case 3:
							try{
							
								System.out.println("\t===============================");
								System.out.println("\t||Remove an Existing Employee||");
								System.out.println("\t===============================");
								
								System.out.print("Enter Employee ID: ");
								String nid3 = cin.readLine();
								
								Employee e3 = f.getEmployee(nid3);
								
								if(e3 != null)
								{
									f.removeEmployee(e3);
								}
								else{
									System.out.println("\t===============================");
									System.out.println("\t||Employee not Exist         ||");
									System.out.println("\t===============================");
								}


							}
							
							catch(NullPointerException n){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}	
							catch(InputMismatchException ii){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								break;
								
							case 4:

							try{
							
								System.out.println("\t*************************");
								System.out.println("\t||Show All Employees   ||");
								System.out.println("\t*************************\n");
								f.showAllEmployees();
								
								break;
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
								sc.next();
							}
								
							case 5:
							
								System.out.println("\t====================");
								System.out.println("\t|*** Going Back ***|");
								System.out.println("\t====================\n");
								break;
								
							default:

								System.out.println("\t|| Invalid Option       ||");
								System.out.println("\t|| Please Choose Again  ||");
								System.out.println("\t==========================");
								break;
						}
						
						break;
					}	
					
						
					case 2:

					int option2 = 0 ;

					try{
					
						System.out.println("\n\t==========================================");
						System.out.println("\t||You have choosen Restaurant Management||");
						System.out.println("\t==========================================\n");
						
						System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("\t||Choose any one Option from the followings ||");
						System.out.println("\t||	1. Insert New Restaurant            ||");
						System.out.println("\t||	2. Get a Restaurant                 ||");
						System.out.println("\t||	3. Removing an Existing Restaurant  ||");
						System.out.println("\t||	4. Show All Restaurant              ||");
						System.out.println("\t||	5. Go Back                          ||");
						System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||\n");
						
						System.out.print("Your Option: ");
						option2 = sc.nextInt();
						
					}
					catch(InputMismatchException ime){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************");
								sc.next();
					}
					finally{
						switch(option2)
						{
							case 1:

							try{
							
								System.out.println("\t=========================");
								System.out.println("\t||Insert New Restaurant||");
								System.out.println("\t=========================");
								
								System.out.print("\n\tEnter Restaurant RID:  ");
								String rid1 = cin.readLine();
								System.out.print("\tEnter Restaurant Name: ");
								String name1 = cin.readLine();
								
								
								Restaurant r1 = new Restaurant();
								r1.setRid(rid1);
								r1.setName(name1);
							
								f.insertRestaurant(r1);

							}
							catch(InputMismatchException ii){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
								sc.next();
							}
								
								break;
								
							case 2:

							try{
							
								System.out.println("\n\t ====================");
								System.out.println("\t || Get A Restaurant ||");
								System.out.println("\t ====================\n");
								
								System.out.print("Enter Restaurant RID: ");
								String rid2 = cin.readLine();
								
								Restaurant r2 = f.getRestaurant(rid2);
								
								if(r2 !=null)
								{
									System.out.println("\n\t===================================");
									System.out.println("\t||Restaurant RID: "+r2.getRid());
									System.out.println("\t||Restaurant Name: "+r2.getName());
									r2.showAllFoodItems();
									System.out.println("\t===================================\n");
								}
								else{
									System.out.println("\t================================");
									System.out.println("\t||Restaurant not Exist        ||");
									System.out.println("\t================================");
								}
								
							}
							catch(NullPointerException nn){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(InputMismatchException iio){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(Exception ww){
								System.out.print(ww.getMessage());
							}
								break;
								
							case 3:

							try{
							
								System.out.println("\t================================");
								System.out.println("\t||Remove an Existing Restaurant||");
								System.out.println("\t================================");
								
								System.out.print("Enter Restaurant RID: ");
								String rid3 = cin.readLine();
								
								Restaurant r3 = f.getRestaurant(rid3);
								
								if(r3 != null)
								{
									f.removeRestaurant(r3);
								}
								else{
									System.out.println("\t================================");
									System.out.println("\t||Restaurant not Exist        ||");
									System.out.println("\t================================");
								}
								

							}
							catch(InputMismatchException ii){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(NullPointerException oo){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
								sc.next();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								break;
								
							case 4:
							
							try{
								System.out.println("\t*************************");
								System.out.println("\t||Show All Restaurant   ||");
								System.out.println("\t*************************\n");
								f.showAllRestaurants();
								break;
							}
							catch(ArrayIndexOutOfBoundsException aaa){
								System.out.println("\n\t**************************************");
								System.out.println("\t| Array Index Out Of Bounds Exception |");
								System.out.println("\t***************************************\n");
								sc.next();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								
							case 5:
							
								System.out.println("\t====================");
								System.out.println("\t|*** Going Back ***|");
								System.out.println("\t====================\n");
								break;
								
							default:
							
								System.out.println("\t|| Invalid Option       ||");
								System.out.println("\t|| Please Choose Again  ||");
								System.out.println("\t==========================");
								break;
						}
						break;

					}
						
					case 3:

					int option3 = 0 ;

					try{
					
						System.out.println("\n\t=================================================");
						System.out.println("\t||You have choosen Restaurant FoodItem Management||");
						System.out.println("\t===================================================\n");


						System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||||");
						System.out.println("\t||Choose any one Option from the followings   ||");
						System.out.println("\t||	1. Insert New FoodItem                ||");
						System.out.println("\t||	2. Get a FoodItem                     ||");
						System.out.println("\t||	3. Removing an Existing FoodItem      ||");
						System.out.println("\t||	4. Show All FoodItem                  ||");
						System.out.println("\t||	5. Go Back                            ||");
						System.out.println("\t||||||||||||||||||||||||||||||||||||||||||||||\n");
						
						System.out.print("Your Option: ");
						option3 = sc.nextInt();
					}
					catch(InputMismatchException iii){
							System.out.println("\n\t*****************************");
							System.out.println("\t| Input Missmatch Exception |");
							System.out.println("\t*****************************");
							sc.next();
					} 
					finally{
						FoodItem fi = null;
						switch(option3)
						{
							case 1:

							int type = 0 ;

							try{
							
								System.out.println("\n\t==========================================");
								System.out.println("\t||Insert New FoodItem for a Restaurant  ||");
								System.out.println("\t==========================================");

								System.out.println("\n\t===================================================");
								System.out.println("\t||Which type of FoodItem do you want to Create?  ||");
								System.out.println("\t||	1. MainDish                              ||");
								System.out.println("\t||	2. Appetiziers                           ||");
								System.out.println("\t||	3. Go Back                               ||");
								System.out.println("\t===================================================");
								
								System.out.print("Enter Type: ");
								type = sc.nextInt();
							}
							catch(InputMismatchException ii){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
								
								if(type == 1)
								{

								try{
									MainDish ma = new MainDish();
									
									System.out.print("\tEnter FoodItem Id: ");
									String fid1 = cin.readLine();
									System.out.print("\tEnter FoodItem Name: ");
									String fname1 = cin.readLine();
									System.out.print("\tEnter Avaiable FoodItem: ");
									int faq1 = sc.nextInt();
									System.out.print("\tEnter Food Price: ");
									double fp1 = sc.nextDouble();
									System.out.print("\tEnter MainDish Category : ");
									String cat = cin.readLine();
									
									ma.setFid(fid1);
									ma.setName(fname1);
									ma.setAvailableQuantity(faq1);
									ma.setPrice(fp1);
									ma.setCategry(cat);
									
									fi = ma;
								}
								catch(InputMismatchException oo){
									System.out.println("\n\t*****************************");
									System.out.println("\t| Input Missmatch Exception |");
									System.out.println("\t*****************************");
									sc.next();
								}
								catch(Exception e){
									System.out.print(e.getMessage());
								}
									
								}
								else if(type == 2)
								{

								try{
									Appitizers ap = new Appitizers();
									
									System.out.print("\tEnter FoodItem Id: ");
									String fid2 = cin.readLine();
									System.out.print("\tEnter FoodItem Name: ");
									String fname2 = cin.readLine();
									System.out.print("\tEnter Avaiable FoodItem: ");
									int faq2 = sc.nextInt();
									System.out.print("\tEnter Food Price: ");
									double fp2 = sc.nextDouble();
									System.out.print("\tEnter Appetiziers Size :");
									String si = cin.readLine();
									
									ap.setFid(fid2);
									ap.setName(fname2);
									ap.setAvailableQuantity(faq2);
									ap.setPrice(fp2);
									ap.setSize(si);
									
									fi = ap;
								}
								catch(InputMismatchException oo){
									System.out.println("\n\t*****************************");
									System.out.println("\t| Input Missmatch Exception |");
									System.out.println("\t*****************************");
									sc.next();
								}
								catch(Exception ee){
									System.out.print(ee.getMessage());
								}
									
								}
								else if(type == 3)
								{
									System.out.println("\t====================");
									System.out.println("\t|*** Going Back ***|");
									System.out.println("\t====================\n");
								}
								else
								{
									System.out.println("\t|| Invalid Option       ||");
									System.out.println("\t|| Please Choose Again  ||");
									System.out.println("\t==========================");
								}
							try{
								if(fi!= null)
								{
									System.out.print("\tEnter Restaurant RID: ");
									String rid11 = sc.next();
									f.getRestaurant(rid11).insertFoodItem(fi);
								}
							}
							catch(NullPointerException nn){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								break;
								
							case 2:

							try{
							
								System.out.println("\n\t===================================");
								System.out.println("\t||Get an FoodItem of a Restaurant||");
								System.out.println("\t===================================");
								
								System.out.print("\tEnter FoodItem Id: ");
								String rid2 = cin.readLine();
								System.out.print("\tEnter Restaurant Id: ");
								String rname2 = cin.readLine();
								
								FoodItem fi2 = f.getRestaurant(rname2).getFoodItem(rid2);
								
								if(rid2 != null)
								{
									System.out.println("\t=================================");
									fi2.showInfo();
									System.out.println("\t==================================");
								}
							}
							catch(InputMismatchException io){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
							catch(NullPointerException nj){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								break;
								
							case 3:

							try{
							
								System.out.println("\n\t=====================================");
								System.out.println("\t||Remove an FoodItem of a Restaurant||");
								System.out.println("\t======================================");
								
								System.out.print("\tEnter Restaurant RID: ");
								String rid3 = cin.readLine();
								System.out.print("\tEnter FoodItem FID: ");
								String fid3 = cin.readLine();
								
								f.getRestaurant(rid3).removeFoodItem(f.getRestaurant(rid3).getFoodItem(fid3));
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
								sc.next();
							}
								
								break;
							
							case 4: 

							try{
							
								System.out.println("\n\t=====================================");
								System.out.println("\t||Show All FoodItems of a Restaurant||");
								System.out.println("\t=====================================");
								
								System.out.print("\tEnter Restaurant RID: ");
								String rid4 = cin.readLine();
								
								f.getRestaurant(rid4).showAllFoodItems();
							}
							catch(Exception ee){
								System.out.print(ee.getMessage());
							}
								
								break;
								
							case 5:
							
								System.out.println("\t====================");
								System.out.println("\t|*** Going Back ***|");
								System.out.println("\t====================\n");
								break;
								
							default:
							
								System.out.println("\t|| Invalid Option       ||");
								System.out.println("\t|| Please Choose Again  ||");
								System.out.println("\t==========================");
								break;
						}
					}
						break;
						
					case 4:

					int option4 = 0 ;

					try{
					
						System.out.println("\n\t-----------------------------------------------");
						System.out.println("\t||You have choosen FoodItem Quantity Add-Sell||");
						System.out.println("\t-----------------------------------------------");
						
						System.out.println("\n\t==============================================");
						System.out.println("\t||Choose any one Option from the followings ||");
						System.out.println("\t||	1. Add FoodItem                     ||");
						System.out.println("\t||	2. Remove FoodItem                  ||");
						System.out.println("\t||	3. Show All FoodItem                ||");
						System.out.println("\t||	4. Go Back                          ||");
						System.out.println("\t==============================================");
						
						System.out.print("Your Option: ");
						option4 = sc.nextInt();

					}
					catch(InputMismatchException ii){
							System.out.println("\n\t*****************************");
							System.out.println("\t| Input Missmatch Exception |");
							System.out.println("\t*****************************");
							sc.next();
					}
					finally{
						
						switch(option4)
						{
							case 1:

							try{
								System.out.println("\n\t-------------------------");
								System.out.println("\t||   Add FoodItem      ||");
								System.out.println("\t-------------------------");

								System.out.print("\tEnter Restaurant RID: ");
								String rid1 = cin.readLine();
								System.out.print("\tEnter FoodItem Id: ");
								String fid1 = cin.readLine();
								System.out.print("\tEnter FoodItem Amount: ");
								int amount1 = sc.nextInt();
								
								if(amount1>0)
								{
									f.getRestaurant(rid1).getFoodItem(fid1).addQuantity(amount1);
									frwd.writeInFile("\t"+amount1+" has been added in FoodItem "+ fid1);
								}
							}
							catch(NullPointerException no){
								System.out.println("\n\t*****************************");
								System.out.println("\t|    Null Pointer Exception |");
								System.out.println("\t|      Please Try Again     |");
								System.out.println("\t*****************************\n");
							}
							catch(Exception ioe)
							{
								ioe.printStackTrace();
							}
								break;
								
							case 2:

							try{
							
								System.out.println("\n\t=======================");
								System.out.println("\t|| Remove FoodItem    ||");
								System.out.println("\t=======================");

								System.out.print("\tEnter Restaurant RID: ");
								String rid2 = cin.readLine();
								System.out.print("\tEnter FoodItem Fid: ");
								String fid2 = cin.readLine();
								System.out.print("\tEnter remove FoodItem amount: ");
								int amount2 = sc.nextInt();
								
								if(amount2>0 && amount2<=f.getRestaurant(rid2).getFoodItem(fid2).getAvailableQuantity())
								{
									f.getRestaurant(rid2).getFoodItem(fid2).sellQuantity(amount2);
									frwd.writeInFile("\t"+amount2+" has been removed from FoodItem "+ fid2);
								}

							}
							catch(InputMismatchException ioe){
								System.out.println("\n\t*****************************");
								System.out.println("\t| Input Missmatch Exception |");
								System.out.println("\t*****************************");
								sc.next();
							}
							catch(Exception ioe){
								ioe.printStackTrace();
								sc.next();
							}
								break;
							
							
							
							case 3:
							
								System.out.println("\n\t===========================");
								System.out.println("\t||Show Add Sell History  ||");
								System.out.println("\t===========================");

								frwd.readFromFile();
								break;
								
							case 4:
							
								System.out.println("\t====================");
								System.out.println("\t|*** Going Back ***|");
								System.out.println("\t====================\n");
								break;
								
							default:
							
								System.out.println("\t|| Invalid Option       ||");
								System.out.println("\t|| Please Choose Again  ||");
								System.out.println("\t==========================");
								break;
							
						}
					}
						break;
						
					case 5:
					
						System.out.println("\t*******************************");
						System.out.println("\t||  You have choosen to Exit  ||");
						System.out.println("\t********************************");
						repeat = false;
						
						break;
						
					default:
					
						System.out.print("\t-------------------------------------------\n");
						System.out.print("\t|Your Enter Button Is Not Match Any option|\n");
						System.out.print("\t-------------------------------------------\n");
						System.out.print("\t|||||||||||||||||||||||||||||||||||||||||||||\n");
						System.out.print("\t||   Sorry Dear You Enter An Wrong Input.  ||\n");
						System.out.print("\t||   You Have to Enter An integer Number.  ||\n");
						System.out.print("\t|||||||||||||||||||||||||||||||||||||||||||||\n");
						System.out.print("\t\t||Choose The Right Option.||\n");
						System.out.print("\t\t||||||||||||||||||||||||||||\n");
						break;
			}

			}	
		}
	}	
		
}
