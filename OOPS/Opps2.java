package OOPS;

public class Opps2 {
    public static void main(String[] args) {
       
        BankAccount myAcc = new BankAccount();
        myAcc.username = "deepShikha";
        myAcc.setPassword("hgkakjse");

    }
 
}
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}
