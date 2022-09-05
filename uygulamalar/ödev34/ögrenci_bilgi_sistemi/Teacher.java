package ödev34.ögrenci_bilgi_sistemi;

public class Teacher {
    Course course;
    String name;
    String mpno;
    String branch;

    Teacher (String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    void print () {
        System.out.println("Öğretim Elemanı : "+ this.name);
        System.out.println("Telefonu        : "+ this.mpno);
        System.out.println("Bölümü          : "+ this.branch);
    }
}
