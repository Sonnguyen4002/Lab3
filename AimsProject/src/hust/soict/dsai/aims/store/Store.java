package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.cart.Cart;
public class Store {
    Cart ItemInStore;

    public Store() {
        ItemInStore = new Cart();
        ItemInStore.unlimited_number();
    }
    public void addDVD(DigitalVideoDisc disk) {
    	if (ItemInStore.search_by_title(disk.getTitle()) == false) {
    		ItemInStore.addDigitalVideoDisc(disk);
        System.out.println("This disk has been added");
    	}
    }
    public void removeDVD(DigitalVideoDisc disk) {
    	if (ItemInStore.search_by_title(disk.getTitle()) == true) {
    		ItemInStore.removeDigitalVideoDisc(disk);
            System.out.println("This disk has been removed");
        	}
    }     
}
