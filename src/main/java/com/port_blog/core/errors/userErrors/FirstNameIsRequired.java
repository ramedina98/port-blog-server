package com.port_blog.core.errors.userErrors;

public class FirstNameIsRequired extends UserError{
  public FirstNameIsRequired(Throwable cause) {
    super("User first name is required",  cause);
  }
}
