package math1;

public class PrimeNumber_01 {

    int number = 1;

    public PrimeNumber_01() {
    }

    public PrimeNumber_01(int number) {
        this.number = number;
    }

    public String prime() {
        int count = 0;
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                count++;

            }

        }
        if (count == 2) {
            return "It is a prime number";
        } else {
            return "It is not a Prime number";
        }

    }
}
