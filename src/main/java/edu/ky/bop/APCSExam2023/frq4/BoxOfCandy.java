package edu.ky.bop.APCSExam2023.frq4;

/**
 * Box Of Candy
 * 
 * @author BytesOfPi
 *
 */
public class BoxOfCandy
    {
    private Candy[][] box;

    /**
     * Constructor
     * 
     * @param box
     */
    public BoxOfCandy( Candy[][] box )
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
        // TBD
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
        // TBD
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
