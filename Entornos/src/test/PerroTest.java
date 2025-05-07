package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Perro;

public class PerroTest {
    Perro p = new Perro("Rex");

	
    @Test
     void sonido() {
        assertEquals("Guau", p.sonido());
    }
}