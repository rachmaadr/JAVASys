package oop.application.main;

import oop.application.data.GenderLevel;
import oop.application.enums.Gender;

public class GenderApp {
  public static void main(String[] args) {
    GenderLevel gender = new GenderLevel();
    gender.setGender(Gender.FEMALE);
    System.out.println(gender.getGenderLevel().getDescription());

    String levelGender = Gender.FEMALE.name();
    System.out.println(levelGender);

    Gender genderType = Gender.valueOf("MALE");
    System.out.println(genderType);

    Gender[] genders = Gender.values();
    System.out.println(genders);
  }
}
