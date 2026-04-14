

class BalancoTrimestral
{
    public static void main(String[] args)
    {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarco = 17000;
        double gastosTrimestre;
        gastosTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        double mediaMensal = gastosTrimestre/3;

        System.out.printf("O gasto total do primeiro trimestre foi de: R$%.2f\n", gastosTrimestre);
        System.out.printf("A media de gastos por mes no primeiro trimestre foi de: R$%.2f", mediaMensal);
    }
}