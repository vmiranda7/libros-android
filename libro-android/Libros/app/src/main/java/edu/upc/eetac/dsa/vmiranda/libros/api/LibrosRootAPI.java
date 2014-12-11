package edu.upc.eetac.dsa.vmiranda.libros.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miranda on 07/12/2014.
 */
public class LibrosRootAPI {
    private Map<String, Link> links;

    public LibrosRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }
}