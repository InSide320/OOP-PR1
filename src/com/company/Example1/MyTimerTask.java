package com.company.Example1;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    static private int n =0;
    @Override
    public void run() {
        n++;
        System.out.println("Завдання виконується за таймером." +n);
    }
}
