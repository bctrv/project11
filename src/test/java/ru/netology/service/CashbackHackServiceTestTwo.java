package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTestTwo {

    @Test
    public void amountPositive() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void amountExactly() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void amountZero() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }
}

