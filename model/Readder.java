package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Readder {
	Scanner scan;
	String path;
	
	public Readder(String path) throws FileNotFoundException {
		String pathProject = System.getProperty("user.dir");
		this.path = pathProject.concat("/"+path);
		File file = new File(this.path);
		this.scan = new Scanner(file);
	}

	public ArrayList<String> readFile() {
		ArrayList<String> list = new ArrayList<String>();
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		return list;
	}
}
