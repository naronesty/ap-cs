package Exam_0;

import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Cruise.java
 *  Execution:    java Cruise
 ******************************************************************************/

public class Cruise {
    private int signUps;
    private double price;
    public Cruise(int signUpNum, double priceNum) {
        signUps = signUpNum;
        price = priceNum;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public void checkResponse(String response) {
        if (response.contains("cruise")) {
            signUps++;
        }
    }
    public double calculateRevenue() {
        if (signUps < 200) return signUps * price;
        else if (signUps < 300) return signUps * (price - 350);
        else return signUps * (price - 500);
    }
}
