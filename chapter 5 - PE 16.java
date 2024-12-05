import java.util.Random;

class Coin {
    private String sideUp;

    public Coin() {
        toss();  // Call the toss method when the object is created
    }

    public void toss() {
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}

public class CoinTossSimulator {
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println("Initial side up: " + coin.getSideUp());

        int headsCount = 0, tailsCount = 0;
        for (int i = 0; i < 20; i++) {
            coin.toss();
            System.out.println("Toss " + (i + 1) + ": " + coin.getSideUp());
            if (coin.getSideUp().equals("heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("Total heads: " + headsCount);
        System.out.println("Total tails: " + tailsCount);
    }
}
