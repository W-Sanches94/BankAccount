 public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Integer accountNumber;
    private Integer balance;

    // CONSTRUCTOR

     public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth, Integer inputAccountNumber, Integer inputBalance) {
         this.firstName = inputFirstName;
         this.lastName = inputLastName;
         this.dateOfBirth = inputDateOfBirth;
         this.accountNumber = inputAccountNumber;
         this.balance = inputBalance;
     }


}