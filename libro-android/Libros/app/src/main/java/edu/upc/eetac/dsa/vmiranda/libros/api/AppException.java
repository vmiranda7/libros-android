package edu.upc.eetac.dsa.vmiranda.libros.api;

/**
 * Created by Miranda on 07/12/2014.
 */
public class AppException extends Exception {
    public AppException() {
        super();
    }

    public AppException(String detailMessage) {
        super(detailMessage);
    }
}
