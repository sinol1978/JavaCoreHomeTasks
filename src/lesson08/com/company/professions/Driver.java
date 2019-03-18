package lesson08.com.company.professions;

public class Driver extends Person {

    private int yearsOfExperience;

    public Driver() {

    }

    public Driver(String name, String phoneNumber, int yearOfBirth, String regionInfo, int yearsOfExperience) {
        super(name, phoneNumber, yearOfBirth, regionInfo);
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printInfo(){
        System.out.println("---------------- Driver info ----------------");
        System.out.println("Name: " + this.getName() + "\t Birth: " + this.getYearOfBirth() + "\tPhone: " + this.getPhoneNumber());
        System.out.println("Region: " + this.getRegionInfo() + "\tExperience: " + this.yearsOfExperience + " yrs.");
    }
}
