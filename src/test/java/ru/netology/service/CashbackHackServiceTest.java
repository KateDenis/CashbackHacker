package ru.netology.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount800 (){
        assertEquals(200, service.remain(800));
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1 (){
        assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1000() {
            assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1001() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1200() {
        assertEquals(800, service.remain(1200));
    }
}