import java.util.Scanner;

public class ZomatoOrder {
    //initialise the variables
    double orderAmount;
    double quantity;
    double discountRate;
    int taxRate;
    String Name;


//calculate the total amount of the order
    public double calculateTotalAmount(){
        double Totalamount;

        Totalamount = orderAmount*quantity;

                return Totalamount;
    }
    // calculate thhe discount price
    public double calculateDiscount(){
        double Discount;
       
        Discount = calculateTotalAmount()*(discountRate/100);

        return Discount;

    }
//claculate the tax 
    public double calculateTax(){
        double tax;
        
        tax=(calculateTotalAmount() - calculateDiscount())*taxRate/100;
        System.out.println("Tax applied : "+tax);

        return tax;
    }

    //calculate the total bill 
    public double calculateTotalBill(){
        double TotalBill;
       //call calculateTotalAmount ,calculateDiscount and calculateTax
        TotalBill = calculateTotalAmount() - calculateDiscount() + calculateTax();
        // System.out.println("Total Bill Amount: "+TotalBill);
        return TotalBill;

    }
// print the bill in required format
    public void printBill(){
        System.out.println("Name : "+Name);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Amount : "+calculateTotalAmount());
        System.out.println("Discount Applied : "+calculateDiscount());

        System.out.println("Order Amount : "+orderAmount);
        System.out.println("Total Bill Is  : "+calculateTotalBill());

    }
    //main method starts and JVM starts executionn from main method
    public static void main(String[] args) {
        // use Scanner to take the input from the user.
        Scanner sc = new Scanner(System.in);
        ZomatoOrder z1 = new ZomatoOrder();

        System.out.println("Enter Name");
        //enter the user name to print on the bill.
        z1.Name = sc.nextLine();
        System.out.println("Ente price per item");
        //input the price per item of the order
        z1.orderAmount = sc.nextInt();
        System.out.println("Enter Quantity");
        //Enter the quantity of the order
        z1.quantity = sc.nextInt();
        System.out.println("Discount Rate");
        // input the discount rate based on the store
        z1.discountRate = sc.nextInt();
        System.out.println("Enter Tax Rate");
        //input the tax rate
        z1.taxRate = sc.nextInt();
        z1.printBill();
        // z1.calculateTotalBill();
        
        


        
    }
    
}
