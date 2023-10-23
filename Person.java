public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public static void main(String[] args) {
       Person person = new Person();
   
       person.setFirstName("Blake Russ");
       person.setMiddleName("C.");
       person.setLastName("Piner");
       person.setAge(20);
       person.setBirthday("October 14, 2003");
       person.setAddress("Our Lady of Akita Apartment 20-I Aznar Road Extension, Cebu City");
   
       String fullName = person.getFirstName() + " " + person.getMiddleName() + " " + person.getLastName();
   
       System.out.println("Full Name: " + fullName);
       System.out.println("Age: " + person.getAge());
       System.out.println("Birthday: " + person.getBirthday());
       System.out.println("Address: " + person.getAddress());
   }
}
