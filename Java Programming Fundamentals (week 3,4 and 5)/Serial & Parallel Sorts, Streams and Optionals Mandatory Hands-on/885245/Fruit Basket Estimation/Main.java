import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option=0;
		String fruitName="";
		int weightInKgs=0;
		int pricePerKg=0;
		FruitBasketUtility utilObj=new FruitBasketUtility();
		do {
			System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
			option=sc.nextInt();
			sc.nextLine();
			switch (option)
			{
			case 1:
				System.out.println("Enter the fruit name");
				fruitName=sc.nextLine();
				System.out.println("Enter weight in Kgs");
				weightInKgs=sc.nextInt();
				System.out.println("Enter price per Kg");
				pricePerKg=sc.nextInt();
				FruitBasket fbObj=new FruitBasket(fruitName,weightInKgs,pricePerKg);
				utilObj.addToBasket(fbObj);
				break;
			case 2:
				// Fill your code here
				
                List<FruitBasket> fb = utilObj.getFruitBasketList();
                if(fb.isEmpty())
                {
                    System.out.println("Your basket is empty. Please add fruits.");
                }
                else
                {
                    System.out.println("The estimated bill amount is Rs "+utilObj.calculateBill(fb.stream()));
                }
                break;
			case 3:
				System.out.println("Thank you for using the application.");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}

		}
		while(option!=3);
		sc.close();

	}

}
