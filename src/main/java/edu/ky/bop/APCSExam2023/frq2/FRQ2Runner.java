package edu.ky.bop.APCSExam2023.frq2;

import static java.lang.System.out;

public class FRQ2Runner
    {

    public static void main( String[] args )
        {
        // --------------------------------------------------------
        // Sample Test cases a) and b)
        out.println( "Test Cases FRQ2 a) and b)" );
        String str;
        int x;
        Sign sign1 = new Sign( "ABC222DE", 3 );
        x = sign1.numberOfLines();
        out.println( "x = sign1.numberOfLines(); [" + x + "]" );
        str = sign1.getLines();
        out.println( "sign1.getLines();          [" + str + "]" );
        str = sign1.getLines();
        out.println( "sign1.getLines();          [" + str + "]" );

        Sign sign2 = new Sign( "ABCD", 10 );
        x = sign2.numberOfLines();
        out.println( "x = sign2.numberOfLines(); [" + x + "]" );
        str = sign2.getLines();
        out.println( "sign2.getLines();          [" + str + "]" );

        Sign sign3 = new Sign( "ABCDEF", 6 );
        x = sign3.numberOfLines();
        out.println( "x = sign3.numberOfLines(); [" + x + "]" );
        str = sign3.getLines();
        out.println( "sign3.getLines();          [" + str + "]" );

        Sign sign4 = new Sign( "", 4 );
        x = sign4.numberOfLines();
        out.println( "x = sign4.numberOfLines(); [" + x + "]" );
        str = sign4.getLines();
        out.println( "sign4.getLines();          [" + str + "]" );

        Sign sign5 = new Sign( "AB_CD_EF", 2 );
        x = sign5.numberOfLines();
        out.println( "x = sign5.numberOfLines(); [" + x + "]" );
        str = sign5.getLines();
        out.println( "sign5.getLines();          [" + str + "]" );

        out.println();
        }

    }
