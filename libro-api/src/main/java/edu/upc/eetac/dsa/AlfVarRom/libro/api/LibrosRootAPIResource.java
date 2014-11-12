package edu.upc.eetac.dsa.AlfVarRom.libro.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.upc.eetac.dsa.AlfVarRom.libro.api.modelos.LibrosRootAPI;
@Path("/")
public class LibrosRootAPIResource {
	
	@GET
	public LibrosRootAPI getRootAPI() {
		LibrosRootAPI api = new LibrosRootAPI();
		return api;
	}

}
