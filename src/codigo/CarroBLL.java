package codigo;

public class CarroBLL {

    public static void createCarro(Carro carro){
        codigo.Repositorio.getRepository().getCarros().put(carro.getMatricula(), carro);
        System.out.println("Carrp criado com sucesso!!!");
        codigo.Repositorio.getRepository().serialize("src\\main\\resources\\data\\users.repo"); //alterar este caminho
    }

}
