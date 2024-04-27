package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
public class CartTest {
    public static void main(String[] args) {
		Cart new_cart = new Cart();
		DigitalVideoDisc disk1 = new DigitalVideoDisc("tite1", "category1", "director1", 40.0f, 50);
		DigitalVideoDisc disk2 = new DigitalVideoDisc("tite2", "category2", "director2", 40.0f, 50);
		DigitalVideoDisc disk3 = new DigitalVideoDisc("tite3", "category3", "director3", 40.0f, 50);
		new_cart.addDigitalVideoDisc(disk1);
		new_cart.addDigitalVideoDisc(disk2);
		new_cart.addDigitalVideoDisc(disk3);
		new_cart.print();
	}
}
