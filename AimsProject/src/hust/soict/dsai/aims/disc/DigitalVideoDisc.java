package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	

	public String getTitle() {
		return this.title;
	};
	public String getCategory() {
		return this.category;
	};
	public String getDirector() {
		return this.director;
	};
	public int getLength() {
		return this.length;
	};
	public float getCost() {
		return this.cost;
	};
	public float getId() {
		return this.id;
	};
	

	public void setTitle(String title) {
		this.title = title;
	};
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}


//	overload
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};
	public DigitalVideoDisc(String title, String category, String director, float cost, int length) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.director = director;
		this.length = length;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	};

}
