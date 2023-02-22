public class Main {
    public static void main(String[] args) {

        teacher t1 = new teacher("Ali" ,  "TRH","1" );
        teacher t2 = new teacher("Mehmet" ,"FZK","2" );
        teacher t3 = new teacher("Murat" ,"MTK","3" );

         course tarih = new course( "Tarih", "101",  "TRH"  );
         tarih.addTeacher(t1);
         course fizik = new course( "Fizik", "102",  "FZK"  );
         fizik.addTeacher(t2);
         course matematik = new course( "Matematik", "103",  "MTK"  );
         matematik.addTeacher(t3);
       student s1 = new student("Süleyman", "170128" , "A" , tarih,fizik ,matematik);
       s1.addBulkExamNote (100 ,60 , 35);
       s1.isPass();
    }

    }
