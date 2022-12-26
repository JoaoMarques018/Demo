package codigo;

public class ReservaBLL {

    public static void createReserva(Reserva reserva, Cliente client){
        reserva.setState(estadoReserva.PROCESSADA);
        Repositorio.getRepository().getReservas().put(reserva.getId_Reserva(), reserva);
        Repositorio.getRepository().getClients().get(client.getNIF()).getReservas().add(reserva);
        System.out.println("Consulta criada com sucesso!!!");
        Repositorio.getRepository().serialize("src\\main\\resources\\data\\users.repo");
    }

}
