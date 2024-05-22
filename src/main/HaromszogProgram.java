package main;

import modell.Haromszog;

public class HaromszogProgram {

    private Haromszog h;
    
    public static void main(String[] args) {
        new HaromszogProgram().haromszogHasznalata();
    }

    private void haromszogHasznalata() {
        System.out.println("--- new Haromszog(3, 4, 5)");
        h = new Haromszog(3, 4, 5);
        kiir();
    }

    private void kiir() {
        System.out.println(h.oldalakAdatai());
    }
    
}
