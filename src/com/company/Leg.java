package com.company;

public class Leg implements Runnable {
    final String name;
    private Object moni;

    public Leg(String name, Object mon) {
        this.name = name;
        this.moni = mon;
    }

    @Override
    public void run() {
        synchronized (moni) {
            while (true) {
                step();
                moni.notifyAll();
                try {
                    moni.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void step()
    {
        System.out.println(name);
    }
}
