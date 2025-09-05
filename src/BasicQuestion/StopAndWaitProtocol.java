package BasicQuestion;

import java.util.Random;
import java.util.Scanner;

public class StopAndWaitProtocol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int totalFrames = random.nextInt(5) + 5;
        System.out.println("Total Frames to Transmit: " + totalFrames);

        int currentFrame = 1;

        while (currentFrame <= totalFrames) {

            System.out.println("Transmitting Frame " + currentFrame);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            boolean ackReceived = random.nextBoolean();

            if (ackReceived) {
                System.out.println("ACK received for Frame " + currentFrame);

                currentFrame++;
            } else {

                System.out.println("ACK not received for Frame " + currentFrame + ". Retransmitting...");
            }

            System.out.println();
        }


        System.out.println("All frames transmitted successfully. Program ends.");
        scanner.close();
    }
}
