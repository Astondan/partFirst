package by.cdp.jb27_les08;

public class BankAccount {
	private int number;
	
	public BankAccount (int mark) {
		this.number = number;
	}
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number=number;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [number=" + number + "]";
	}
}
