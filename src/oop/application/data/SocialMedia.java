package oop.application.data;

public class SocialMedia {
  private String name;

  public SocialMedia(String targetName) {
    this.name = targetName;
  }

  public SocialMedia() {
  }

  public String getName() {
    return name;
  }

}

class Instagram extends SocialMedia {
  public String username;
  private String password;

  Instagram(String targetName, String targetUsername, String targetPassword) {
    super(targetName);
    this.username = targetUsername;
    this.password = targetPassword;
  }

  Instagram(String targetUsername, String targetPassword) {
    this.username = targetUsername;
    this.password = targetPassword;
  }

  Instagram() {
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    if (password != null) {
      this.password = password;
    }
  }
}

class Facebook extends Instagram {
  Facebook(String targetUsername, String targetPassword){
    super(targetUsername, targetPassword);
  }
  Facebook(){}

  final void login(String username, String password) {
    System.out.println("Final it means mutable");
  }

}

class WhatsApp extends Facebook {

}
