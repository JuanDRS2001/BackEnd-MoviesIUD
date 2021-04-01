package co.edu.iudigital.app.service.iface;

import java.util.List;
import co.edu.iudigital.app.model.entity.Movie;

public interface MovieService {
	
	
	public List<Movie> getAll();
	/**
	 * Lista de las películas
	 * @return
	 */
	
	public void create(Movie movie);
	/**
	 * Crear una película
	 * @param movie
	 */
	
	public void edit(Movie movie, int movieId);
	/**
	 * Editar una película por Id
	 * @param movie
	 * @param movieId
	 */
	
	public void delete(int movieId);
	/**
	 * Borra una película por su Id
	 * @param movieId
	 */
	
	public void rate(Movie movie, int movieId);
	/**
	 * Califica una película
	 * @param movie
	 * @param movieId
	 */
}