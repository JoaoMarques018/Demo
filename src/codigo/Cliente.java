package codigo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {

    private String nome;
    private String dataN;
    private String morada;
    private String numeroTele;
    private String NIF;
    private String username;
    private String password;
    private String tipo;
    private List<Reserva> reservas;

    public Cliente(){this.reservas = new ArrayList<Reserva>();
    }



    public void ListAppointments(){
        int numAppointment = 1;
        for(Reserva ap: this.reservas){
            System.out.println("\n----------------------------------------");

            System.out.println("\n----------------------------------------");

        }
    }












    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNumeroTele() {
        return numeroTele;
    }

    public void setNumeroTele(String numeroTele) {
        this.numeroTele = numeroTele;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
