package com.advance.streams;
import java.awt.MenuItem;
import java.util.*;
import java.util.stream.Collectors;

public class CollectGroupingByApp {

	public static void main(String[] args) {
		List<Object> fruitBoxes=List.of(
				    newItem("strawberry", 10, 9.99),
				    newItem("blueberry", 20, 29.99),
				    newItem("pear", 10, 29.99),
				    newItem("apple", 10, 19.99),
				    newItem("kiwi",  10, 9.99),
				    newItem("pear", 10, 9.99),
				    newItem("strawberry", 20, 19.99),
				    newItem("apple", 10, 19.99),
				    newItem("apple", 10, 9.99)
				    );
		
		Map<Boolean, List<Item>>partitionFruitBoxes=fruitBoxes.stream()
				.collect(Collectors.partitioningBy(fruitBox->fruitBox.getPrice()>10));
		System.out.println("fruit boxes cheaper and more expensive than 10:");
		System.out.println(partitionFruitBoxes);
		
		Map<String, List<Item>>fruitBoxesGroups=fruitBoxes.stream()
				   .collect(Collectors.groupingBy(Item::getName));
		System.out.println("fruit boxes are grouped by type:");
		System.out.println(fruitBoxesGroups);
		
		Map<String, long> fruitBoxesCountOrdered=new LinkedHashMap<>();
		fruitBoxesCount.entrySet().Stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(fruitBox->fruitBoxesCountOrdered.put(fruitBox.getKey(),fruitBox.getValue()));
		System.out.println("fruit boxes orderd and counted by type:");
		System.out.println(fruitBoxesCountOrdered);
	}

	private static Object newItem(String string, int i, double d) {
		// TODO Auto-generated method stub
		return null;
	}

		
		

	}


