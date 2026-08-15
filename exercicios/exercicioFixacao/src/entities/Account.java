package entities;

public class Account {
    private int idAccount;
    private String titular;
    private double saldo;


    
    public Account() {
    }


    public Account(int idAccount, String titular) {
        this.idAccount = idAccount;
        this.titular = titular;
    }


    public Account(int idAccount, String titular, double initialDeposit) {
        this.idAccount = idAccount;
        this.titular = titular;
        deposit(initialDeposit);
    }


    public int getIdAccount() {
        return idAccount;
    }

    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getAccount() {
        return saldo;
    }


    public void setAccount(double saldo) {
        this.saldo = saldo;
    }

    public void deposit(double depositValue){
        saldo += depositValue;
    };

    public void withdrawal(double withdrawValue){
        saldo -= withdrawValue + 5;
    }

    public String toString() {
        return "Account data: \n Account: "
        + idAccount
                + ", Holder: "
                + titular
                + ", Balance: $ "
                + String.format("%.2f", saldo);
               
    }
    
    
}
