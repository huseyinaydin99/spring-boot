package tr.com.huseyinaydin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category RESTful Web Services
 *
 */

// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez
@Path(value = "/merkez")
public class Merkez {

//	
//	GET    --- READ
//	POST   --- INSERT
//	PUT    --- UPDATE
//	DELETE --- DELETE
//	

	// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez/sorgu1
	@GET
	@Path(value = "/sorgu1")
	public String metot1() {
		System.out.println("metot1");
		return "metot1";
	}

	// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez/sorgu2
	@GET
	@Path(value = "/sorgu2")
	@Produces(MediaType.TEXT_PLAIN)
	public String metot2() {
		System.out.println("metot2");
		return "metot2";
	}

	// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez/sorgu3
	@GET
	@Path(value = "/sorgu3")
	@Produces("text/html")
	public String metot3() {
		System.out.println("metot3");
		return "<h1>metot3</h1>";
	}

	// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez/sorgu4/{benimParametrem}
	@GET
	@Path(value = "/sorgu4/{benimParametrem}")
	@Produces(MediaType.TEXT_XML)
	public Response metot4(@PathParam("benimParametrem") String benimParametrem) {
		System.out.println("metot4 gelen parametre: " + benimParametrem);
		String sonuc = "<?xml version=\"1.0\"?> <mesaj>" + benimParametrem + "</mesaj>";
		return Response.status(200).entity(sonuc).build();
	}

	// http://localhost:8080/_003_RESTfulAnnotation/rest/merkez/sorgu5/{p1}/{p2}/{p3}/{p4}
	@GET
	@Path(value = "/sorgu5/{p1}/{p2}/{p3}/{p4}")
	@Produces("text/plain;charset=utf-8")
	public Response metot5(@PathParam("p1") String p1, @PathParam("p2") String p2, @PathParam("p3") String p3,
			@PathParam("p4") String p4, @PathParam("p5") String p5) {
		String sonuc = "<?xml version=\"1.0\"?> <mesaj>" + p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5 + "</mesaj>";
		return Response.status(200).entity(sonuc).build();
	}
}