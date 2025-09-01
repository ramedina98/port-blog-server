
package com.port_blog.core.errors.userErrors;

public class RolIsRequired extends UserError {
  public RolIsRequired(Throwable cause) {
    super("User rol is required", cause);
  }
}