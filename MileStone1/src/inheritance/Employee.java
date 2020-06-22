package inheritance;

public class Employee extends Person{
	private double anlSalary;
	private int year;
	private String insNum;
	public Employee(String name,double anlSalary,int year,String insNum){
		super(name);
		this.anlSalary=anlSalary;
		this.year=year;
		this.insNum=insNum;
	}
	public double getAnlSalary() {
		return anlSalary;
	}
	public void setAnlSalary(double anlSalary) {
		this.anlSalary = anlSalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsNum() {
		return insNum;
	}
	public void setInsNum(String insNum) {
		this.insNum = insNum;
	}
	public String toString() {
		return super.toString()+" "+anlSalary+" "+year+" "+insNum;
	}
	
}
