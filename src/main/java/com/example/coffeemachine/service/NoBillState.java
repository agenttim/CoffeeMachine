package com.example.coffeemachine.service;

import com.example.coffeemachine.service.CoffeeMachine;
import com.example.coffeemachine.service.State;

public class NoBillState implements State {

    CoffeeMachine coffeeMachine;

    public NoBillState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertBill() {

    }

    @Override
    public void ejectBill() {

    }

    @Override
    public void pressButton() {

    }

    @Override
    public void pourСoffee() {

    }

    @Override
    public void refill() {

    }
}



   /* GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() { }

    public String toString() {
        return "waiting for quarter";
    }*/
