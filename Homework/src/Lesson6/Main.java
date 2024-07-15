package Lesson6;

public class Main {
    public static void main (String [] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanchik@gmail.com", "80255555555", 4300, 31);
        employees[1] = new Employee("Shinchyk Alla", "Designer", "allashin@gmail.com", "80448888888", 3100, 27);
        employees[2] = new Employee("Larin Dmitri", "Developer", "larindimdimich@gmail.com", "80296666666", 3850, 42);
        employees[3] = new Employee("Koshirin Anton", "Manager", "koshechka@gmail.com", "80253333333", 3900, 35);
        employees[4] = new Employee("Teplova Sonya", "HR", "sonyatop@gmail.com", "80290000000", 3500, 24);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }

        Park park = new Park();

            Park.Attraction[] attractions = new Park.Attraction[3];
            attractions[0] = park.new Attraction("Cups", "11:00 AM", "6:00 PM", 7.50);
            attractions[1] = park.new Attraction("Roller Coaster", "10:00 AM", "10:00 PM", 13.0);
            attractions[2] = park.new Attraction("Elevator of Death", "04:00 PM", "11:00 PM", 11.25);

            for (Park.Attraction attraction : attractions) {
                attraction.printInfo();
                System.out.println();
            }
    }
}
