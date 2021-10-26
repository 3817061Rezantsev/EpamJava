package com.epam.tat.collections.flowers;

import com.epam.tat.collections.models.FreshnessLevel;
import com.epam.tat.collections.models.RoseKinds;

public class Rose extends Flower {

	private RoseKinds kind;

	public Rose() {
		super();
		kind = RoseKinds.BLUE;
	}

	public Rose(double stemLength, double cost, FreshnessLevel level, RoseKinds kind) {
		super(stemLength, cost, level);
		this.kind = kind;
	}

	public Rose(Rose rose) {
		super(rose);
		this.kind = rose.getKind();
	}

	public String toString() {
		return "Rose " + level;
	}

	public RoseKinds getKind() {
		return kind;
	}

	public void setKind(RoseKinds kind) {
		this.kind = kind;
	}
}
