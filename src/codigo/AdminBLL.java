package codigo;

public class AdminBLL {

    public static void createAdmin(Admin admin){
        codigo.Repositorio.getRepository().getAdmins().put(admin.getNIF(), admin);
        System.out.println("Administrador criado com sucesso!!!");
        codigo.Repositorio.getRepository().serialize("src\\main\\resources\\data\\users.repo"); //alterar este caminho
    }

}
