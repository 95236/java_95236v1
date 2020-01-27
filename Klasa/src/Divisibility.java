// Utwórz klasę dziedziczšcš po Thread, której zadaniem jest wypisanie wszystkich liczb
// podzielnych przez 3 z zakresu liczb od X do Y.
// Utwórz kod, który wystartuje równolegle 5 wštków,
// gdzie każdy z wštków wypisze owe liczby na ekran w zakresach liczb odpowiednio 0-100,  101-200, 201-300 ...



public class Divisibility extends Thread {

    private int a;
    private int b;

    public Divisibility(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        for(int i = a; i<b; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Divisibility div1 = new Divisibility(0, 100);
        Divisibility div2 = new Divisibility(101, 200);
        Divisibility div3 = new Divisibility(201, 300);
        Divisibility div4 = new Divisibility(301, 400);
        Divisibility div5 = new Divisibility(401, 500);

        div1.start();
        
        div2.start();
        
        div3.start();
        
        div4.start();
        
        div5.start();
    }
}