package ar.com.mercadolibre.mundial.repository;

import ar.com.mercadolibre.mundial.models.Jugador;

import java.util.List;

public interface JugadorRepository {
    List<Jugador> cargarJugadores(); //Esto carga el JSON
    //ToDo: armar CRUD de jugadores (Create, Read, Update and Delete)
    public boolean create(Jugador toCreate);
    public Jugador read(int toRead);
    public boolean update(Jugador toUpdate);
    public boolean delete(int toDelete);

}