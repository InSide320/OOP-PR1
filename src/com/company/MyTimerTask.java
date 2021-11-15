package com.company;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Завдання виконується за таймером.");
    }
}
