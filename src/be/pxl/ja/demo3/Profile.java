package be.pxl.ja.demo3;

import be.pxl.ja.streamingservice.exception.InvalidDateException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Profile implements Comparable<Profile>{
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name, LocalDate dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public Profile(String name){
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        if (dateOfBirth.isAfter(LocalDate.now())){
            throw new InvalidDateException(dateOfBirth, " date of birth", " no date of birth in future allowed!");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        if (dateOfBirth ==null){
            return 0;
        }
        return (int) ChronoUnit.YEARS.between(dateOfBirth, LocalDateTime.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public int compareTo(Profile other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return getName() != null ? getName().equals(profile.getName()) : profile.getName() == null;
//        return Objects.equals(name, profile.name) && Objects.equals(dateOfBirth, profile.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
