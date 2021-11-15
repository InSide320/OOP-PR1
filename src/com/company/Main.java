package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer myTimer = new Timer();
        /*
            Встановлює початкову паузу протягом 1 секунди,
            а потім повторює завдання кожні пів секунди
         */
        myTimer.schedule(myTimerTask,1000,500);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException exc){
            System.out.println(exc.getMessage());
        }
        myTimer.cancel();
    }
}
