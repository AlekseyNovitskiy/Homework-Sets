import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private final int number;
    private final String lastName;
    private final String name;
    private final String middleName;
    private final LocalDate localDate;


    public Passport(int number, String lastName, String name, String middleName, LocalDate localDate) {
        this.number = number;

        if (lastName == null || lastName.isBlank()) {
            this.lastName = "информация не указана";
        } else {
            this.lastName = lastName;
        }

        if (name == null || name.isBlank()) {
            this.name = "информация не указана";
        } else {
            this.name = name;
        }
        this.middleName = middleName;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Passport passport = (Passport) o;
        return number == passport.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
