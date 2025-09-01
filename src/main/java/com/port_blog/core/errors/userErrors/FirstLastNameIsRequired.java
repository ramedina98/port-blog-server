package com.port_blog.core.errors.userErrors;

public class FirstLastNameIsRequired extends UserError{
  public FirstLastNameIsRequired(Throwable cause) {
    super("User first last name is required",  cause);
  }
}
