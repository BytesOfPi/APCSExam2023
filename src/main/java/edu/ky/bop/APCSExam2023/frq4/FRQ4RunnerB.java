package edu.ky.bop.APCSExam2023.frq4;

import static java.lang.System.out;

/**
 * FRQ Runner 4B
 * 
 * @author BytesOfPi
 *
 */
public class FRQ4RunnerB
    {

    public static void main( String[] args )
        {
        //@formatter:off
        BoxOfCandy box2 = new BoxOfCandy(new Candy[][] {
            {new Candy("lime"), new Candy("lime"), null, new Candy("lemon"), null},
            {new Candy("orange"), null, null, new Candy("lime"), new Candy("lime")},
            {new Candy("cherry"), null, new Candy("lemon"), null, new Candy("orange")}
        });
        //@formatter:on

        // --------------------------------------------------------
        // Sample Test cases b)
        out.println( "Test Cases FRQ4 b)" );
        out.println( "Before test cases" );
        out.println( box2 );
        out.println( "removeNextByFlavor( \"cherry\" ): " + box2.removeNextByFlavor( "cherry" ) );
        out.println( "removeNextByFlavor( \"lime\" ): " + box2.removeNextByFlavor( "lime" ) );
        out.println( "removeNextByFlavor( \"grape\" ): " + box2.removeNextByFlavor( "grape" ) );
        out.println();
        out.println( "After test cases" );
        out.println( box2 );
        // moveCan

        }

    public static Candy nc( String flavor )
        {
        return new Candy( flavor );
        }
    }