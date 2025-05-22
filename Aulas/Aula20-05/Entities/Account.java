package Entities;

public class Account {
    private String name;
    private double balance;
    private boolean status;

    public Account(String name){
        this.name = name;
        this.balance = 0;
        this.status = false;
    }

    public Account(String name, double balance, boolean status){
        this.name = name;
        this.balance = balance;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name=" + name + ", Balance=" + balance + ", Especial =" + (status ? "Sim" : "Nao") + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
