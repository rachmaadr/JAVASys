package oop.application.stats;

public class statsBlock {
  public class Application {
    public static final int PROCESSOR;
    static {
      PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
  }
}
