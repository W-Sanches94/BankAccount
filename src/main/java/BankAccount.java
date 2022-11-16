 public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;

    // CONSTRUCTOR

     //Properties

     public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, int inputAccountNumber, int inputBalance){
         this.firstName = inputFirstName;
         this.lastName = inputLastName;
         this.dateOfBirth = inputDateOfBirth;
         this.accountNumber = inputAccountNumber;
         this.balance = inputBalance;
     }

     //Methods

     // Getters

     public String getFirstName(){return this.firstName;}
     public String getLastName(){return this.lastName;}
     public String getDateOfBirth(){return this.dateOfBirth;}
     public int getAccountNumber(){return this.accountNumber;}
     public int getBalance(){return this.balance;}

     // Setters

     public void setFirstName (String newFirstName) {this.firstName = newFirstName;}
     public void setLastName (String newLastName) {this.lastName = newLastName;}
     public void setDateOfBirth (String newDateOfBirth) {this.dateOfBirth = newDateOfBirth;}
     public void setAccountNumber (int newAccountNumber) {this.accountNumber = newAccountNumber;}
     public void setBalance (int newBalance) {this.balance = newBalance;}





}