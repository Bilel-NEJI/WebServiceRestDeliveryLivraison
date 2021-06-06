package service;

import java.util.List;

import model.Livraison;

public interface IService {

	public List <Livraison> getAll ();
	public void addLivraison(Livraison liv);
	public Livraison updateLivraison (Livraison liv);
	public Livraison getLivraison(int code);
	public void deleteLivraison(int code);
	
	
	
}
