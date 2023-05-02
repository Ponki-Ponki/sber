import java.io.FileNotFoundException;

import Viev.ConsoleViev;
import model.CSVtoListCity;
import model.ListCity;

/**
 * main
 */
public class Programm {

	public static void main(String[] args) throws FileNotFoundException {
		CSVtoListCity read = new CSVtoListCity("db.csv"); // подключение модуля чтения и чтение файла
		ListCity list = read.getList(); // получение списка после чтения из файла
		ConsoleViev viev = new ConsoleViev(list); // Модуль отображения через консоль
		viev.printList(); //Вывод в консоль
	}
}