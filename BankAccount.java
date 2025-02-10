class BankAccount{
    //initialise the variables
    String accHolderName;
    double balance;
    long accNumber;
    boolean transaction;

    // provide a method withdraw to withdraw the amount
    public void withdraw(double amt){
        //check the condition
    if(amt <= balance){
    balance = balance - amt;
    transaction = true;
    sendMessage(transaction,amt);
    }
    // provide the required message
    else{
    System.out.println("Insufficient Funds.");
    }
    }
  // provide a method to deposit the amount.
    public void deposit(double amt){
    balance = balance + amt;
    transaction = false;
    sendMessage(transaction,amt);
    }
    //send the message to user about the transaction of anount.
    public void sendMessage(boolean transaction,double amt){
        if(transaction==true){
     System.out.println(amt+" has been withdrawn successfully");
        }
        else
     System.out.println(amt+"has been deposited to account successfully");
     System.out.println("Transaction Successful Your Available balance is : "+balance);
    
   }
   //add account details
public void bankAccountDetails(){
        System.out.println("Account Holder Name : "+accHolderName);
        System.out.println("Account Number : "+accNumber);
        System.out.println("Balance : "+balance);

}
//main method begins  
public static void main(String []args){
    //create the object of the senders Bank Account
    BankAccount b1 = new BankAccount();
    b1.accHolderName = "Tony";
    b1.accNumber = 194510184;
    b1.balance = 50000;
//Create the object of the receivers Bank Accoount
    BankAccount b2 = new BankAccount();
    b2.accHolderName = "Alice";
    b2.accNumber = 546515;
    b2.balance = 5000;
//call the bankAccountDetails and provide the amount that you wnat to deposit or withdraw
    b1.bankAccountDetails();
    b1.withdraw(20000);
    b1.deposit(10000);
//call the bankAccountDetails and provide the amount that you wnat to deposit or withdraw

    b2.bankAccountDetails();
    b2.withdraw(200);
    b2.deposit(300);

}
}