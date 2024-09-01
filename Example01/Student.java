class Student {
    String name;
    String surname;

    int hw1;
    int hw2;
    int exam;

    Student(String Name,String Surname){
        this.name = Name;
        this.surname = Surname;
    }

    Student(String name,String surname,int hw1,int hw2){
        this(name, surname);
        this.hw1 = hw1;
        this.hw2 = hw2;
    }

    void gradeAssignment1(int hw1){
        this.hw1 = hw1;
    }

    void gradeAssignment2(int hw2){
        this.hw2 = hw2;
    }

    void GradeFinalExam(int exam){
        this.exam = exam;
    }

    double finalGrade(){
        return (hw1+hw2+exam)/3.0;
    }
}
