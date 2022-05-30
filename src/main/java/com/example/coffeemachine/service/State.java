package com.example.coffeemachine.service;

public interface State {

    public void insertBill();
    public void ejectBill();
    public void pressButton();
    public void takeСoffee();

    public void refill();
}
