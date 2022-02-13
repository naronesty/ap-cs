/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Impts.java
 *  Execution:    java Impts
 *
 *  A class containing some universally useful functions
 *  Functions:
 *  Impts.printArray(array) // Prints an array
 *  Impts.randInt(int0, int1) // Returns a random integer >= int0 and < int1
 *  Impts.isNumber(string) // Returns true if a string is a number, false otherwise
 *  Impts.createIntegerArray(int0 ... int) // Returns an int[] from a list of int arguments
 *  Impts.reverseArray(array) // Returns an array that is the parameter reversed
 *  Impts.sumArray(array) // Returns the sum of all elements in an array
 *  Impts.pyDivide(int0, int1) // Returns the result of python-style int -> double division of two ints
 *  Impts.getCommon(array0, array1) // Returns an array of the common elements in two arrays
 *  Impts.max(array) // Returns the max value in an array
 *  Impts.min(array) // Returns the min value in an array
 *  Impts.divisors(int) // Returns an array of factors of a number
 *  Impts.append(array, object) // Returns the array with the object appended: object can be another array
 *  Impts.countFreq(object, array) // Returns the frequency of an object in an array: object CANNOT be another array
 *  Impts.titleCase(string) // Returns the string converted to title notation
 *  Impts.removeChars(string0, string1) // Returns a copy of string0 with the chars in string1 removed
 *  Impts.remDupeStr(list<String>) // Returns a copy of the parameter String list with no duplicates
 *  Impts.remDupeInt(list<Integer>) // Returns a copy of the parameter Integer list with no duplicates
 *  Impts.delDupeStr(list<String>) // Deletes duplicates in a String list
 *  Impts.delDupeInt(list<Integer>) // Deletes duplicates in an Integer list
 *  Impts.reverseList(list) // Reverses a list
 *  Impts.indexOfAll(list0, list1) // Returns a list of the start indexes of where list1 appears in list0
 *  Impts.gcd(int0, int1) // Returns greatest common factor
 *  Impts.lcm(int0, int1) // Returns least common multiple
 *  Impts.randomizeArrList(list) // Randomizes an ArrayList in place
 *  Impts.reverseString(string) // Returns the string reversed
 *  Impts.binaryToDecimal(binaryNum) // Returns a decimal long from a binary String
 *  Impts.decimalToBinary(long) // Returns a binary String from a decimal long
 *  Impts.intArrToArrList(int[]) // Returns an Integer ArrayList version of an int[]
 *  Impts.doubleArrToArrList(double[]) // Returns a Double ArrayList version of a double[]
 *  Impts.strArrToArrList(String[]) // Returns a String ArrayList version of a str[]
 *  Impts.mode(array) // Returns the mode of an array
 *  Imtps.findScrambled(textDoc, string) // Prints all words in textDoc that have the letters in string in any order.
 *                                          Uses � for umlaut letters
 ******************************************************************************/

