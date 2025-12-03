package oop.application.utils;

import oop.application.error.BlankException;
import oop.application.record.LoginRequest;

public class ValidationBlank {
  public static void requireBlankField(String value, String fieldName) throws BlankException {
    if (value == null)
      throw new BlankException("The field must not be null");
    if (value.isBlank())
      throw new BlankException(String.format("The field must not be blank", fieldName));
  }

  public static void validationRuntime(LoginRequest req) throws BlankException {
    requireBlankField(req.username(), "Username");
    requireBlankField(req.password(), "Password");
  }
}
