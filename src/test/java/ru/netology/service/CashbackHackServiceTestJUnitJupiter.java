package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestJUnitJupiter {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCalculateCashbackHackServiceWithAmount800 (){
        assertEquals(200, service.remain(800));
    }

    @org.junit.Test
    public void shouldCalculateCashbackHackServiceWithAmount1 (){
        assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void shouldCalculateCashbackHackServiceWithAmount1000() {
        assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void shouldCalculateCashbackHackServiceWithAmount1001() {
        assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void shouldCalculateCashbackHackServiceWithAmount1200() {
        assertEquals(800, service.remain(1200));
    }

}
