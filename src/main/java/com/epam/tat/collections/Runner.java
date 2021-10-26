package com.epam.tat.collections;

import java.util.Arrays;
import java.util.List;

import com.epam.tat.collections.flowers.Flower;
import com.epam.tat.collections.flowers.Rose;
import com.epam.tat.collections.flowers.Sunflower;
import com.epam.tat.collections.models.AccessoryType;
import com.epam.tat.collections.models.FreshnessLevel;
import com.epam.tat.collections.models.RoseKinds;

public class Runner {
	static List<Flower> flowers = Arrays.asList(new Rose(32, 4400, FreshnessLevel.FRESH, RoseKinds.BLUE),
			new Sunflower(14, 100, FreshnessLevel.FADING, 12, 500),
			new Rose(16, 400, FreshnessLevel.STALE, RoseKinds.PARK),
			new Sunflower(14, 100, FreshnessLevel.ROT, 50, 5000),
			new Rose(22, 440, FreshnessLevel.FRESH, RoseKinds.REMONTANT));

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet(flowers, new Accessory(AccessoryType.TAPE));
		System.out.println("Bouquet cost - " + bouquet.getBouquetCost());
		List<Flower> freshFlowers = bouquet.getSortedByFreshness();
		System.out.println("Sorted Bouquet By Freshness");
		for (Flower f : freshFlowers) {
			System.out.println(f);
		}
		List<Flower> sortedFlowers = bouquet.getFlowersByLength(15, 24);
		System.out.println("Flowers with length between 15 and 24");
		for (Flower f : sortedFlowers) {
			System.out.println(f);
		}
	}
}
