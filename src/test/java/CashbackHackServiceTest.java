import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void amountPositive() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void amountExactly() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void amountZero() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }
}


