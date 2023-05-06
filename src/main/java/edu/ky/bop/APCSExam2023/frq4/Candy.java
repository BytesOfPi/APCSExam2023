package edu.ky.bop.APCSExam2023.frq4;

/**
 * @formatter:off
 * FRQ4: Candy class 
 * 
 * Implemented to help run use cases
 * @formatter:on
 * 
 * @author BytesOfPi
 *
 */
public class Candy
    {
    private String flavor;

    /**
     * Constructor
     * 
     * @param flavor
     */
    public Candy( String flavor )
        {
        super();
        this.flavor = flavor;
        }

    /**
     * Getter
     * 
     * @return
     */
    public String getFlavor()
        {
        return flavor;
        }

    /**
     * Setter
     * 
     * @param flavor
     */
    public void setFlavor( String flavor )
        {
        this.flavor = flavor;
        }

    /**
     * @formatter:off
     * HELPER: toString()
     * Only display 5 characters for flavor so grid is even
     * @formatter:on
     */
    @Override
    public String toString()
        {
        if ( flavor.length() >= 5 ) return flavor.substring( 0, 5 );
        StringBuilder sb = new StringBuilder( flavor );
        return sb.append( "     ", 0, 5 - flavor.length() ).toString();
        }

    }
