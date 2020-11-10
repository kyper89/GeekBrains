package level_1.lesson_5.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String fullName, email, telephone, inn, passportData;
    private int age;
    private float wage, experience;
    private Date birthDate, employmentDate;
    private Gender gender;
    private Position position;
    private Unit unit;

    public Employee(String fullName, Date birthDate, Gender gender, String passportData, String email, String telephone, String inn, Unit unit, Position position, float wage) {

        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.passportData = passportData;
        this.email = email;
        this.telephone = telephone;
        this.inn = inn;
        this.unit = unit;
        this.position = position;
        this.wage = wage;

        this.employmentDate = new Date();
        calculateAge();
        calculateExperience();
    }

    public Employee(String fullName, Date birthDate, Gender gender, Unit unit, Position position) {

        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.unit = unit;
        this.position = position;

        this.employmentDate = new Date();
        calculateAge();
        calculateExperience();
    }

    public void calculateAge() {
        long difference = new Date().getTime() - this.birthDate.getTime();
        this.age = (int)(difference / (365.25 * 24 * 60 * 60 * 1000));
    }

    public void calculateExperience() {
        long difference = new Date().getTime() - this.employmentDate.getTime();
        this.experience = (int)(difference / (365.25 * 24 * 60 * 60 * 1000));
    }

    public void printInfo() {

        System.out.printf("Full name: %27s\n",                      this.fullName);
        System.out.printf("Birth date: %13td %1$tB %1$tY\n",        this.birthDate);
        System.out.printf("Age: %33d\n",                            this.age);
        System.out.printf("Gender: %30s\n",                         this.gender.description);
        System.out.printf("Passport data: %23s\n",                  this.passportData);
        System.out.printf("Email: %31s\n",                          this.email);
        System.out.printf("Telephone: %27s\n",                      this.telephone);
        System.out.printf("INN: %33s\n",                            this.inn);
        System.out.printf("Employment date: %9td %1$tB %1$tY\n",    this.employmentDate);
        System.out.printf("Experience: %26.1f\n",                   this.experience);
        System.out.printf("Unit: %32s\n",                           this.unit.description);
        System.out.printf("Position: %28s\n",                       this.position.description);
        System.out.printf("Wage: %32.2f\n\n",                       this.wage);

    }


    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getInn() {
        return inn;
    }

    public String getPassportData() {
        return passportData;
    }

    public int getAge() {
        return age;
    }

    public float getExperience() {
        return experience;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public Gender getGender() {
        return gender;
    }

    public Position getPosition() {
        return position;
    }

    public Unit getUnit() {
        return unit;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

}
