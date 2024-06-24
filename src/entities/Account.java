package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withDrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithDrawLimit() {
        return withdrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withdrawLimit = withDrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if(withdrawLimit < amount) {
            throw new IllegalArgumentException("the amount exceeds widthdraw Limit.");
        }
        if(balance < amount){
            throw  new IllegalArgumentException("Not enough balance.");
        }
        this.balance -= amount;

    }

    @Override
    public String toString() {
        return "New balance: " + String.format("%.2f", getBalance());
    }
}
