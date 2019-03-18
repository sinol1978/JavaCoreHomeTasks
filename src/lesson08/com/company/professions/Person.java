package lesson08.com.company.professions;

public class Person {

    private String name;
    private String phoneNumber;
    private int yearOfBirth;
    private String regionInfo;

    public Person() {
    }

    public Person(String name, String phoneNumber, int yearOfBirth, String regionInfo) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.yearOfBirth = yearOfBirth;
        this.regionInfo = regionInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getRegionInfo() {
        return regionInfo;
    }

    public void setRegionInfo(String regionInfo) {
        this.regionInfo = regionInfo;
    }
}
