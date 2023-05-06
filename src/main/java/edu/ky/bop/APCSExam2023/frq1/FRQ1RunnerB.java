package edu.ky.bop.APCSExam2023.frq1;

import static java.lang.System.out;

public class FRQ1RunnerB
    {

    public static void main( String[] args )
        {
        AppointmentBook ab = new AppointmentBook();
        ab.publicRB( 2, 0, 25 );
        ab.publicRB( 2, 30, 30 );
        ab.publicRB( 3, 15, 26 );
        ab.publicRB( 4, 0, 5 );
        ab.publicRB( 4, 30, 14 );

        // --------------------------------------------------------
        // Sample Test cases a)
        out.println( "Test Cases FRQ1 b)" );
        out.println( "Before test case" );
        out.println();
        out.println( ab.getRange( 2, 4 ) );
        out.println();
        out.println( "makeAppointment( 2, 4, 22 ): " + ab.makeAppointment( 2, 4, 22 ) );
        out.println( "makeAppointment( 3, 4, 3 ): " + ab.makeAppointment( 3, 4, 3 ) );
        out.println( "makeAppointment( 2, 4, 30 ): " + ab.makeAppointment( 2, 4, 30 ) );
        out.println();
        out.println( "After test case" );
        out.println();
        out.println( ab.getRange( 2, 4 ) );
        }
    }
