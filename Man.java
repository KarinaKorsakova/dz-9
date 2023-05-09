public class Man extends Person{

    public Person person;
    public Man(String firstName, String lastName, int age, String partner, String nationality, boolean retired) {
        super(firstName, lastName, age, partner, nationality, retired);

        public static void main(String[] args) {

            Man man = new Man (Іван, Іванов, 56, Анна, Українець, false);

            System.out.println("Ім'я: " + person.getFirstName());
            System.out.println("Прізвище: " + person.getLastName());
            System.out.println("Пенсіонер: " + person.isRetired());

        }
    }
}
