package biblioteca;

import java.util.ArrayList;
import java.util.List;
// TODO: Documentar la clase

/**
 * Clase que representa una Biblioteca con una colecion de Libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @see Libro
 * @author silviafernandez
 * @version 5.3.2025
 *
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros disponibles en la biblioteca
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor por defecto de la biblioteca sin libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Contructor con parametros.
     * @param libros Lista de libros que se inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Documentar este método.
    //  Test: Comprobar si se ha agregado
    /**
     * Metodo que agrega un libro a la biblioteca.
     * @param libro es el libro que vamos a agregar
     * @see Libro
     * @return {@code true} si el libro se ha agregado correcatamente {@code false} si NO se ha agregado correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Documentar este método.
    //  Test: comprobar si se ha eliminado

    /**
     * Metodo para eliminar un libro de la biblioteca.
     * @param libro es el libro que se va a eliminar
     * @return {@code true} si el libro se ha eliminado correcatamente {@code false} si NO se ha eliminado correctamente
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Metodo para devolver todos los libros a la lista de la biblioteca
     * @return miestra todos los libros de la lista
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Metodo para encontrar un libro por titulo.
     * @param titulo el titulo del libro que buscamos
     * @return nos devuleve el libro que buscamos o {@code null} si NO encontramos el libro que buscamos
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo

    /**
     * @deprecated metodo que ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     * @param autor El autor del libro a buscar
     * @return metodo obsoleto, utiliza el metodo recomendado anteriormente.
     */
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca todos los libros de un autor
     * @since V2.0
     * Sustituye  en su lugar {@link #encuentraLibroPorTitulo(String)}
     * @param autor El autor de los libros a buscar.
     * @return Una lista con los libros del autor, si no se encuentra ningún libro de ese autor, se devuelve una lista vacía.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}