package ua.fantotsy.simpleTests;

import org.junit.Assert;
import org.junit.Test;
import ua.fantotsy.App;

import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testContainsTwoArguments() {
        String[] args = {"One", "Two"};
        Assert.assertEquals(true, App.containsArguments(args));
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