package school.lesson4;

public class User {
        private String name;
        private String position;
        private String email;
        private String phonenumber;
        private int salary;
        private int age;

        public User(String name, String position, String email, String phonenumber, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phonenumber = phonenumber;
            this.salary = salary;
            this.age = age;
        }
    public static void main(String[] args) {
        User[] usersArray = new User[5];
        usersArray[0] = new User("Иванов Иван", "Engineer", "ivivan", "892312312", 30000, 30);
        usersArray[1] = new User("Петров Петр", "QA Engineer", "petrpetr", "892312312", 40000, 40);
        usersArray[2] = new User("Иванов Степан", "AQA Engineer", "ivstep", "892312322", 30000, 34);
        usersArray[3] = new User("Петрова Степанида", "AQA Lead", "petstep", "892314422", 50000, 44);
        usersArray[4] = new User("Иванова Степанида", "AQA Engineer", "ivastep", "892312322", 30000, 31);
        for (User user : usersArray) {
            if (user.age > 40) {
                System.out.print("ФИО: " + user.name + ", должность: " + user.position + ", email: " + user.email + ", телефон: " + user.phonenumber + ", зарплата: " + user.salary + ", возраст: " + user.age);

            }
        }
    }
}
