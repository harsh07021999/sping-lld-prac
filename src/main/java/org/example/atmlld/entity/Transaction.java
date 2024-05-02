package org.example.atmlld.entity;

import org.example.atmlld.entity.enums.TransactionStatus;

import java.util.Date;

public abstract class Transaction {

    Card card;

    Date transactionTime;

    TransactionStatus status;

}
