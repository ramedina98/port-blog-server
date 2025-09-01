package com.port_blog.core;

import com.port_blog.core.errors.userErrors.*;

public class User {
  private String firstName;
  private String middleName;
  private String firstLastName;
  private String secondLastName;
  private String username;
  private String email; // TODO: implement email class...
  private UserRol rol;

  public User(
    String firstName,
    String middleName,
    String firstLastName,
    String secondLastName,
    String username,
    String email,
    UserRol rol
  ) throws UserError {
    if (firstName == null || firstName.isEmpty()) {
      throw new FirstNameIsRequired(null);
    }

    if (firstLastName == null || firstLastName.isEmpty()) {
      throw new FirstLastNameIsRequired(null);
    }

    if (username == null || username.isEmpty()) {
      throw new UsernameIsRequired(null);
    }

    if (email == null || email.isEmpty()) {
      throw new EmailIsRequired(null);
    }

    if (rol == null) {
      throw new RolIsRequired(null);
    }

    this.firstName = firstName;
    this.middleName = middleName;
    this.firstLastName = firstLastName;
    this.secondLastName = secondLastName;
    this.username = username;
    this.email = email;
    this.rol = rol;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getFirstLastName() {
    return firstLastName;
  }

  public String getSecondLastName() {
    return secondLastName;
  }

  public String getUsername() {
    return username;
  }

  public String getemail() {
    return email;
  }

  public UserRol getRol() {
    return rol;
  }

  public String getName() {
    StringBuilder name = new StringBuilder();

    name.append(firstName + " ");
    name.append(middleName != null ? this.initials(middleName) + ". " : "");
    name.append(firstLastName + ".");

    return name.toString().trim();
  }

  private String initials(String fieldName) {
    return fieldName.substring(0, 1).toUpperCase();
  }
}
