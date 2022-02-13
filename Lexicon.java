/**
 *  Builds a lexicon from the offical Scrabble lexicon.
 *
 *  Compilation instructions.
 *  $ javac -cp .:../stdlib.jar Lexicon.java
 *
 *  Execution instructions.
 *  $ java -cp .:../stdlib.jar Lexicon
 *
 * Dependencies: ospd.txt, In.java
 */



import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Lexicon{

    public static void main(String[] args){
	// official Scrabble lexicon
	// one word per line
	
	In in = new In("ospd.txt"); 
	Set<String> lexicon = new TreeSet<String>();
	
	while (!in.isEmpty()){
	    String s = in.readLine();
	    lexicon.add(s);
	}
	for (String i: lexicon) {
		if (i.length() == 7) {
			System.out.println(i);
		}
	}
	//System.out.println(lexicon);
    }
}
