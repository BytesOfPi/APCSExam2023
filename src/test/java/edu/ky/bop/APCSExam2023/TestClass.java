package edu.ky.bop.APCSExam2023;

import static java.lang.System.out;

import org.junit.jupiter.api.Test;

public class TestClass
    {

    @Test
    public void runDiv()
        {
        int width = 10;
        String msg1 = "ABCD"; // len: 4
        String msg2 = "ABCDEFGHIJKLMNOPQRST"; // len: 20
        String msg3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // len: 26

        out.println( testNOL( msg1, width ) ); // Should be 1 line
        out.println( testNOL( msg2, width ) ); // Should be 2 lines
        out.println( testNOL( msg3, width ) ); // Should be 3 lines
        }

    public int testNOL( String msg, int width )
        {
        int a = msg.length() / width;
        int b = msg.length() % width;
        return b > 0 ? a + 1 : a;
        // return ((msg.length() - 1) / width) + 1;
        // return msg.length() / width;
        // return (msg.length() / width) + 1;
        // return ((msg.length() - 1) / width) + 1;
        }

    }
