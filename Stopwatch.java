/**
 * This code simulates a stopwatch. measuring time between start and stop clicks.
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */

import java.util.Scanner;

public class Stopwatch {

    static Scanner sc = new Scanner(System.in);

    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;

    //to start timer
    public void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    // to stop timer
    public void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);

    }

    public void getElapsedTime() {
        elapsed = stopTimer - startTimer;
        //return elapsed;
        System.out.println("elapsed Time is: " + elapsed / 1000);

    }

    public static void main(String[] args) throws Exception {

        Stopwatch stopwatch = new Stopwatch();

        int choice;

        System.out.println("Press '1' to Start Time: ");
        System.out.println("Press '2' to Stop Time: ");
        System.out.println("Press '3' to Exit");
        while (true) {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.stop();
                    stopwatch.getElapsedTime();
                    break;
            }
            if (choice ==3) {
                break;
            }
        }
    }
}