import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Impts {

    public static void printArray(int[] arry) { // Prints an integer array
        for (int j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arry) { // Prints a string array
        for (String j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arry) { // Prints a double array
        for (double j : arry) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arry) { // Prints a two dimensional integer array
        for (int[] ints : arry) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printArray(String[][] arry) { // Prints a two dimensional string array
        for (String[] ints : arry) {
            for (String aString : ints) {
                System.out.print(aString + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int randInt(int lower, int upper)  { // Returns a random integer >= int0 and < int1
        return (int) (Math.random() * (upper - lower) + lower);
    }

    public static boolean isNumber(String s) { // Returns true if a string is a number, false otherwise
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }

    public static int[] createIntegerArray (int ... args){ // Returns an int[] from a list of int arguments
        int count = args.length;
        int[] arr = new int[count];
        count = 0;
        for (int n : args){
            arr[count] = n;
            count ++;
        }
        return arr;
    }

    public static String[] reverseArray(String[] a) { // Returns an array that is the parameter reversed
        String[] ret = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static int[] reverseArray(int[] a) { // Returns an array that is the parameter reversed
        int[] ret = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static double[] reverseArray(double[] a) { // Returns an array that is the parameter reversed
        double[] ret = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            ret[i] = a[a.length - (i + 1)];
        }
        return ret;
    }

    public static int sumArray(int[] a) { // Returns the sum of all elements in an array
        int ret = 0;
        for (int i = 0; i < a.length; i ++) {
            ret += a[i];
        }
        return ret;
    }

    public static double sumArray(double[] a) { // Returns the sum of all elements in an array
        double ret = 0;
        for (int i = 0; i < a.length; i ++) {
            ret += a[i];
        }
        return ret;
    }

    public static double pyDivide(int dividend, int divisor) { // Returns the result of python-style int -> double division of two ints
        double x = (double) dividend;
        double y = (double) divisor;
        return x / y;
    }

    public static int[] getCommon(int[] a, int[] b) { // Returns the common items in two int arrays
        ArrayList<Integer> commons = new ArrayList<Integer>();
        for (int i: a) {
            for (int j: b) {
                if (i == j) {
                    commons.add(i);
                }
            }
        }
        int [] common = new int[commons.size()];
        for (int i = 0; i < commons.size(); i++)
            common[i] = commons.get(i);
        return common;
    }

    public static String[] getCommon(String[] a, String[] b) { // Returns the common items in two String arrays
        ArrayList<String> commons = new ArrayList<String>();
        for (String i: a) {
            for (String j: b) {
                if (i == j) {
                    commons.add(i);
                }
            }
        }
        String[] common = new String[commons.size()];
        for (int i = 0; i < commons.size(); i++)
            common[i] = commons.get(i);
        return common;
    }

    public static int max(int[] n) { // Returns the max in an int array
        int maxim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] > n[i - 1]) maxim = n[i];
        }
        return maxim;
    }

    public static double max(double[] n) { // Returns the max in a double array
        double maxim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] > n[i - 1]) maxim = n[i];
        }
        return maxim;
    }

    public static int min(int[] n) {
        int minim = n[0];
        for (int i = 1; i < n.length; i++) { // Returns the min in an int array
            if(n[i] < n[i - 1]) minim = n[i];
        }
        return minim;
    }

    public static double min(double[] n) { // Returns the min in a double array
        double minim = n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i] < n[i - 1]) minim = n[i];
        }
        return minim;
    }

    public static int[] divisors(int n) { // Returns an array of an int's factors
        int[] x = {0};
        if (n == 0) return x;

        int count = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] nFactors = new int[count + 1];
        count = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                nFactors[count] = i;
                count++;
            }
        }
        nFactors[nFactors.length - 1] = n;
        return nFactors;
    }

    public static int[] append(int[] array, int n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static double[] append(double[] array, double n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static String[] append(String[] array, String n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static boolean[] append(boolean[] array, boolean n) { // Returns an array with an object appended
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        return array;
    }

    public static String[] append(String[] array1, String[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static int[] append(int[] array1, int[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static double[] append(double[] array1, double[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static boolean[] append(boolean[] array1, boolean[] array2) { // Returns an array with an object appended
        for (int i = 0; i < array2.length; i++) {
            array1 = append(array1, array2[i]);
        }
        return array1;
    }

    public static int countFreq(int num, int[] array) { // Returns the frequency of a number in an int[]
        int ret = 0;
        for (int i: array) {
            if (num == i) ret++;
        }
        return ret;
    }

    public static int countFreq(String str, String[] array) { // Returns the frequency of a string in a String[]
        int ret = 0;
        for (String i: array) {
            if (str == i) ret++;
        }
        return ret;
    }

    public static int countFreq(double number, double[] array) { // Returns the frequency of a double in an double[]
        int ret = 0;
        for (double i: array) {
            if (number == i) ret++;
        }
        return ret;
    }

    public static String titleCase(String str) { // Returns a String in title notation
        ArrayList<String> titleArr = strArrToArrList(str.split(" "));
        titleArr.set(0, titleArr.get(0).substring(0, 1).toUpperCase() + titleArr.get(0).substring(1).toLowerCase());
        for (int i = 1; i < titleArr.size(); i++) {
            if (titleArr.get(i).length() > 2 && !titleArr.get(i).toLowerCase().equals("the")) {
                titleArr.set(i, titleArr.get(i).substring(0, 1).toUpperCase() + titleArr.get(i).substring(1).toLowerCase());
            }
            else {
                titleArr.set(i, titleArr.get(i).toLowerCase());
            }
        }

        String ret = "";
        for (int i = 0; i < titleArr.size(); i++) {
            if (i == titleArr.size() - 1) ret += titleArr.get(i);
            else {
                ret += titleArr.get(i) + " ";
            }
        }
        return ret;
    }

    public static String removeChars(String str, String remove) { // Returns a copy of string0 with the chars in string1 removed
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            if (!remove.toLowerCase().contains(str.substring(i, i + 1).toLowerCase())) ret += str.substring(i, i+1);
        }
        return ret;
    }

    public static ArrayList<String> remDupeStr(ArrayList<String> list) { // Returns a copy of the parameter list with no duplicates
        Collections.sort(list);
        ArrayList<String> listo = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (!listo.contains(list.get(i))) {
                listo.add(list.get(i));
            }
        }
        return listo;
    }

    public static ArrayList<Integer> remDupeInt(ArrayList<Integer> list) { // Returns a copy of the parameter list with no duplicates
        ArrayList<Integer> listo = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!listo.contains(list.get(i))) {
                listo.add(list.get(i));
            }
        }
        return listo;
    }

    public static void delDupeStr (ArrayList<String> list) { // Deletes duplicates in a list
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            String last = list.get(i);
            if (last.equals(list.get(i + 1))) {
                list.remove(i + 1);
                i--;
            }
        }
    }

    public static void delDupeInt (ArrayList<Integer> list) { // Deletes duplicates in a list
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            int last = list.get(i);
            if (last == list.get(i + 1)) {
                list.remove(i + 1);
                i--;
            }
        }
    }

    public static ArrayList<Integer> indexOfAll(ArrayList<Integer> list, ArrayList<Integer> sublist) { // Returns a list of the start indexes of where list1 appears in list0
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < list.size() - sublist.size() + 1; i++) {
            if (list.subList(i, i + sublist.size()).equals(sublist)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void reverseList(ArrayList<String> list) { // Reverses a list
        for (int i = 0; i < list.size() / 2; i++) {
            Collections.swap(list, i, list.size() - (i + 1));
        }
    }

    public static int gcd(int a, int b) { // Returns greatest common factor
        return Impts.max(Impts.getCommon(Impts.divisors(a), Impts.divisors(b)));
    }

    public static int lcm(int a, int b) { // Returns Least Common Multiple
        if (a == 0 || b == 0) return 0;

        int x = a;
        int y = b;
        int count = 0;
        while (true) {
            if (x == y) return x;
            else if (x < y) x += a;
            else y += b;
        }
    }

    public static void randomizeArrList(ArrayList<String> list) { // Randomizes an ArrayList in place
        int len = list.size();
        for (int i = 0; i < len; i++) {
            int a = (int) (i + Math.random() * (len - i - 1));
            String temp = list.get(i);
            list.set(i, list.get(a));
            list.set(a, temp);
        }
    }

    public static String reverseString(String s) { // Returns the string reversed
        String ret = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ret += s.charAt(i);
        }
        return ret;
    }

    public static long binaryToDecimal(String binaryNum) { // Returns a decimal integer from a binary String
        long ret = 0;
        for (int i = binaryNum.length() - 1; i >= 0; i--) {
            ret += Long.parseLong(String.valueOf(binaryNum.charAt(binaryNum.length() - 1 - i))) * Math.pow(2, i);
        }
        return ret;
    }

    public static String decimalToBinary(long d) { // Returns a binary String from a decimal integer
        String ret = "";
        while (d > 0) {
            ret += d % 2;
            d /= 2;
        }
        return reverseString(ret);
    }

    public static ArrayList<Integer> intArrToArrList(int[] arr) { // Returns an Integer ArrayList version of an int[]
        return (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static ArrayList<Double> doubleArrToArrList(double[] arr) { // Returns a Double ArrayList version of a double[]
        return (ArrayList<Double>) Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static ArrayList<String> strArrToArrList(String[] arr) { // Returns a String ArrayList version of a String[]
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static int mode(int[] array) { // Returns the mode of an array
        int ret = 0;
        int a = 0;
        for(int i = 0; i < array.length; i++ ) {
            if (a == 0) {
                ret = array[i];
                a = 1;
            }
            else if (ret == array[i]) a++;
            else a--;
        }
        return ret;
    }

    public static int mode(ArrayList<Integer> array) { // Returns the mode of an array
        int ret = 0;
        int a = 0;
        for(int i = 0; i < array.size(); i++ ) {
            if (a == 0) {
                ret = array.get(i);
                a = 1;
            }
            else if (ret == array.get(i)) a++;
            else a--;
        }
        return ret;
    }

    public static void findScrambled(In textDoc, String letters) { // Prints all words in textDoc that have letters in any order. Use � for umlaut letters
        String lettersLower = letters.toLowerCase();
        ArrayList<String> letterArr = new ArrayList<>(Arrays.asList(lettersLower.split("")));
        Collections.sort(letterArr);
        while (!textDoc.isEmpty()) {
            String lineLower = textDoc.readLine().toLowerCase();
            ArrayList<String> lineArr = new ArrayList<>(Arrays.asList(lineLower.split("")));
            Collections.sort(lineArr);
            if (lineArr.equals(letterArr)) {
                System.out.println(lineLower);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(binaryToDecimal("1111111000001011100000"));
//        System.out.println(decimalToBinary(4162272));
    }
}