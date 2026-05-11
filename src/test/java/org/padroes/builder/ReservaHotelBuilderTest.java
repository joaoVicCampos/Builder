package org.padroes.builder;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

class ReservaHotelBuilderTest {

    @Test
    void deveRetornarExcecaoParaReservaSemNumero() {
        try {
            ReservaHotelBuilder reservaHotelBuilder = new ReservaHotelBuilder();
            reservaHotelBuilder
                    .setNomeHospede("Hospede 1")
                    .setDataCheckIn(LocalDate.of(2026, 6, 10))
                    .setDataCheckOut(LocalDate.of(2026, 6, 12))
                    .setTipoQuarto("Standard")
                    .setQuantidadeHospedes(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero da reserva invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaReservaSemNome() {
        try {
            ReservaHotelBuilder reservaHotelBuilder = new ReservaHotelBuilder();
            reservaHotelBuilder
                    .setNumeroReserva(1)
                    .setDataCheckIn(LocalDate.of(2026, 6, 10))
                    .setDataCheckOut(LocalDate.of(2026, 6, 12))
                    .setTipoQuarto("Standard")
                    .setQuantidadeHospedes(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do hospede invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarReservaValida() {
        ReservaHotelBuilder reservaHotelBuilder = new ReservaHotelBuilder();
        ReservaHotel reservaHotel = reservaHotelBuilder
                .setNumeroReserva(1)
                .setNomeHospede("Hospede 1")
                .setDataCheckIn(LocalDate.of(2026, 6, 10))
                .setDataCheckOut(LocalDate.of(2026, 6, 12))
                .setTipoQuarto("Standard")
                .setQuantidadeHospedes(1)
                .build();

        assertNotNull(reservaHotel);
    }
}

