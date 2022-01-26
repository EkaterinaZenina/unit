package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldCalculateCashbackFrom1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackFrom1100() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateCashbackFrom2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

}
