package test;

import java.util.Random;

public class MonteCarlo extends Thread {
    double xStart, yStart, xStop, yStop;
    int liczbaStrzalow;
    double wynik;
    Random r;

    public MonteCarlo(double xStart, double yStart, double xStop, double yStop, int liczbaStrzalow) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xStop = xStop;
        this.yStop = yStop;
        this.wynik = 0;
        this.liczbaStrzalow = liczbaStrzalow;
        this.r = new Random();
    }

    public void run() {
        int wKole = 0;

        for (int i = 0; i < this.liczbaStrzalow; i++) {
//            double x = (this.xStop - this.xStart) * r.nextDouble() + this.xStart;
//            double y = (this.yStop - this.yStart) * r.nextDouble() + this.yStart;
            double x = Math.random();
            double y = Math.random();

            if ((x * x + y * y) <= 1)
                wKole++;
        }

        this.wynik = wKole;
    }

    public double getWynik() {
        return this.wynik;
    }

}
