package modell;

public class Haromszog {
    private int a, b, c;
    private boolean szerkesztheto;

    /* Generálható: ALT ++ INSERT */
    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        /* Ezt nem tudta legenerálni, ezt megírtuk */
        this.szerkesztheto = szerkeszthetosegVizsgalat();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.szerkesztheto = szerkeszthetosegVizsgalat();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        this.szerkesztheto = szerkeszthetosegVizsgalat();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
        this.szerkesztheto = szerkeszthetosegVizsgalat();
    }
    
    /* Ezek nem generáltathatóak, mi írjuk meg */
    public int kerulet(){
        if(szerkesztheto){
            return a+b+c;
        }else{
            return -1;
        }
    }
    
    
    public String oldalakAdatai() {
        if(szerkesztheto){
            return "a=" + a + ", b=" + b + ", c=" + c;
        }else{
            return "Nem szerkeszthető a háromszög!";
        }
    }
    
    private boolean szerkeszthetosegVizsgalat(){
        return a+b > c && a+c > b && b+c > a;
    }
    
}
