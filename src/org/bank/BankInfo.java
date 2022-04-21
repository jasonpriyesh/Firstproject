package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Savings is 200");

	}
	public void fixed() {
		System.out.println("Fixed is 3%");

	}
	@Override
	public void deposit() {
		System.out.println("The Deposit is 50000");
	}
	
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.deposit();
		b.saving();
		b.fixed();
	}

}
