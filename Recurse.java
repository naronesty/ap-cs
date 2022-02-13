import java.util.*;

/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Recurse.java
 *  Execution:    java Recurse
 ******************************************************************************/

public class Recurse
{
    public static void main( String args[] )
    {
        System.out.println( recurse( "AAAABCCDDDDAACCCCCC" ) );
    }

    private static String recurse( String s )
    {
        System.out.println(s);
        if ( s == null || s.equalsIgnoreCase("") )
        {
            return "";
        }
        else if ( s.length() > 1 )
        {
            if ( !s.substring( 0 , 1 ).equalsIgnoreCase( s.substring( 1 , 2 ) ) )
            {
                return s.substring( 0 , 1 ) + recurse( s.substring( 1 ) );
            }

            return recurse( s.substring( 1 ) );
        }
        else
        {
            return s.substring( 0 , 1 );
        }
    }
}
