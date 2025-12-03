package oop.application.enums;

public enum Gender {
  MALE("Laki-laki"),
  FEMALE("Perempuan");

  private final String description;

  Gender(String targetDescription) {
    this.description = targetDescription;
  }
  public String getDescription(){
    return description;
  }
  
}
