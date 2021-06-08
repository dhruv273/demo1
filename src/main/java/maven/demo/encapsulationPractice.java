package maven.demo;

public class encapsulationPractice {
	

	private String name;
	private int accountNo;
	private float amount;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public void insert(String name, int accountNo, float amount) {
		this.name= name;
		this.accountNo= accountNo;
		this.amount= amount;
	}
	
	

	
}
