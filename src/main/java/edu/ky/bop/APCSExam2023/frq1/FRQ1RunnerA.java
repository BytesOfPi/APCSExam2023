package edu.ky.bop.APCSExam2023.frq1;

import static java.lang.System.out;

public class FRQ1RunnerA
    {

    public static void main( String[] args )
        {
        AppointmentBook ab = new AppointmentBook();
        ab.publicRB( 2, 0, 10 );
        ab.publicRB( 2, 15, 15 );
        ab.publicRB( 2, 45, 5 );

        // --------------------------------------------------------
        // Sample Test cases a)
        out.println( "Test Cases FRQ1 a)" );
        out.println( "Before test case" );
        out.println();
        out.println( ab.getRange( 2, 2 ) );
        out.println();
        out.println( "ab.findFreeBlock( 2, 15 ): " + ab.findFreeBlock( 2, 15 ) );
        out.println( "ab.findFreeBlock( 2, 9 ): " + ab.findFreeBlock( 2, 9 ) );
        out.println( "ab.findFreeBlock( 2, 20 ): " + ab.findFreeBlock( 2, 20 ) );
        }
    }
