package ru.itpark;

public class DepositService {
    public int calculateDeposit(int deposit, int percent, int date) {
        int sum;
        sum = (deposit * percent * date / 100) + deposit;
        return sum;
    }
}

