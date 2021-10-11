package com.epam.tat.collections.flowers;

import com.epam.tat.collections.models.FreshnessLevel;

public class Flower {

	private double stemLength;
	private double cost;
	private FreshnessLevel level;

	public Flower() {
		stemLength = 0;
		cost = 0;
		level = FreshnessLevel.FADING;
	}

	public Flower(double stemLength, double cost, FreshnessLevel level) {
		this.stemLength = stemLength;
		this.cost = cost;
		this.level = level;
	}

	public Flower(Flower flower) {
		this.stemLength = flower.getStemLength();
		this.cost = flower.getCost();
		this.level = flower.getLevel();
	}

	public double getStemLength() {
		return stemLength;
	}

	public void setStemLength(double stemLength) {
		this.stemLength = stemLength;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public FreshnessLevel getLevel() {
		return level;
	}

	public void setLevel(FreshnessLevel level) {
		this.level = level;
	}

}
