package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Gato;

public class GatoTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testSonidoGato() {
        Gato g = new Gato("Nano");
        g.sonido();
        assertEquals("Miau\n", outContent.toString());
    }
}

//Al intentar hacerlo como en el PerroTest no me ha salido de forma manual,
//y he probado de todas las maneras y no me deja, por tanto lo he buscado para poder hacerlo