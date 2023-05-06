package edu.ky.bop.APCSExam2023.frq3;

import static java.lang.System.out;

import java.util.Arrays;

public class FRQ3RunnerB
    {

    public static void main( String[] args )
        {
        WeatherData wd = new WeatherData(
                Arrays.asList( 100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2 ) );

        // --------------------------------------------------------
        // Sample Test cases b)
        out.println( "Test Cases FRQ3 b)" );
        out.println( "Before test case" );
        out.println( wd );
        out.println();
        out.println( "longestHeatWave( 100.5 ): " + wd.longestHeatWave( 100.5 ) );
        out.println( "longestHeatWave( 95.2 ): " + wd.longestHeatWave( 95.2 ) );
        out.println();

        }

    }
