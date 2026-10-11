package multithreading;

import java.util.ArrayList;

class PrimeNumber extends Thread {

    static ArrayList<Integer> primes = new ArrayList<>();
    @Override
    public void run() {

        System.out.println("Prime Numbers:");

        for (int i = 2; i <= 1000; i++) {

            boolean prime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes.add(i);
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
