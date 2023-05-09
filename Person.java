public class Person {
        private String firstName;
        private String lastName;
        private int age;
        private String partner;
        private String nationality;
        private boolean retired;


        public Person(String firstName, String lastName, int age, String partner, String nationality) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.partner = partner;
            this.nationality = nationality;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
        return lastName;
        }
        public void setLastName(String lastName) {
        this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getPartner() {
        return partner;
        }
        public void setPartner(String partner) {
        this.partner = partner;
        }

        public String getNationality() {
        return nationality;
        }
        public void setNationality(String nationality) {
        this.nationality = nationality;
        }

        public boolean isRetired() {
        return retired;
        }
        public void setRetired(boolean retired) {
        this.retired = retired;
        }

        protected void setMaidenName(String Петренко) {
        }
}
