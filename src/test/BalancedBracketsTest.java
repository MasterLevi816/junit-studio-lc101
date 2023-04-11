package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
       assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsTrueAgain() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Laun]chCo[de]"));
    }


    @Test
    public void hasBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void hasParantheses(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("(launch)code"));
    }

    @Test
    public void missingOneBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[launchcode"));
    }

    @Test
    public void lonelyBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void wrongWayBro(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void EqualsBro(){
        String expected = "[bro]";
        String actual = "[bro]";
        assertEquals(expected, actual);
    }

    @Test
    public void noBracketNoProblem(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void backwardBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void tonsOfBracketTypes(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[sup] br(otato) an{d chip}s"));
    }

    @Test
    public void intertwinedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[s(up] b)rotato an{d [chip}s]"));
    }

}
