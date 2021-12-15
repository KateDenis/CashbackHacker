package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount800 (){
        assertEquals(service.remain(800), 200);
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1 (){
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1000() {
            assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1001() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldCalculateCashbackHackServiceWithAmount1200() {
        assertEquals(service.remain(1200), 800);
    }

}