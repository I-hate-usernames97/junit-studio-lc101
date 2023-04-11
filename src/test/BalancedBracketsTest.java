package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "one set of balanced brackets to returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void oneSetOfBracketsBeforeOtherCharacters(){
        String spec = "one set of balanced brackets before other characters  to returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void oneSetOfBracketsAroundCharacters(){
        String spec = "one set of balanced brackets around characters to returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void oneSetOfBracketsWithinCharacters(){
        String spec = "one set of balanced brackets within characters to returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void multipleSetsOfConsecutiveBrackets(){
        String spec = "multiple sets of consecutive brackets to returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void multipleNestedBrackets(){
        String spec = "multiple sets of nested brackets to returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void oneOpeningBrackets(){
        String spec = "one opening brackets to returns False";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void oneClosingBrackets(){
        String spec = "one closing brackets to returns False";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void setReversedBrackets(){
        String spec = "Reversed brackets to returns False";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
    @Test
    public void oneBracketsWithOtherCharacters(){
        String spec = "one brackets with other characters to returns False";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void unbalancedBracketsWithOtherCharacters(){
        String spec = "unbalanced brackets with other characters to returns False";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void mixedBracketsWithOtherCharacters(){
        String spec = "mixed brackets with other characters to returns False";
        String testData = "]][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }
}
