package com.epam.tat.collections;

import java.util.ArrayList;
import java.util.List;

import com.epam.tat.collections.flowers.Flower;
import com.epam.tat.collections.models.FreshnessLevel;

public class Bouquet {
	private List<? extends Flower> flowers;

	public Bouquet(List<? extends Flower> flowers) {
		this.flowers = flowers;
	}

	public Bouquet(Bouquet bouquet) {
		this.flowers = bouquet.getFlowers();
	}

	public double getBouquetCost() {
		double cost = 0;
		for (Flower flower : flowers) {
			cost += flower.getCost();
		}
		return cost;
	}

	public List<Flower> getSortedByFreshness() {
		List<Flower> sortedList = new ArrayList<>();
		for (Flower flower : flowers) {
			if (flower.getLevel() == FreshnessLevel.FRESH)
				sortedList.add(flower);
		}
		for (Flower flower : flowers) {
			if (flower.getLevel() == FreshnessLevel.FADING)
				sortedList.add(flower);
		}
		for (Flower flower : flowers) {
			if (flower.getLevel() == FreshnessLevel.STALE)
				sortedList.add(flower);
		}
		for (Flower flower : flowers) {
			if (flower.getLevel() == FreshnessLevel.ROT)
				sortedList.add(flower);
		}
		return sortedList;
	}

	public List<Flower> getFlowersByLength(double a, double b) {
		List<Flower> sortedList = new ArrayList<>();
		for (Flower flower : flowers) {
			if ((flower.getStemLength() > a) && (flower.getStemLength() < b))
				sortedList.add(flower);
		}
		return sortedList;
	}

	public List<? extends Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<? extends Flower> flowers) {
		this.flowers = flowers;
	}

}
