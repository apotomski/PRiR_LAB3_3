package test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MonteCarlo m1, m2, m3, m4;
        int liczbaStrzalow = 1000;
        double a = 10;

        m1 = new MonteCarlo(0,0, a/2, a/2, liczbaStrzalow);
        m2 = new MonteCarlo(a/2,0, 1, a/2, liczbaStrzalow);
        m3 = new MonteCarlo(0, a/2, a/2, a, liczbaStrzalow);
        m4 = new MonteCarlo(a/2,a/2, a, a, liczbaStrzalow);

        m1.run();
        m2.run();
        m3.run();
        m4.run();

        try {
            m1.join();
            m2.join();
            m3.join();
            m4.join();
        }catch (Exception e){

        }
        double pole = m1.getWynik() + m2.getWynik() + m3.getWynik() + m4.getWynik();
        pole = pole / ((double)liczbaStrzalow * 4) * (a * a);
        System.out.println("Pole kola = " + pole);
    }
}
