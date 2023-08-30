import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode=scan.next();
		getProduct(productCode);
		
		
	}
    public static void getProduct(String productCode) {
    	switch(productCode) {
    	case "P01":
    		System.out.println("Cocacola");
    		break;
    	case "P02":
    		System.out.println("Pepsi");
    		break;
    	case "P03":
    		System.out.println("Fanta");
    		break;
    	case "P04":
    		System.out.println("Jaljeera");
    		break;
    	case "P05":
    		System.out.println("Mountain");
    		break;
    	case "P06":
    		System.out.println("");
    		break;
    	}
    }
}
