package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CSVtoListCity {
	private Readder read;
	private ListCity list;

	
	public CSVtoListCity(String path) throws FileNotFoundException {
		this.read = new Readder(path);
		this.list = new ListCity();
		readList();
	}
	
	void readList(){
		ArrayList<String> temp = read.readFile();
		for (String item : temp) {
			City city;
			String[] str = item.split(";");
			if (str.length<6){ // т.к. в списке имеются пропуски, сделано исключение для обхода ошибок
				city = new City(str[1], str[2], str[3],Integer.parseInt(str[4]),"---");
			}
			else{
				city = new City(str[1], str[2], str[3],Integer.parseInt(str[4]),str[5]);
			}
			list.add(city);
		 }
	}

	public ListCity getList(){
		return this.list;
	}
	
}
