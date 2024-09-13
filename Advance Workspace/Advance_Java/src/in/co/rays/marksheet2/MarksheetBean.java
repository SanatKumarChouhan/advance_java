package in.co.rays.marksheet2;

public class MarksheetBean {
	
	private int id;
	private int roll;
	private String name;
	private int phy;
	private int chem;
	private int math;
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhy(int phy) {
		this.phy=phy;
	}
	
	public int getPhy() {
		return phy;
	}
	
	public void setChem(int chem) {
		this.chem=chem;
	}
	
	public int getChem() {
		return chem;
	}
	
	public void setMath(int math) {
		this.math=math;
	}
	
	public int getMath() {
		return math;
	}

}
