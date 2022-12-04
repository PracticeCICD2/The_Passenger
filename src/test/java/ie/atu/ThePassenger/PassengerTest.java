package ie.atu.ThePassenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
private Passenger myPass;

@Test
    void TestConstructorTitle(){
    myPass = new Passenger("Mr","Sean",453, 4342323, 17);
    assertEquals("Sean", myPass.getName());
}

    @Test
    void TestConstructorInvalidTitle() {
        final String Invalid = "Invalid title provider";
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {});
        Throwable exceptionThrown = null;
        assertEquals(Invalid, exceptionThrown.getMessage());
    }
}


