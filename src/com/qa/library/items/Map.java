package com.qa.library.items;

import com.qa.library.Item;

public class Map extends Item{

	public boolean isTreasureMap;

	public Map(String name, boolean isTreasureMap) {
		super(name);
		this.isTreasureMap = isTreasureMap;
	}

	public boolean isTreasureMap() {
		return isTreasureMap;
	}

	public void setTreasureMap(boolean isTreasureMap) {
		this.isTreasureMap = isTreasureMap;
	}

	@Override
	public String toString() {
		return "Map [isTreasureMap=" + isTreasureMap + ", name=" + getName() + ", isCheckedIn=" + isCheckedIn() +"]";
	}

	@Override
	public String reading() {
		return "Travel safely";
	}
	
}
