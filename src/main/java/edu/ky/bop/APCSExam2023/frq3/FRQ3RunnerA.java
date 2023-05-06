package edu.ky.bop.APCSExam2023.frq3;

import static java.lang.System.out;

import java.util.Arrays;

public class FRQ3RunnerA
    {

    public static void main( String[] args )
        {
        WeatherData wd = new WeatherData(
                Arrays.asList( 99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5 ) );

        // WeatherData wd = new WeatherData(
        // Arrays.asList( 100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1,
        // 102.1, 107.4, 93.2 ) );

        // --------------------------------------------------------
        // Sample Test cases a)
        out.println( "Test Cases FRQ4 a)" );
        out.println( "Before test case" );
        out.println( wd );
        out.println();
        wd.cleanData( 85.0, 120.0 );
        out.println( "After test case" );
        out.println( wd );
        out.println();

        }

    }
