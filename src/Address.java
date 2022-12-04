
public class Address {
	private String line1;
	private String line2;
	private String pincode;

	public Address(String line1, String line2, String pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pincode = pincode;
	}

	public String toString() {
		return String.format("line1 -[%s] , line2-[%s],pincode[%s]", line1, line2, pincode);
	}
}
