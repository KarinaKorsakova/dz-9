public class Woman extends Person{

    private String maidenName;
    public Person person;
    public Woman (String firstName, String lastName, int age, String partner, String nationality, boolean retired, String maidenName) {
        super(firstName, lastName, age, partner, nationality, retired, maidenName);

        public static void main(String[] args) {
            Woman woman = new woman ();
            woman.setFirstName("Анна");
            woman.setLastName("Іванова");
            woman.setAge(61);
            woman.setPartner("Іван");
            woman.setNationality("Українка");
            woman.setRetired(true);
            woman.setMaidenName("Петренко");

            System.out.println("Ім'я" + person.getFirstName());
            System.out.println("Прізвище" + person.getLastName());
            System.out.println("Пенсіонер" + person.isRetired());
        }

        private void setMaidenName(String "Петренко") {
        }

        public static void main(String[] args) {

            Woman woman = new woman (Анна, Іванова, 61, Іван, Українка, true, Петренко);

            System.out.println("Дівоче прізвище — " + woman.getMaidenName());
            woman.setMaidenName("Петренко");
            System.out.println("Прізвище чоловіка — " + woman.getLastName());
        }

    }


}
