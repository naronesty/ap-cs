package Coins;

/**
 *  Writers:      Bryan Zhang, Noakai Aronesty, Alyssa Choi, Han Zhang, Jessica Eng, Christin Lin
 *  Compilation:  javac Coin.java
 *  Execution:    java Coin
 **/

public class Coin implements Flippable {
  public String flip() {
    double r = Math.random();
    if (r < 0.5) return "H";
    else return "T";
  }
}