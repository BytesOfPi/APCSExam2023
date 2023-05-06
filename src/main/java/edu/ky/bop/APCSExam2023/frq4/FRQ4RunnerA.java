package edu.ky.bop.APCSExam2023.frq4;

import static java.lang.System.out;

public class FRQ4RunnerA
    {

    // private PrintStream out = System.out;

    public static void main( String[] args )
        {
        //@formatter:off
        BoxOfCandy box1 = new BoxOfCandy(new Candy[][] {
            {null, new Candy("lime"), null},
            {null, new Candy("orange"), null},
            {null, null, new Candy("cherry")},
            {null, new Candy("lemon"), new Candy("grape")}
        });
        //@formatter:on

        // --------------------------------------------------------
        // Sample Test cases a)
        out.println( "Test Cases FRQ4 a)" );
        out.println( "Before test cases" );
        out.println( box1 );
        out.println();
        out.println( "moveCandyToFirstRow( 0 ): " + box1.moveCandyToFirstRow( 0 ) );
        out.println( "moveCandyToFirstRow( 1 ): " + box1.moveCandyToFirstRow( 1 ) );
        out.println( "moveCandyToFirstRow( 2 ): " + box1.moveCandyToFirstRow( 2 ) );
        out.println();
        out.println( "After test cases" );
        out.println( box1 );
        // moveCan

        }

    public static Candy nc( String flavor )
        {
        return new Candy( flavor );
        }
    }