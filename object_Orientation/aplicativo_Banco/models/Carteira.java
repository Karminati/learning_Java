

class Carteira
{
    private int idCarteira;
    private int idUser;
    private String tipoCarteira;
    private double saldo;

    public Carteira(int idCarteira, int idUser, String tipoCarteira)
    {
        this.idCarteira = idCarteira;
        this.idUser = idUser;
        this.tipoCarteira = tipoCarteira;
        this.saldo = 0;
    }

    public int getIdCarteira()
    {
        return idCarteira;
    }

    public int getIdUser()
    {
        return idUser;
    }

    public String getTipoCarteira()
    {
        return tipoCarteira;
    }

    public double getSaldoCarteira()
    {
        return saldo;
    }

    public void setTipoCarteira(String tipoCarteira)
    {
        this.tipoCarteira = tipoCarteira;
    }

    public void depositarValor(double valorDepositado)
    {
        if(valorDepositado > 0)
        {
            this.saldo += valorDepositado;
            System.out.println("Valor de R$" + valorDepositado + " depositado com sucesso");
        }
        else
        {
            System.out.println("Voce nao pode depositar um valor nulo ou negativo!");
        }
    }


    private void recebeValor(double valor)
    {
        this.saldo += valor;
    }

    public void transfereValor(Carteira recebedor, double valor)
    {
        if((this.saldo - valor) >= 0)
        {
            this.saldo -= valor;
            recebedor.recebeValor(valor);
            System.out.println("Valor transferido com sucesso");
        }
        else
        {
            System.out.println("Essa carteira nao possui saldo suficiente para realizar esta operacao");
        }
    }
    
}