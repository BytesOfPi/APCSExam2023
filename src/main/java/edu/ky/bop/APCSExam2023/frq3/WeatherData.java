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
public class WeatherData
    {
    /* List of temperatures */
    private ArrayList<Double> temperatures;

    /**
     * Constructor
     * 
     * @param temperatures
     */
    public WeatherData( List<Double> temperatures )
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
        // TBD
        }

    /**
     * PART B: longestHeatWave()
     * 
     * @param threshold
     * @return
     */
    public int longestHeatWave( double threshold )
        {
        // TBD
        return -1;
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