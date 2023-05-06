package edu.ky.bop.APCSExam2023.frq1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 2023 FRQ1: Appointment Book
 * 
 * @author BytesOfPi
 *
 */
public class AppointmentBook
    {
    // @formatter:off
    /* Initialize 8 periods */
    List<List<Boolean>> periods = Arrays.asList( new ArrayList<>( 60 ),
            new ArrayList<>( 60 ), new ArrayList<>( 60 ),
            new ArrayList<>( 60 ), new ArrayList<>( 60 ),
            new ArrayList<>( 60 ), new ArrayList<>( 60 ),
            new ArrayList<>( 60 ) );

    /**
     * Constructor
     */
    public AppointmentBook()
        {
        super();
        // ----------------------------------------------
        // For each period, create a list of 60 booleans
        // (Java Streams are fun!!)
        periods.stream().forEach( l -> {
            IntStream.range( 0, 60 ).forEach( i -> l.add( true ) );
            } );
        }

    // @formatter:on

    /**
     * Is Minute Free: Implementation
     * 
     * @param period
     * @param minute
     * @return
     */
    private boolean isMinuteFree( int period, int minute )
        {
        // ----------------------------------------------
        // Check if that minute is free
        return periods.get( period - 1 ).get( minute );
        }

    /**
     * Reserve Block: Implementation
     * 
     * @param period
     * @param startMinute
     * @param duration
     */
    private void reserveBlock( int period, int startMinute, int duration )
        {
        List<Boolean> p = periods.get( period - 1 );
        int end = startMinute + duration;
        // ----------------------------------------------
        // Starting with startMinute, loop and book
        // each minute in the range
        for ( int s = startMinute; s < end; s++ )
            p.set( s, false );
        }

    /**
     * PART A: findFreeBlock()
     * 
     * @param period
     * @param duration
     * @return
     */
    public int findFreeBlock( int period, int duration )
        {
        // TBD
        return -1;
        }

    /**
     * PART B: makeAppointment()
     * 
     * @param startPeriod
     * @param endPeriod
     * @param duration
     * @return
     */
    public boolean makeAppointment( int startPeriod, int endPeriod, int duration )
        {
        // TBD
        return false;
        }

    /**
     * HELPER: toString()
     */
    @Override
    public String toString()
        {
        return getRange( 1, periods.size() );
        }

    /**
     * @formatter:off
     * HELPER: publicRB()
     *      Expose private method reserveBlock() so we
     *      can initialize AddressBook for Runner to match cases
     * @formatter:on
     * 
     * @param period
     * @param startMinute
     * @param duration
     */
    public void publicRB( int period, int startMinute, int duration )
        {
        reserveBlock( period, startMinute, duration );
        }

    /**
     * @formatter:off HELPER: getRange() Create a visual of the AddressBook that
     *                matches the APCS examples
     * @formatter:on
     * 
     * @param start
     * @param end
     * @return
     */
    public String getRange( int start, int end )
        {
        StringBuilder sb = new StringBuilder();
        for ( int i = start - 1; i < end; i++ )
            {
            sb.append( getPeriod( i, periods.get( i ) ) );
            }
        return sb.toString();
        }

    /**
     * @formatter:off
     * HELPER: getPeriod()
     * Create a visual of a Period that matches the APCS examples
     * @formatter:on
     * 
     * @param index
     * @param period
     * @return
     */
    private StringBuilder getPeriod( int index, List<Boolean> period )
        {
        StringBuilder prefix = new StringBuilder( "[" ).append( index + 1 ).append( "]" );
        StringBuilder sbFinal = new StringBuilder();
        boolean hold = period.get( 0 );
        int startInd = 0;
        // @formatter:off
        for ( int i = 0; i < period.size(); i++ )
            {
            if ( hold != period.get( i ) )
                {
                sbFinal.append( prefix ).append( "[" )
                    .append( startInd ).append( " - " )
                    .append( i - 1 ).append( " (" )
                    .append( i - startInd ).append( " minutes)][" )
                    .append( hold ? "Yes]\n" : "No]\n" );
                hold = !hold;
                startInd = i;
                }
            }
        return sbFinal.append( prefix ).append( "[" )
                .append( startInd ).append( " - " )
                .append( "59 (" )
                .append( 60 - startInd ).append( " minutes)][" )
                .append( hold ? "Yes]\n" : "No]\n" );

        // @formatter:on
        }
    }
