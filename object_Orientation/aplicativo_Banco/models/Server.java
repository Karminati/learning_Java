import java.util.Scanner;

class Server
{
    private long id;
    private String password;
    private int aplicationRequests;
    private int aplicationStatus;

    Server(long id, String password, int aplicationStatus)
    {
        this.id = id;
        this.password = password;
        this.aplicationStatus = aplicationStatus;
        if(aplicationStatus == 1)
        {
            this.aplicationRequests++;
            runServer(aplicationStatus);
        }
    }

    void runServer(int status)
    {
        Scanner scan = new Scanner(System.in);
        if(status == 0)
        {
            System.out.println("The request to run the server failed, check the value of the request");
        }
        else if(status == 1)
        {
            boolean condicao = true;
            while(condicao)
            {
                System.out.println("Type in desired operation:");
                System.out.println("--------------------------------------------------------");
                System.out.println("0 - Terminate server (server password necessary)");
                System.out.println("--------------------------------------------------------");
                System.out.println("1 - Create Account");
                System.out.println("--------------------------------------------------------");
                System.out.println("2 - Log in account");
                System.out.println("--------------------------------------------------------");
                System.out.println("3 - See application status (server password necessary)");
                System.out.println("--------------------------------------------------------");
                int op = scan.nextInt();
                this.aplicationRequests++;
                if(op == 0)
                {
                    System.out.println("Please type in the server password: ");
                    String inserted = scan.next();
                    if(this.password.equals(inserted))
                    {
                        condicao = false;
                        System.out.println("Terminating server operation");
                    }
                }
                else if(op == 1)
                {
                    System.out.println("Do you already have a user? (Y/n)");
                    char confirm = scan.next().charAt(0);
                    if(confirm == 'Y')
                    {

                    }
                    else if(confirm == 'n')
                    {

                    }
                }
                else if(op == 2)
                {

                }
                else if(op == 3)
                {
                    System.out.println("Please type in the server password: ");
                    String inserted = scan.next();
                    if(this.password.equals(inserted))
                    {
                        System.out.printf("The server received %d requests\n", this.aplicationRequests);
                        System.out.printf("The current server status is %d\n", this.aplicationStatus);
                        System.out.printf("(%d) is the server identification", this.id);
                    }
                }
            }
        }
    }
}