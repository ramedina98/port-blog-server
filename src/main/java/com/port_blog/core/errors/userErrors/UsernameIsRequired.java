package com.port_blog.core.errors.userErrors;

public class UsernameIsRequired extends UserError {
  public UsernameIsRequired(Throwable cause) {
    super("Username is required", cause);
  }
}
