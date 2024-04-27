package hust.soict.dsai.aims.Aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Aims {
	public static void main(String[] args) {
		Cart new_cart = new Cart();
		DigitalVideoDisc disk1 = new DigitalVideoDisc("title1");
		
		DigitalVideoDisc disk2 = new DigitalVideoDisc("title2", "category2", 20.0f);
		
		DigitalVideoDisc disk3 = new DigitalVideoDisc("tite3", "category3", "director3", 30.0f);
		
		DigitalVideoDisc disk4 = new DigitalVideoDisc("tite4", "category4", "director4", 40.0f, 50);
		DigitalVideoDisc[] dvdList = {disk1,disk2,disk3,disk4};
		new_cart.addDigitalVideoDisc(disk1);
		new_cart.addDigitalVideoDisc(disk2);
		new_cart.addDigitalVideoDisc(disk3);
		new_cart.addDigitalVideoDisc(disk4);
		new_cart.addDigitalVideoDisc(dvdList);
		
		System.out.println("Current cost: " + new_cart.totalCost());
		
	}
}
