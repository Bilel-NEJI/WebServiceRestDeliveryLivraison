package service;

import java.util.List;

import javax.persistence.PostUpdate;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Livraison;
import repository.LivraisonRepository;

@Path("/service")
public class ServiceImpl implements IService {

	private LivraisonRepository repository = new LivraisonRepository ();
	
	
	
	@Path("/livraisons")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Override
	public List<Livraison> getAll() {
		return repository.selectAll();	}

	
	
	@Path("/livraison")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Override
	public void addLivraison(Livraison liv) {
			repository.insertLivraison(liv);
	}

	
	
	@Path("/livraison")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	@Override
	public Livraison updateLivraison(Livraison liv) {
		repository.updateLivraison(liv);
		return null;
	}


	
	@Path("/livraison/{code}")
	@GET	@Produces({MediaType.APPLICATION_JSON})
	@Override
	public Livraison getLivraison(@PathParam("code") int code) {
		return repository.find(code);
	}
	
	
	
	@Path("/livraison/{code}")
	@DELETE
	@Override
	public void deleteLivraison(@PathParam("code") int code) {
		repository.delete(code);
	}



}
