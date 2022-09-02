/*
Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
Fibonacci Serisi : 1 1 2 3 5 8 13 21 34
f(1) = 1
f(2) = 1
f(3) = 2
f(4) = 3
f(5) = 5
.....
f(n) = f(n-1) + f(n-2)  => yazacağımız metod bu formül olacak!

*/

package ödev31;

public class fibonacci_recursive {

    static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        System.out.print("Fibonacci serisinin ilgili sıradaki elemanı : " + fibonacci(10));
    }
}
