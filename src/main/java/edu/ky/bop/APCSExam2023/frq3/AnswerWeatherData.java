package edu.ky.bop.APCSExam2023.frq3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2023 FRQ3: Weather Data
 * 
 * @author BytesOfPi
 *
 */
public class AnswerWeatherData
    {
    /* List of temperatures */
    private ArrayList<Double> temperatures;

    /**
     * Constructor
     * 
     * @param temperatures
     */
    public AnswerWeatherData( List<Double> temperatures )
        {
        super();
        //@formatter:off
        this.temperatures = temperatures
                .stream()
                .collect( Collectors.toCollection( ArrayList::new ) );
        //@formatter:on
        }

    /**
     * PART A: cleanData()
     * 
     * @param lower
     * @param upper
     */
    public void cleanData( double lower, double upper )
        {
        // ----------------------------------------------
        // Loop through the temps backwards so removing
        // an entry doesn't throw it off
        for ( int i = temperatures.size() - 1; i >= 0; i-- )
            {
            // If temp is out of range, remove it
            double temp = temperatures.get( i );
            if ( temp < lower || temp > upper )
                {
                temperatures.remove( i );
                }
            }
        }

    /**
     * PART B: longestHeatWave()
     * 
     * @param threshold
     * @return
     */
    public int longestHeatWave( double threshold )
        {
        // ----------------------------------------------
        // Hold on to longest hw and current hw
        int hwHold = 0;
        int hwCurr = 0;
        // ----------------------------------------------
        // Loop through all temps
        for ( int i = 0; i < temperatures.size(); i++ )
            {
            double temp = temperatures.get( i );
            // If we hit a temp higher..
            if ( temp > threshold )
                {
                // Add to current heatwave
                hwCurr++;
                // If current hw is longer than largest, hold onto
                // new hw
                if ( hwHold < hwCurr )
                    {
                    hwHold = hwCurr;
                    }
                }
            // Otherwise, if not a high temp...
            else
                {
                // Reset current run
                hwCurr = 0;
                }
            }
        // Return the longest held heatwave
        return hwHold;
        }

    /**
     * HELPER: toString()
     * 
     * Create a visual of WeatherData that matches the APCS examples
     */
    @Override
    public String toString()
        {
        return "WeatherData [temperatures=" + temperatures + "]";
        }

    }