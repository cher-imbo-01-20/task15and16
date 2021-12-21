package com.company;

public class Robot {
    private final Object mon = new Object();
    Leg left= new Leg("LEFT", mon);
    Leg right= new Leg("RIGHT", mon);

    void run()
    {
        new Thread(left).start();
        new Thread(right).start();
    }
}
