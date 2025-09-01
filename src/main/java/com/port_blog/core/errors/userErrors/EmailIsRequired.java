package com.port_blog.core.errors.userErrors;

public class EmailIsRequired extends UserError {
  public EmailIsRequired(Throwable cause) {
    super("User email is required", cause);
  }
}
