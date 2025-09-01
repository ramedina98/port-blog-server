package com.port_blog.core.errors.userErrors;

public class UserError extends Exception {
  public UserError(String message) {
    super(message);
  }

  public UserError(String message, Throwable cause) {
    super(message, cause);
  }

  public UserError(Throwable cause) {
    super("User error", cause);
  }

  public UserError() {
    super("User error");
  }
}
