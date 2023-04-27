package co.junio.Banck;

public class Account {
    private static final int MAX_LENGTH = 12;

    private String ag;
    private String cc;
    private  String name;

    private double balance;

    private Log logger ;
        public Account(String ag, String cc, String name) {
            this.ag = ag;
            this.cc = cc;
            this.name = name;
            setName(name);
            logger = new Log();

        }
        public  void setName(String name) {
            if (name.length() > MAX_LENGTH) {
               this.name = name.substring(0, MAX_LENGTH);
            }else{
                this.name = name;

            }

        }
        public void deposit(double value){
            balance +=value;
            logger.out("DEPOSITO -  " +value+ "  sua conta e agora e de R$" + balance);
        }
        public boolean whithDraw(double value){

            if(balance < value){
                logger.out("SAQUE -R$  "  +value+  " seu saudo atual e de R$ " + balance );
                return false;
            }else{
                balance -= value;
                logger.out("SAQUE - R$  "  +value+  "sua conta e agora e de R$" + balance);
                return true;


            }


        }
    }
