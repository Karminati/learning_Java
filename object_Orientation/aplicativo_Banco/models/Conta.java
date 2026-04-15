import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Conta
{
    private int id;
    private String cpf;
    private String nomeUser;
    private String senha;
    private List<Carteira> carteiras;

    public Conta(int id, String cpf, String nomeUser, int idCarteira, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.nomeUser = nomeUser;
        this.senha = senha;
        Carteira c = new Carteira(idCarteira, this.id, "Conta Corrente");
        this.carteiras = new ArrayList<>();
        this.carteiras.add(c);
    }

    public void adicionaCarteira(Carteira novaCarteira)
    {
        this.carteiras.add(novaCarteira);
    }
    
    public void imprimeCarteiras()
    {
        for(int i = 0; i < this.carteiras.size(); i++)
        {
            System.out.println("Carteira: " + this.carteiras.get(i).getIdCarteira() + " " + this.carteiras.get(i).getTipoCarteira() + " R$" + this.carteiras.get(i).getSaldoCarteira());
        }
    }

    public Boolean verificaSenha(String inserida)
    {
        if(this.senha.equals(inserida))
        {
            return true;
        }
        return false;
    }

    public void depositaEmCarteira(int idCarteira)
    {
        Scanner scan = new Scanner(System.in);
        int cardIndex;
        Carteira c = null;
        for(int i = 0; i < this.carteiras.size(); i++)
        {
            if(this.carteiras.get(i).getIdCarteira() == idCarteira)
            {
                c = this.carteiras.get(i);
                i = this.carteiras.size();
            }
            else if(i == (this.carteiras.size() - 1))
            {
                System.out.println("Essa carteira nao foi encontrada na sua conta!");
                return;
            }
        }

        System.out.println("Digite o valor:");
        double valor = scan.nextDouble();

        if(c != null)
        {
            c.depositarValor(valor);
        }
        scan.close();
    }

    public void transfereParaCarteira(int idCarteira, Carteira cRecebe)
    {
        Scanner scan = new Scanner(System.in);
        int cardIndex;
        Carteira c = null;
        for(int i = 0; i < this.carteiras.size(); i++)
        {
            if(this.carteiras.get(i).getIdCarteira() == idCarteira)
            {
                c = this.carteiras.get(i);
                i = this.carteiras.size();
            }
            else if(i == (this.carteiras.size() - 1))
            {
                System.out.println("Essa carteira nao foi encontrada na sua conta!");
                return;
            }
        }

        System.out.println("Digite o valor:");
        double valor = scan.nextDouble();

        if(c != null)
        {
            c.transfereValor(cRecebe, valor);
        }
        scan.close();
    }
}