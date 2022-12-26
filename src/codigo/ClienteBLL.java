package codigo;

public class ClienteBLL {

    public static void createAdmin(Cliente cli) {
        Repositorio.getRepository().getClients().put(cli.getNIF(), cli);
        System.out.println("Administrador criado com sucesso!!!");
        Repositorio.getRepository().serialize("src\\main\\resources\\data\\users.repo"); //alterar este caminho
    }

}
