package model.entities;

import model.exception.AccountLimitException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws AccountLimitException{
		if(amount > this.withdrawLimit) {
			throw new AccountLimitException("Valor requisitado maior do que limite de saque");
		}else if(amount > this.balance) {
			throw new AccountLimitException("Valor requisitado maior que saldo em conta");
		}
		
		this.balance -= amount;
		System.out.println("Novo saldo: "+ this.getBalance());
	}

	public Double getWithdrawLimit() {
		return this.withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return this.number;
	}

	public String getHolder() {
		return this.holder;
	}

	public Double getBalance() {
		return this.balance;
	}
	
	
}
