package ar.com.mercadolibre.mundial.unit;

import ar.com.mercadolibre.mundial.controller.JugadorController;
import ar.com.mercadolibre.mundial.models.Jugador;
import ar.com.mercadolibre.mundial.repository.JugadorRepository;
import ar.com.mercadolibre.mundial.services.JugadorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class JugadorControllerTest {
    @Mock
    JugadorService jugadorService;

    @InjectMocks
    JugadorController jugadorController;

    @Test
    @DisplayName("1.1 Create OK")
    public void createOK(){
        //ARRANGE
        Jugador toCreate = new Jugador(
                22,
                "Ronaldo Nazario",
                "Brazil",
                129
        );
        Mockito.when(jugadorService.create(toCreate)).thenReturn(true);

        //ACT
        ResponseEntity<?> receivedResponse = jugadorController.createJugador(toCreate);
        //ASSERT
        Mockito.verify(jugadorService, Mockito.atLeastOnce()).create(toCreate);
        Assertions.assertEquals(receivedResponse.getStatusCode(), HttpStatus.CREATED);

    }


}
