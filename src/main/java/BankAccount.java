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





}