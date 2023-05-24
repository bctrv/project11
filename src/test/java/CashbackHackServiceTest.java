import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void amountPositive() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void amountExactly() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void amountZero() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }
}


