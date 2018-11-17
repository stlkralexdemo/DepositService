package ru.itpark;

public class DepositService {
    public int calculateDeposit(int deposit, int percent, int date) {
        return deposit+(deposit * percent * date / 100);
    }
}

