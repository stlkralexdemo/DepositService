package ru.itpark;

public class DepositService {
    public int calculateDeposit(int deposit, int percent, int date) {
        return deposit * percent * date / 100 + deposit;
    }
}

