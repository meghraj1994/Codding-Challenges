package sukanya.Inheritance;

public class Runner {

    public static void main(String[] args) {

        //tesla
        Tesla t = new Tesla();
        t.start();
        t.stop();
        t.run();
        t.autoDriving();
        t.electricStart();


        //hundai
        Hyndai h = new Hyndai();
        h.start();
        h.stop();
        h.run();
        h.cheapPrice();


        //Tata
        Tata tata = new Tata();
        tata.electricStart();
        tata.autoDriving();
        tata.madeInIndia();


    }

}
