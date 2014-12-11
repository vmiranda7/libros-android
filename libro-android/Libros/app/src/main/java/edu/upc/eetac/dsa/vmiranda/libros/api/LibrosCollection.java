package edu.upc.eetac.dsa.vmiranda.libros.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Miranda on 07/12/2014.
 */
public class LibrosCollection {

    private List<Libros> libros ;
    private long NewestTimestamp;
    private long OldestTimestamp;
    private Map<String, Link> links = new HashMap<String, Link>();

    public LibrosCollection() {
        super();
        libros = new ArrayList<Libros>();
    }

    public List<Libros> getLibros() {
        return libros;
    }

    public void setLibros(List<Libros> libros) {
        this.libros = libros;
    }

    public void addLibros(Libros libro) {
        libros.add(libro);
    }

    public long getNewestTimestamp() {
        return NewestTimestamp;
    }

    public void setNewestTimestamp(long newestTimestamp) {
        NewestTimestamp = newestTimestamp;
    }

    public long getOldestTimestamp() {
        return OldestTimestamp;
    }

    public void setOldestTimestamp(long oldestTimestamp) {
        OldestTimestamp = oldestTimestamp;
    }
    public Map<String, Link> getLinks() {
        return links;
    }

}
