package ua.fantotsy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testContainsTwoArguments() {
        String[] args = {"One", "Two"};
        assertEquals(true, App.containsArguments(args));
    }

    @Test
    public void testContainsNoArguments() {
        String[] args = {};
        assertEquals(false, App.containsArguments(args));
    }

    @Test(expected = NullPointerException.class)
    public void testContainsNullArguments() {
        assertEquals(false, App.containsArguments(null));
    }
}