public class Lesson10  {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] empArray = new Employee[5];

        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov@mail.com", "892312312", 30000, 30);
        empArray[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.com", "893123123", 40000, 35);
        empArray[2] = new Employee("Sidorov Sidor", "Developer", "sidorov@mail.com", "894312312", 50000, 25);
        empArray[3] = new Employee("Fedorov Fedor", "Designer", "fedorov@mail.com", "895312312", 35000, 28);
        empArray[4] = new Employee("Nikolaev Nikolay", "Tester", "nikolaev@mail.com", "896312312", 32000, 31);

        for (Employee emp : empArray) {
            emp.printInfo();
        }

        // Пример использования класса Park
        Park park = new Park("Central Park");
        Park.Attraction attraction1 = park.new Attraction("Roller Coaster", "10:00 - 18:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Ferris Wheel", "11:00 - 19:00", 300);

        park.printParkInfo();
        attraction1.printAttractionInfo();
        attraction2.printAttractionInfo();
    }
}

    class Employee {
        String fullName;
        String position;
        String email;
        String phoneNumber;
        double salary;
        int age;

        public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Position: " + position);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Salary: " + salary);
            System.out.println("Age: " + age);
            System.out.println();
        }
    }

    class Park {
        String parkName;

        class Attraction {
            String attractionName;
            String workingHours;
            double price;

            public Attraction(String attractionName, String workingHours, double price) {
                this.attractionName = attractionName;
                this.workingHours = workingHours;
                this.price = price;
            }

            public void printAttractionInfo() {
                System.out.println("Attraction: " + attractionName);
                System.out.println("Working Hours: " + workingHours);
                System.out.println("Price: " + price);
            }
        }

        public Park(String parkName) {
            this.parkName = parkName;
        }

        public void printParkInfo() {
            System.out.println("Park: " + parkName);
        }
    }


