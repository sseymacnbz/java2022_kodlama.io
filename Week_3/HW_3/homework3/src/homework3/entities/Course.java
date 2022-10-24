package homework3.entities;

public class Course extends Id implements EntitiesManager{
	
	private String courseName;
	private String totalVid;
	private double price;
	
	public Course(int id, String courseName, String totalVid, double price) {
		super(id);
		this.id = id;
		this.courseName = courseName;
		this.totalVid = totalVid;
		this.price = price;
	}

	public String getcourseName() {
		return courseName;
	}

	public void setName(String courseName) {
		this.courseName = courseName;
	}

	public String getTotalVid() {
		return totalVid;
	}

	public void setTotalVid(String totalVid) {
		this.totalVid = totalVid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
