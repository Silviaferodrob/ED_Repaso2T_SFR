package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);

    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(libro), "El libro debería eliminarse correctamente.");
    }

    @Test
    void getLibros() {
        biblioteca.agregarLibro(libro);
        assertEquals(1, biblioteca.getLibros().size(), "La biblioteca debería tener 1 libro.");
        assertTrue(biblioteca.getLibros().contains(libro), "La lista de libros debería contener 'The Art of Computer Programming'.");
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming");
        assertNotNull(encontrado, "El libro debería ser encontrado por su título.");
        assertEquals(libro, encontrado, "El libro encontrado debería ser el mismo que agregamos.");
    }

    @Test
    void encuentaLibroPorAutor() {
        biblioteca.agregarLibro(libro);
        Libro encontrado = biblioteca.encuentaLibroPorAutor("Donald Knuth");
        assertNotNull(encontrado, "El libro debería ser encontrado por su autor.");
        assertEquals(libro, encontrado, "El libro encontrado debería ser el mismo que agregamos.");
    }

    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        assertNotNull(biblio.getLibros());
        assertEquals(biblio.getLibros().size(),1);
        assertTrue(biblio.getLibros().contains(this.libro));
    }

}