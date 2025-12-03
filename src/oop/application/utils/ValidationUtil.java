package oop.application.utils;

import oop.application.error.ValidationException;
import oop.application.record.LoginRequest;

public class ValidationUtil {

  public static void requireNotNullOrBlank(String value, String fieldName) throws ValidationException {
    if (value == null)
      throw new ValidationException(fieldName + "cannot null");
    if (value.isBlank())
      throw new ValidationException(fieldName + "Cannot blank");
  }

  public static void validate(LoginRequest req) throws ValidationException {
    requireNotNullOrBlank(req.username(), "Username");
    requireNotNullOrBlank(req.password(), "Password");
  }
}
