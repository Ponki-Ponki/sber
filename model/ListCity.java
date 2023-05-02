package model;

import java.util.ArrayList;

import java.util.List;

public class ListCity{
	private List<City> list;

	public ListCity() {
		this.list = new ArrayList<City>();
	}

	public void add(City item) {
		list.add(item);
	}

	public void del(int indx){
		list.remove(indx);
	}

	public Integer length() {
		return list.size();
	}

	public City getCity(int indx) {
		return list.get(indx);
	}

	public List<City> getList() {
		return list;
	}

}
