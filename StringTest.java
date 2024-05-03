/*
 * Class: CMSC201 
 * Instructor: Grigoriy Gindberg
 * Description: Project 6 JUnit
 * Due: 05/6/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rebecca Lawson
*/

import org.junit.*;
import static org.junit.Assert.*;

public class StringTest 
{
    @Before
    public void setup() throws Exception {}
	
	@Test
    public void testLength() 
	{
        String str = "This is a test!";
        assertEquals(15, str.length());
    }

    @Test
    public void testCharAt() 
    {
        String str = "This is a test!";
        assertEquals('T', str.charAt(0));
        assertEquals('i', str.charAt(5));
    }

    @Test
    public void testSubstring() 
    {
        String str = "This is a test!";
        assertEquals("This", str.substring(0, 4));
        assertEquals("test!", str.substring(10));
    }

    @Test
    public void testIndexOf() 
    {
        String str = "This is a test!";
        assertEquals(8, str.indexOf("a"));
        assertEquals(-1, str.indexOf("Java"));
    }
}
