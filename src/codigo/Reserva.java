package codigo;

import java.io.Serializable;

public class Reserva implements Serializable {
    private int id_Reserva;
    private Cliente client;
    private String reservaDate;
    private estadoReserva state;

    public Reserva(){};





    public int getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(int id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public String getReservaDate() {
        return reservaDate;
    }

    public void setReservaDate(String reservaDate) {
        this.reservaDate = reservaDate;
    }

    public estadoReserva getState() {
        return state;
    }

    public void setState(estadoReserva state) {
        this.state = state;
    }
}
