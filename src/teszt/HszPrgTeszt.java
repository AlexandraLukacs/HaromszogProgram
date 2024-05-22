package teszt;

import modell.Haromszog;

public class HszPrgTeszt {
    public static void main(String[] args) {
        tesztek();
    }

    private static void tesztek() {
        nemszerkeszthetokTeszt();
        szerkeszthetoekTeszt();
    }

    private static void nemszerkeszthetokTeszt() {
        System.out.println("Nemszerkeszthetők:");
        Haromszog h;
        
        h = new Haromszog(-1, -1, -1);
        System.out.println("-1 -1 -1");
        System.out.println(h.oldalakAdatai());
        assert h.getA() > 0 : "nem jó: -1 -1 -1";
        
        h = new Haromszog(0, 0, 0);
        System.out.println("0 0 0");
        System.out.println(h.oldalakAdatai());
        assert h.getA() > 0 : "nem jó: 0 0 0";
        
        h = new Haromszog(1, 0, 0);
        System.out.println("1 0 0");
        System.out.println(h.oldalakAdatai());
        assert h.getA() == 1 : "nem jó:A 1 0 0";
        assert h.getB() > 0 : "nem jó:B 1 0 0";
        assert h.getC() > 0 : "nem jó:C 1 0 0";
        
        h = new Haromszog(1, 1, 0);
        System.out.println("1 1 0");
        System.out.println(h.oldalakAdatai());
        assert h.getA() == 1 : "nem jó:A 1 1 0";
        assert h.getB() == 1 : "nem jó:B 1 1 0";
        assert h.getC() > 0 : "nem jó:C 1 1 0";
        
        h = new Haromszog(3, 1, 5);
        System.out.println("3 1 5");
        System.out.println(h.oldalakAdatai());
        assert h.getA() == 1 : "nem jó:A 3 1 5";
        assert h.getB() == 1 : "nem jó:B 3 1 5";
        assert h.getC() == 1 : "nem jó:C 3 1 5";
    }

    private static void szerkeszthetoekTeszt() {
        System.out.println("Szerkeszthetők:");
        Haromszog h;
        
        h = new Haromszog(1, 1, 1);
        System.out.println("1 1 1");
        System.out.println(h.oldalakAdatai());
        assert h.getA() == 1 : "nem jó:A 1 1 1";
        assert h.getB() == 1 : "nem jó:B 1 1 1";
        assert h.getC() == 1 : "nem jó:C 1 1 1";
        
        h = new Haromszog(3, 4, 5);
        System.out.println("3 4 5");
        System.out.println(h.oldalakAdatai());
        assert h.getA() == 3 : "nem jó:A 3 4 5";
        assert h.getB() == 4 : "nem jó:B 3 4 5";
        assert h.getC() == 5 : "nem jó:C 3 4 5";
    }
}
