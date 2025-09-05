package BasicQuestion;

import java.util.*;

public class SlidingWindowProtocol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the window size: ");
        int windowSize = scanner.nextInt();


        System.out.print("Enter total number of frames to transmit: ");
        int totalFrames = scanner.nextInt();


        int[] frames = new int[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            frames[i] = random.nextInt(100);
        }

        System.out.println("\nRandomly generated frames to send:");
        System.out.println(Arrays.toString(frames));



        int current = 0;
        while (current < totalFrames) {
            int end = Math.min(current + windowSize, totalFrames);
            System.out.println("\nTransmitting window: Frames " + current + " to " + (end - 1));


            for (int i = current; i < end; i++) {
                System.out.println("Sent Frame " + i + ": " + frames[i]);
            }


            boolean ackLost = random.nextInt(10) < 2; // 20% chance of loss
            if (ackLost) {
                int lostFrame = random.nextInt(end - current) + current;
                System.out.println("ACK lost for Frame " + lostFrame + ", retransmitting from Frame " + lostFrame);
                current = lostFrame;
            } else {
                System.out.println("All frames acknowledged from " + current + " to " + (end - 1));
                current = end;
            }
        }


        System.out.println("\nAll frames transmitted and acknowledged. Program ends.");
        scanner.close();
    }
}
