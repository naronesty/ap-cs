package Coins;

/**
 *  Writers:      Bryan Zhang, Noakai Aronesty, Alyssa Choi, Han Zhang, Jessica Eng, Christin Lin
 *  Compilation:  javac CoinsClient.java
 *  Execution:    java CoinsClient
 **/

public class CoinsClient {
  public static void main(String[] args) {
    int trials = Integer.parseInt(args[0]);  
    Coin c = new Coin();
    BiasedCoin bc2 = new BiasedCoin(.2);
    Flippable bc = new BiasedCoin(.7);
    System.out.println("Unbiased coin:");
    int fair = 0;
    for (int i = 0; i < trials; i++) {
      String str = c.flip();
      System.out.print(str);
      if (str.equals("H")) fair++;
    }
    System.out.println();
    System.out.print("observed head %: ");
    System.out.println(((double) fair)/trials);

    System.out.println("Biased coin:");
    int bf1 = 0;
    for (int i = 0; i < trials; i++) {
      String str = bc2.flip();
      System.out.print(str);
      if (str.equals("H")) bf1++;
    }
    System.out.println();
    System.out.print("observed head %: ");
    System.out.println(((double) bf1)/trials);
    System.out.println(bc.flip());
  }
}