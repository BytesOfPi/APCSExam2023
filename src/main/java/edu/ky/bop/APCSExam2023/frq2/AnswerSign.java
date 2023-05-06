package edu.ky.bop.APCSExam2023.frq2;

/**
 * 2023 FRQ2: Sign
 * 
 * @author BytesOfPi
 *
 */
public class AnswerSign
    {
    /* Hold onto message and width */
    private String msg;
    private int width;

    /**
     * Constructor
     * 
     * @param msg
     * @param width
     */
    public AnswerSign( String msg, int width )
        {
        this.msg = msg;
        this.width = width;
        }

    /**
     * PART A: numberOfLines()
     * 
     * @return
     */
    public int numberOfLines()
        {
        // ----------------------------------------------
        // If there is no message, return 0
        if ( msg.length() == 0 )
            { return 0; }
        // ----------------------------------------------
        // Otherwise
        // -) take the message length minus 1
        // -) divide by the width to split it up
        // -) add 1
        return ((msg.length() - 1) / width) + 1;
        }

    /**
     * PART B: getLines()
     * 
     * @return
     */
    public String getLines()
        {
        // ----------------------------------------------
        // If there is no message, return 0
        String lines = "";
        int numLines = numberOfLines();
        int start = 0;
        int msgLen = msg.length();
        // ----------------------------------------------
        // If there is no message, return null
        if ( numLines == 0 )
            { return null; }

        // ----------------------------------------------
        // Loop for each line
        for ( int i = 0; i < numLines; i++ )
            {
            // ----------------------------------------------
            // If it's not the first line, add a semicolon
            if ( i > 0 )
                {
                lines += ";";
                }
            // ----------------------------------------------
            // End index should be width x # of times through
            int end = (i + 1) * width;
            // ----------------------------------------------
            // if message is shorter than end index, set that
            end = msgLen < end ? msgLen : end;
            // ----------------------------------------------
            // Add string chunk and set start index to the end
            lines += msg.substring( start, end );
            start = end;
            }
        // ----------------------------------------------
        // Return the concatenated lines
        return lines;
        }
    }
