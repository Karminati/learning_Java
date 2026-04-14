import java.util.List;

class Conta
{
    private int id;
    private String cpf;
    private String nomeUser;
    private List<Carteira> carteiras;

    public Conta(int id, String cpf, String nomeUser, int idCarteira) {
        this.id = id;
        this.cpf = cpf;
        this.nomeUser = nomeUser;
        Carteira c = new Carteira(idCarteira, this.id, "Conta Corrente");
        this.carteiras.add(c);
    }

    
    
}