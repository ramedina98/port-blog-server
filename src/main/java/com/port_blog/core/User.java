package com.port_blog.core;

public class User {
  private String firstName;
  private String middleName;
  private String firstLastName;
  private String secondLastName;
  private String username;
  private String email;
  private String rol;

  public User(
    String firstName,
    String middleName,
    String firstLastName,
    String secondLastName,
    String username,
    String email,
    String rol
  ) {
    this.fieldValidation();

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

  public String getRol() {
    return rol;
  }

  // deasrrollar al 100...
  public String getName() {
    StringBuilder name = new StringBuilder();

    name.append(firstName);
    name.append(middleName != null ? this.initials(middleName) + ". " : "");
    name.append(firstLastName != null ? firstLastName : "");

    return name.toString().trim();
  }

  private void fieldValidation() {
    if (firstName == null || firstName.isEmpty()) {
      // crear un error custom para esto...
      throw new Error("Hola");
    }

    if (firstLastName == null || firstLastName.isEmpty()) {
      // creare error custom...
    }

    if (username == null || username.isEmpty()) {
      // crear error custom...
    }

    if (email == null || email.isEmpty()) {
      // crear error custom...
    }

    if (rol == null || rol.isEmpty()) {
      // crear error custom..
    }
  }

  private String initials(String fieldName) {
    return fieldName.substring(0, 1).toUpperCase();
  }
}
