package com.java;

import java.awt.Event;
import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Apple {
	
	
	public static void main(String[] args) {
		List<Event> events = getEvents();

        Scanner scanner = new Scanner(System.in);

        // Read category name
        String category = scanner.nextLine();

        // Read event list size
        int eventListSize = Integer.parseInt(scanner.nextLine());

        // Create event list
        List<Event> eventList = new ArrayList<>();
        for (int i = 0; i < eventListSize; i++) {
            Event event = new Event();
            event.setId(Integer.parseInt(scanner.nextLine()));
            event.setName(scanner.nextLine());
            event.setCategory(scanner.nextLine());
            event.setPrice(Double.parseDouble(scanner.nextLine()));
            eventList.add(event);
        }

        // Filter events and print the output
        int output = filterEvents(category, eventList);
        System.out.println(output);

        scanner.close();
    }

    private static List<Event> getEvents() {
        List<Event> events = new ArrayList<>();

        events.add(new Event(1, "Hero 1", "eco", 23.00));
        events.add(new Event(2, "Hero 2", "sci-fi", 20.00));
        events.add(new Event(3, "Hero 3", "eco", 26.00));
        events.add(new Event(4, "Hero 4", "adventure", 26.00));
        events.add(new Event(5, "Hero 5", "action", 26.00));
        events.add(new Event(6, "Hero 6", "adventure", 28.00));

        return events;
    }

    public static int filterEvents(String category, List<Event> eventList) {
        int count = 0;
        for (Event event : eventList) {
            if (event.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    static class Event {
        private int id;
        private String name;
        private String category;
        private double price;

        public Event() {
        }

        public Event(int id, String name, String category, double price) {
            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
	}


