package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Gato;
import modelo.Perro;

public class AnimalTest {

    @Test
    public void testNombresAnimales() {
        Perro p = new Perro("Rex");
        Gato g = new Gato("Nano");

        assertEquals("Rex", p.getNombre());
        assertEquals("Nano", g.getNombre());
    }
}

