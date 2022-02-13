/******************************************************************************
 *  Compilation:  javac Hurricane.java
 *  Execution:    java Hurricane
 *
 *  Prints Hurricane category based on inputted wind speed parameter
 *
 *  % java Hurricane 125
 *  Category 3
 *
 *  % java Hurricane 6
 *  This is not a hurricane
 ******************************************************************************/

public class Hurricane {
    public static void main(String[] args) {
        String input = args[0];
        int speed = Integer.parseInt(input);
        if (speed < 95) System.out.println("This is not a hurricane");
        else if (speed <= 95) System.out.println("Category 1");
        else if (speed <= 110) System.out.println("Category 2");
        else if (speed <= 130) System.out.println("Category 3");
        else if (speed <= 155) System.out.println("Category 4");
        else System.out.println("Category 5");
    }
}