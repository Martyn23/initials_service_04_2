package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialsServiceTest {
    @Test
    public void getInitialsTwoWordsName() {
        InitialsService service = new InitialsService();
        String name = "Ivan Petrov ";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);
    }
    @Test
    public void getInitialsThreeWordsName() {
        InitialsService service = new InitialsService();
        String name = "Ivan Petrov Vasilyevich";

        String actual = service.getInitials(name);

        assertEquals("IV", actual);
    }
    @Test
    public void getInitialsOneWordName() {
        InitialsService service = new InitialsService();
        String name = "Ivan";

        String actual = service.getInitials(name);

        assertEquals("I", actual);

    }
    @Test
    public void getInitialsLittleTwoWordsName() {
        InitialsService service = new InitialsService();
        String name = "ivan petrov";

        String actual = service.getInitials(name);

        assertEquals("IP", actual);
    }
}