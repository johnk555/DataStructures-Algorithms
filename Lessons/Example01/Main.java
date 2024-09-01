class Main {
    public static void main(String[] args) {
        Student s = new Student("Ioannis","Karelas");

        Professor p = new Professor();
        p.gradeStudent(s);

        System.out.println("Teliki bathmologia toy "+s.name +" ,"+ s.surname+": "+ s.finalGrade());
    }
}
