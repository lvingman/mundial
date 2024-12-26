package ar.com.mercadolibre.mundial.controller;

import ar.com.mercadolibre.mundial.models.Jugador;
import ar.com.mercadolibre.mundial.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    @Autowired
    JugadorService jugadorService;

    @PostMapping("")
    public ResponseEntity<?> createJugador(@RequestBody Jugador jugador){
        return new ResponseEntity<>(jugadorService.create(jugador), HttpStatus.CREATED);
    }

}
