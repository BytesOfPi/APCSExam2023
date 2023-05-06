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
public class AnswerAppointmentBook
    {
    // @formatter:off
    /* Initialize 8 periods */
    List<List<Boolean>> periods = Arrays.asList( new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60),
            new ArrayList<>(60)
            );

    /**
     * Constructor
     */
    public AnswerAppointmentBook()
        {
        super();
        // ----------------------------------------------
        // For each period, create a list of 60 booleans
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
        // ----------------------------------------------
        // Hold on to the start minute and # of free minutes
        // found
        int hold = -1;
        int numFree = 0;
        // ----------------------------------------------
        // Loop through all the minutes in the period minus
        // the duration
        for ( int min = 0; min <= 59 - duration; min++ )
            {
            // ----------------------------------------------
            // If a minute is free...
            if ( isMinuteFree( period, min ) )
                {
                // ----------------------------------------------
                // If it's the first free minute, hold onto that
                if ( hold == -1 )
                    {
                    hold = min;
                    }
                // ----------------------------------------------
                // Add to # of free minutes
                numFree++;
                // ----------------------------------------------
                // If we've hit the # of free min, return the
                // held starting minute
                if ( numFree == duration )
                    { return hold; }
                }
            // ----------------------------------------------
            // Otherwise, if it's not free, reset our hold
            // and counter
            else
                {
                hold = -1;
                numFree = 0;
                }
            }
        // ----------------------------------------------
        // We didn't find it.. return -1
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
        // ----------------------------------------------
        // If we never end early, return the starting minute
        for ( int per = startPeriod; per <= endPeriod; per++ )
            {
            int minStart = findFreeBlock( per, duration );
            if ( minStart > -1 )
                {
                reserveBlock( per, minStart, duration );
                return true;
                }
            }
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
     *     Expose private method reserveBlock() so we can
     *     initialize AddressBook for Runner to match cases
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
     * @formatter:off
     * HELPER: getRange()
     *     Create a visual of the AddressBook that matches the
     *     APCS examples
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
     *     Create a visual of a Period that matches the
     *     APCS examples
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
        //@formatter:off
        for ( int i = 0; i < period.size(); i++ )
            {
            if ( hold != period.get( i ) )
                {
                sbFinal.append( prefix ).append( "[" )
                    .append( startInd ).append( " - " )
                    .append( i - 1 ).append( " (" )
                    .append( i - startInd ).append( " minutes)][" )
                    .append( hold ? "Yes]\n" : "No]\n"  );
                hold = !hold;
                startInd = i;
                }
            }
        return sbFinal.append( prefix ).append( "[" )
                    .append( startInd ).append( " - " )
                    .append( "59 (" )
                    .append( 60 - startInd ).append( " minutes)][" )
                    .append( hold ? "Yes]\n" : "No]\n"  );

        //@formatter:on
        }
    }
