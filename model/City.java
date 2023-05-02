package model;


public class City {
	private String name;
	private String region;
	private String district;
	private Integer population;
	private String foundation;

	public City(String name, String region, String district, Integer population, String str) {
		this.name = name;
		this.region = region;
		this.district = district;
		this.population = population;
		this.foundation = str;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public String getDistrict() {
		return district;
	}

	public Integer getPopulation() {
		return population;
	}

	public String getFoundation() {
		return foundation;
	}
	
	public String toString() {
		String result = String.format("City{name='%s', region='%s', district='%s', population=%d, foundation='%s'}", name,region,district,population,foundation);
		return result;
	}
}
