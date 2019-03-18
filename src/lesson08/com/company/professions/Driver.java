package lesson08.com.company.professions;

public class Driver extends Person {

    private int yearsOfExperiance;

    public Driver() {

    }

    public Driver(String name, String phoneNumber, int yearOfBirth, String regionInfo, int yearsOfExperiance) {
        super(name, phoneNumber, yearOfBirth, regionInfo);
        this.yearsOfExperiance = yearsOfExperiance;
    }
}
