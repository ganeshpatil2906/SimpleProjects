import java.util.Scanner;

public class ZomatoOrder {
    double orderAmount;
    double quantity;
    double discountRate;
    int taxRate;
    String Name;



    public double calculateTotalAmount(){
        double Totalamount;

        Totalamount = orderAmount*quantity;

                return Totalamount;
    }
    public double calculateDiscount(){
        double Discount;
       
        Discount = calculateTotalAmount()*(discountRate/100);

        return Discount;

    }

    public double calculateTax(){
        double tax;
        
        tax=(calculateTotalAmount() - calculateDiscount())*taxRate/100;
        System.out.println("Tax applied : "+tax);

        return tax;
    }
    public double calculateTotalBill(){
        double TotalBill;
       
        TotalBill = calculateTotalAmount() - calculateDiscount() + calculateTax();
        // System.out.println("Total Bill Amount: "+TotalBill);
        return TotalBill;

    }

    public void printBill(){
        System.out.println("Name : "+Name);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Amount : "+calculateTotalAmount());
        System.out.println("Discount Applied : "+calculateDiscount());

        System.out.println("Order Amount : "+orderAmount);
        System.out.println("Total Bill Is  : "+calculateTotalBill());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZomatoOrder z1 = new ZomatoOrder();
        System.out.println("Enter Name");
        z1.Name = sc.nextLine();
        System.out.println("Ente price per item");
        z1.orderAmount = sc.nextInt();
        System.out.println("Enter Quantity");
        z1.quantity = sc.nextInt();
        System.out.println("Discount Rate");
        z1.discountRate = sc.nextInt();
        System.out.println("Enter Tax Rate");
        z1.taxRate = sc.nextInt();
        z1.printBill();
        // z1.calculateTotalBill();
        
        


        
    }
    
}
