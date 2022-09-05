package ödev34.ögrenci_bilgi_sistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbalNote = 0;

    }

    void addTeacher (Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println(this.name + " dersi ile seçilen Öğretim elemanı bilgileri uyuşmuyor!");
        }  
    }

    void printTeacher () {
        if (teacher != null) {
            this.teacher.print();
        } else {
            System.out.println(this.name + " dersine öğretim elemanı atanmamıştır!");
        }
        
    }
}
