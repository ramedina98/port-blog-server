package com.port_blog.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.port_blog.core.errors.userErrors.*;

public class UserTests {
  @Test
  void shouldCreateUserWhenAllFieldsAreValid() throws UserError {
    User user = new User(
      "Juan",
      "Carlos",
      "Pérez",
      "Gómez",
      "jcperez",
      "juan@example.com",
      UserRol.ADMINISTRATOR
    );

    assertEquals("Juan", user.getFirstName());
    assertEquals("Pérez", user.getFirstLastName());
    assertEquals("jcperez", user.getUsername());
    assertEquals("juan@example.com", user.getemail());
    assertEquals(UserRol.ADMINISTRATOR, user.getRol());
    assertEquals("Juan C. Pérez.", user.getName());
  }

  @Test
  void shouldThrowErrorWhenFirstNameIsMissing() {
    assertThrows(FirstNameIsRequired.class, () -> new User(
      null,
      "Carlos",
      "Pérez",
      "Gómez",
      "jcperez",
      "juan@example.com",
      UserRol.ADMINISTRATOR
    ));
  }

  @Test
  void shouldThrowErrorWhenFirstLastNameIsMissing() {
    assertThrows(FirstLastNameIsRequired.class, () -> new User(
      "Juan",
      "Carlos",
      null,
      "Gómez",
      "jcperez",
      "juan@example.com",
      UserRol.ADMINISTRATOR
    ));
  }

  @Test
  void shouldThrowErrorWhenUsernameIsMissing() {
    assertThrows(UsernameIsRequired.class, () -> new User(
      "Juan",
      "Carlos",
      "Pérez",
      "Gómez",
      null,
      "juan@example.com",
      UserRol.ADMINISTRATOR
    ));
  }

  @Test
  void shouldThrowErrorWhenEmailIsMissing() {
    assertThrows(EmailIsRequired.class, () -> new User(
      "Juan",
      "Carlos",
      "Pérez",
      "Gómez",
      "jcperez",
      null,
      UserRol.ADMINISTRATOR
    ));
  }

  @Test
  void shouldThrowErrorWhenRolIsMissing() {
    assertThrows(RolIsRequired.class, () -> new User(
      "Juan",
      "Carlos",
      "Pérez",
      "Gómez",
      "jcperez",
      "juan@example.com",
      null
    ));
  }
}
