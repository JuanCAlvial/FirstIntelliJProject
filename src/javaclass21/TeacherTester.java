package javaclass21;

public class TeacherTester {

    ChemTeacher chemTeacher=new ChemTeacher();

    public static void main(String[] args) {
        ChemTeacher chemTeacher=new ChemTeacher();
        chemTeacher.degree="Phd in Chem";
        chemTeacher.hasAperiodicTablePoster=true;
        chemTeacher.print();

    }
}
