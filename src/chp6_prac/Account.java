package chp6_prac;

public class Account {
	String accNo;
	String name;
	String baseMoney;
	public Account() {
		
	}
	public Account(	String accNo, String name, String baseMoney) {
		this.accNo=accNo;
		this.name=name;
		this.baseMoney=baseMoney;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBaseMoney() {
		return baseMoney;
	}
	public void setBaseMoney(String baseMoney) {
		this.baseMoney = baseMoney;
	}
	
	
	
}
