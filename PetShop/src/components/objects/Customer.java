package components.objects;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final int birthdayYear;
    private final String passport;

    public Customer(String firstName, String lastName, int birthdayYear, String passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public String getPassport() {
        return passport;
    }

}
