package org.padroes.builder;

import java.time.LocalDate;

public class ReservaHotelBuilder {

    private final ReservaHotel reservaHotel;

    public ReservaHotelBuilder() {
        this.reservaHotel = new ReservaHotel();
    }

    public ReservaHotel build() {
        if (reservaHotel.getNumeroReserva() <= 0) {
            throw new IllegalArgumentException("Numero da reserva invalido");
        }
        if (reservaHotel.getNomeHospede() == null || reservaHotel.getNomeHospede().isBlank()) {
            throw new IllegalArgumentException("Nome do hospede invalido");
        }
        if (reservaHotel.getDataCheckIn() == null) {
            throw new IllegalArgumentException("Data de check-in obrigatoria");
        }
        if (reservaHotel.getDataCheckOut() == null) {
            throw new IllegalArgumentException("Data de check-out obrigatoria");
        }
        if (!reservaHotel.getDataCheckOut().isAfter(reservaHotel.getDataCheckIn())) {
            throw new IllegalArgumentException("Data de check-out deve ser maior que check-in");
        }
        if (reservaHotel.getTipoQuarto() == null || reservaHotel.getTipoQuarto().isBlank()) {
            throw new IllegalArgumentException("Tipo de quarto obrigatorio");
        }
        if (reservaHotel.getQuantidadeHospedes() <= 0) {
            throw new IllegalArgumentException("Quantidade de hospedes invalida");
        }

        return reservaHotel;
    }

    public ReservaHotelBuilder setNumeroReserva(int numeroReserva) {
        reservaHotel.setNumeroReserva(numeroReserva);
        return this;
    }

    public ReservaHotelBuilder setNomeHospede(String nomeHospede) {
        reservaHotel.setNomeHospede(nomeHospede);
        return this;
    }

    public ReservaHotelBuilder setCpfHospede(String cpfHospede) {
        reservaHotel.setCpfHospede(cpfHospede);
        return this;
    }

    public ReservaHotelBuilder setEmailContato(String emailContato) {
        reservaHotel.setEmailContato(emailContato);
        return this;
    }

    public ReservaHotelBuilder setTelefoneContato(String telefoneContato) {
        reservaHotel.setTelefoneContato(telefoneContato);
        return this;
    }

    public ReservaHotelBuilder setDataCheckIn(LocalDate dataCheckIn) {
        reservaHotel.setDataCheckIn(dataCheckIn);
        return this;
    }

    public ReservaHotelBuilder setDataCheckOut(LocalDate dataCheckOut) {
        reservaHotel.setDataCheckOut(dataCheckOut);
        return this;
    }

    public ReservaHotelBuilder setTipoQuarto(String tipoQuarto) {
        reservaHotel.setTipoQuarto(tipoQuarto);
        return this;
    }

    public ReservaHotelBuilder setQuantidadeHospedes(int quantidadeHospedes) {
        reservaHotel.setQuantidadeHospedes(quantidadeHospedes);
        return this;
    }

    public ReservaHotelBuilder setCafeDaManhaIncluso(boolean cafeDaManhaIncluso) {
        reservaHotel.setCafeDaManhaIncluso(cafeDaManhaIncluso);
        return this;
    }

    public ReservaHotelBuilder setObservacoes(String observacoes) {
        reservaHotel.setObservacoes(observacoes);
        return this;
    }
}

