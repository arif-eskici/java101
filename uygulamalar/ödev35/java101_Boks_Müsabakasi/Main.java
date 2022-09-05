package ödev35.java101_Boks_Müsabakasi;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter ("Ahmet", 10, 100, 105, 30);
        Fighter f2 = new Fighter ("Mehmet", 15, 95, 85, 20);

        Match match = new Match (f1, f2, 85, 100);
        match.start();

    }
 
}
