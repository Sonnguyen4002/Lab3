package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;
public class Cart {
	private int qtyOrdered = 0;
	private ArrayList<DigitalVideoDisc> my_cart = new ArrayList<DigitalVideoDisc>();
	public int MAX_NUMBER = 20;
	public void unlimited_number() {
		this.MAX_NUMBER = Integer.MAX_VALUE;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disk) {
		if (this.qtyOrdered <= MAX_NUMBER) {
			this.my_cart.add(disk);
			qtyOrdered +=1;
			// System.out.println("A disk has been added");
		} else {
			System.out.println("The cart is full");
		}
	};

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		if (this.qtyOrdered <= MAX_NUMBER - qtyOrdered) {
			for (DigitalVideoDisc disk : dvdList) {
			this.my_cart.add(disk);
			qtyOrdered +=1;
			}
			// System.out.println("Many disks have been added");
		} else {
			System.out.println("The cart is full");
		}
	};


	
	public void removeDigitalVideoDisc(DigitalVideoDisc disk) {
		if (this.qtyOrdered >= 1) {
			this.my_cart.remove(disk);
			qtyOrdered +=1;
			// System.out.println("A disk has been removed");
		} else {
			System.out.println("The cart is empty");
		}
	};
	
	public float totalCost() {
		float total_cost = 0;
		for (DigitalVideoDisc disk : this.my_cart) {
			total_cost += disk.getCost();
		}
		return total_cost;
	}
	

	public String toString(DigitalVideoDisc disk) {
		return "DVD - "+ disk.getTitle() + " - "+ disk.getCategory() + " - " + disk.getDirector() + " - " + disk.getLength() + ": " + disk.getCost() + "$";
	}
	public void print() {
		double total = 0;
		for (DigitalVideoDisc disk : my_cart) {
			System.out.println(toString(disk));
			total += disk.getCost();
		}
		System.out.println("Total Cost: " + total);
	}
	public boolean search_by_id(int my_id) {
	    for (DigitalVideoDisc disk : my_cart) {
	        if (disk.getId() == my_id) {
	            System.out.println(toString(disk));
	            return true;
	        }
	    }
	    
	    
	    return false;
	}

	public boolean search_by_title(String my_title) {
		for (DigitalVideoDisc disk : my_cart) {
	        if (disk.getTitle() == my_title) {
	            System.out.println(toString(disk));
	            return true;
	        }
	    }
	    
	    
	    return false;
	}
	
}
