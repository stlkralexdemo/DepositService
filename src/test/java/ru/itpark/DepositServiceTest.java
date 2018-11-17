package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @org.junit.jupiter.api.Test
    void calculateDeposit() {
        DepositService depositService = new DepositService();
        int deposit = depositService.calculateDeposit(1_000_000, 10, 3);

        assertEquals(1300000,deposit);

    }
}