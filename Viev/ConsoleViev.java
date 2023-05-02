package Viev;
import model.ListCity;

public class ConsoleViev {

	ListCity list;

	public ConsoleViev(ListCity list) {
		this.list = list;
	}

	public void printList() {
		for (int i = 0; i < list.length(); i++) {
			String item = list.getCity(i).toString();
			System.out.println(item);
		}
	}
}
