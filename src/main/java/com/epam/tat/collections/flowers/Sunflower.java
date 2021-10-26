package com.epam.tat.collections.flowers;

import com.epam.tat.collections.models.FreshnessLevel;

public class Sunflower extends Flower {

	private double flowerRadius;
	private int seedsCount;

	public Sunflower() {
		super();
		flowerRadius = 0;
		seedsCount = 0;
	}

	public Sunflower(double stemLength, double cost, FreshnessLevel level, double flowerRadius, int seedsCount) {
		super(stemLength, cost, level);
		this.flowerRadius = flowerRadius;
		this.seedsCount = seedsCount;
	}

	public Sunflower(Sunflower sunflower) {
		super(sunflower);
		this.flowerRadius = sunflower.getFlowerRadius();
		this.seedsCount = sunflower.getSeedsCount();
	}

	public String toString() {
		return "Sunflower " + level;
	}

	public double getFlowerRadius() {
		return flowerRadius;
	}

	public void setFlowerRadius(double flowerRadius) {
		this.flowerRadius = flowerRadius;
	}

	public int getSeedsCount() {
		return seedsCount;
	}

	public void setSeedsCount(int seedsCount) {
		this.seedsCount = seedsCount;
	}

}
