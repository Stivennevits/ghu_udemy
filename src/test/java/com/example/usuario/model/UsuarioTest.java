package com.example.usuario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testConstructorSinParametros() {
        Usuario usuario = new Usuario();
        assertNull(usuario.getId());
        assertNull(usuario.getNombre());
        assertNull(usuario.getEmail());
    }

    @Test
    public void testConstructorConParametros() {
        Usuario usuario = new Usuario("Juan", "juan@email.com");
        assertEquals("Juan", usuario.getNombre());
        assertEquals("juan@email.com", usuario.getEmail());
        assertNull(usuario.getId());
    }

    @Test
    public void testSettersYGetters() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Ana");
        usuario.setEmail("ana@email.com");

        assertEquals(1L, usuario.getId());
        assertEquals("Ana", usuario.getNombre());
        assertEquals("ana@email.com", usuario.getEmail());
    }
}
