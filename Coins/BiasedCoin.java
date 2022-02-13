package Coins;

/**
 *  Writers:      Bryan Zhang, Noakai Aronesty, Alyssa Choi, Han Zhang, Jessica Eng, Christin Lin
 *  Compilation:  javac BiasedCoin.java
 *  Execution:    java BiasedCoin
 **/
 
public class BiasedCoin extends Coin {
  private double biased; 
  public BiasedCoin(double biased) {
    this.biased = biased;
  }
  public String flip() {
    if (Math.random() < biased) return "H";
    else return "T";
  }
}