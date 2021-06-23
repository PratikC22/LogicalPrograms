/**
 * Stopwatch Program for measuring the time that elapses between the start and end clicks.
 *
 * @autor Pratik chaudhari
 * @since 14/06/2021.
 */

import java.util.Scanner;

public class StopWatch {
    public static long start() {

        long startTime = System.currentTimeMillis();
        return startTime;
    }

    public static long stop() {

        long stopTime = System.currentTimeMillis();
        return stopTime;
    }

    public static long timeElapsed(long endTime, long startTime) {

        long timeElapsed = endTime - startTime;
        return timeElapsed;

    }

    public static void main(String[] args) {

        long startTime = 0;
        long stopTime = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to start StopWatch :");
        int start = sc.nextInt();

        if (start == 1) {
            startTime = start();
        }

        System.out.println("Enter 2 to stop StopWatch :");
        int stop = sc.nextInt();

        if (stop == 2) {
            stopTime = stop();
        }

        long elapsedTime = timeElapsed(stopTime, startTime);
        int timeSecond = (int) ((elapsedTime / 1000) % 60); // convert millisecond to second
        System.out.println("Elapsed Time in Second : " + timeSecond);
    }


}