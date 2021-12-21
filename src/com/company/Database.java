package com.company;

public class Database {
    private Account acc = new Account("имя");
    Atm atm1 = new Atm(acc, "atm1");
    Atm atm2 = new Atm(acc, "atm2");
    Atm atm3 = new Atm(acc, "atm3");

    void run() {
        new Thread(atm1).start();
        new Thread(atm2).start();
        new Thread(atm3).start();
    }
}
