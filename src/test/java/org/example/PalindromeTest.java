package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testPalindrome() {
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertFalse(Palindrome.isPalindrome("hello"));
    }
}