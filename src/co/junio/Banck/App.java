package co.junio.Banck;

public class App {
    public static void main(String[] args) {

        //criar uma conta de usuario (agencia, conta,nome)
        // limitar o nome + 12 carfacteres
        Account account = new Account("0001", "1234", "junio");

        // sacar valores
        // nao pode sacar mais do que tem
        boolean succeed = account.whithDraw(200.0);
        if (!succeed) {
            System.out.println("voce nao tem saudo suficiente para sacar esse valo!");
        }


        account.deposit(100);
        account.deposit(50);
        account.deposit(100);

        if (account.whithDraw(200)) {

            System.out.print("Saque realizado!");

        } else {
            System.out.println("voce nao tem saldo suficiente para sacar!");
        }
        if (account.whithDraw(200)) {

            System.out.print("Saque realizado!");
        } else {
            System.out.println("voce nao tem saldo suficiente para sacar!");


            // deposito
            // informar para o usuario as operacoes(sangue , deposito)


        }
        System.out.print(account);


    }
}

