package Zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        this.phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return this.phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Гринько", "80255555555");
        phoneBook.add("Дубов", "80255556666");
        phoneBook.add("Курочкина", "80255557777");
        phoneBook.add("Гринько", "80255558888");

        System.out.println("Гринько: " + phoneBook.get("Гринько"));
        System.out.println("Дубов: " + phoneBook.get("Дубов"));
        System.out.println("Курочкина: " + phoneBook.get("Курочкина"));
    }
}