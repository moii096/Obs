public class course {
    teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    course(String name, String code, String prefix ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;

    }
    void addTeacher(teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher= teacher ;

        }else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor");
        }


    }
    void printTeacher() {
        this.teacher.print();

    }
}