package com.epam.tat.collections;

import com.epam.tat.collections.models.AccessoryType;

public class Accessory {
	private AccessoryType type;

	public Accessory(AccessoryType type) {
		this.type = type;
	}

	public AccessoryType getType() {
		return type;
	}

	public void setType(AccessoryType type) {
		this.type = type;
	}

	public int getCost() {
		if (type.equals(AccessoryType.PAPER))
			return 50;
		else if (type.equals(AccessoryType.ROPE))
			return 100;
		else
			return 500;
	}
}
