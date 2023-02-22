public class teacher {

    String name ;
    String mpno ;
    String branch ;



             teacher(String name , String branch ,String mpno ){
                this.name = name ;
                this.mpno = mpno;
                this.branch = branch;
            }
            void print() {
                System.out.println("Adı    :"  + this.name);
                System.out.println("Tel no :"  + this.mpno);
                System.out.println("Bolumu :"    + this.branch);
            }

        }


