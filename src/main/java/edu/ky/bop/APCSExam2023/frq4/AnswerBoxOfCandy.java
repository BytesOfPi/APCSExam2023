package edu.ky.bop.APCSExam2023.frq4;

/**
 * Box Of Candy
 * 
 * @author BytesOfPi
 *
 */
public class AnswerBoxOfCandy
    {
    private Candy[][] box;

    /**
     * Constructor
     * 
     * @param box
     */
    public AnswerBoxOfCandy( Candy[][] box )
        {
        super();
        this.box = box;
        }

    /**
     * PART A: moveCandyToFirstRow()
     * 
     * @param col
     * @return
     */
    public boolean moveCandyToFirstRow( int col )
        {
        // If first row has a candy, we're done!
        if ( box[0][col] != null )
            { return true; }
        // Otherwise, loop through rows
        for ( int r = 1; r < box.length; r++ )
            {
            // If we found a candy...
            if ( box[r][col] != null )
                {
                // Move the candy and return true
                box[0][col] = box[r][col];
                box[r][col] = null;
                return true;
                }
            }
        // Otherwise, return false
        return false;
        }

    /**
     * PART B: removeNextByFlavor()
     * 
     * @param flavor
     * @return
     */
    public Candy removeNextByFlavor( String flavor )
        {
        // Loop through the box starting with the LAST row
        for ( int r = box.length - 1; r >= 0; r-- )
            {
            // Loop through the row starting from LEFT to RIGHT
            for ( int c = 0; c < box[0].length; c++ )
                {
                // If candy exists and matches flavor...
                Candy hold = box[r][c];
                if ( hold != null && hold.getFlavor().equals( flavor ) )
                    {
                    // null out the compartment and return candy
                    box[r][c] = null;
                    return hold;
                    }
                }
            }
        // Otherwise, return null.. couldn't find candy
        return null;
        }

    /**
     * HELPER: toString() Draws candy box to help match APCS cases display
     */
    @Override
    public String toString()
        {
        StringBuilder sbBox = new StringBuilder();
        for ( Candy[] r : box )
            {
            for ( Candy c : r )
                {
                String flav = (c == null) ? "     " : c.toString();
                sbBox.append( "[" ).append( flav ).append( "]" );
                }
            sbBox.append( "\n" );
            }
        return sbBox.toString();
        }

    }
