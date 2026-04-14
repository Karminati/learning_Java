import java.util.Scanner;


class exercisesFluxControl
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //ex02_1
        int cont = 0;
        for(int i = 150; i <= 300; i++)
        {
            cont++;
            System.out.printf("%d ", i);
            if(cont == 10)
            {
                System.out.printf("\n");
                cont = 0;
            }
        }
        System.out.print("\n");
        //ex02_2
        int soma = 0;
        for(int i = 1; i <= 1000; i++)
        {
            soma += i;
        }
        System.out.println(soma);

        //ex02_3
        for(int i = 1; i <= 100; i++)
        {
            if((i%3) == 0)
            {
                System.out.println(i);
            }
        }

        //ex02_4
        for(int i = 1; i <= 10; i++)
        {
            int fatorial = 1, contFat = i;
            boolean condicao = true;
            while(condicao)
            {
                fatorial *= contFat;
                if(contFat == 1)
                {
                    condicao = false;
                }
                contFat--;
            }
            System.out.println(fatorial);
        }

        //ex02_5
        //aint gonna do it because i know the answer :-)

        //ex02_6
        long lastValue = 0, currentValue = 0;
        for(int i = 1; i <= 100; i++)
        {
            System.out.printf("%d ", currentValue);
            currentValue += lastValue;
            lastValue = currentValue - lastValue;
            if(i == 1)
            {
                currentValue++;
            }
        }
        System.out.println("\n");

        //ex02_7
        System.out.print("Digite o valor de X: ");
        int x = scan.nextInt();
        boolean condicao = true;
        while(condicao)
        {
            if((x%2) == 0)
            {
                x = x/2;
            }
            else
            {
                x = (3 * x) + 1;
            }

            if(x == 1)
            {
                condicao = false;
                System.out.printf("%d\n", x);
            }
            else
            {
                System.out.printf("%d -> ", x);
            }
        }

        //ex02_8
        System.out.print("Digite o valor de N: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                int termoAtual = j*i;
                System.out.printf("%d ", termoAtual);
            }
            System.out.print("\n");
        }


        scan.close();
    }
}