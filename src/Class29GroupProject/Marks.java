package Class29GroupProject;

abstract public class Marks {

    /*
        2. We have to calculate the average of marks obtained in three subjects by student A and by student B.
        Create class "Marks" with an abstract method "getPercentage" that will be returning the average percentage
        of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes
        the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
        Test your code.
     */
    double Math;
    double Science;
    double English;

    public Marks(double Math, double Science, double English) {
        this.Math = Math;
        this.Science = Science;
        this.English = English;
    }


    public abstract void getPercentage();

}
class StudentA extends Marks{

    StudentA(double Math, double Science, double English){
        super(Math, Science, English);

    }

    @Override
    public void getPercentage() {
        double Avg = (Math + Science + English)/3;
        if(Avg>100){
            System.out.println(Avg+"=A+");
        }
        else if (Avg<=100 && Avg>=90){
            System.out.println(Avg+"=A");
        }else if (Avg<90 && Avg>=80){
            System.out.println(Avg+"=B");
        }else if(Avg<80 && Avg>=70){
            System.out.println(Avg+"=C");
        }else if(Avg<70 && Avg>=60){
            System.out.println(Avg+"=D");
        }else {
            System.out.println(Avg+"=F");
        }
    }
}
class StudentB extends Marks{

    double SocialStudies;

    StudentB(double Math, double Science, double English, double SocialStudies){
        super(Math, Science, English);
        this.SocialStudies = SocialStudies;
    }

    @Override
    public void getPercentage() {
        double Avg = (Math + Science + English + SocialStudies)/4;
        if(Avg>100){
            System.out.println(Avg+"=A+");
        }
        else if (Avg<=100 && Avg>90){
            System.out.println(Avg+"=A");
        }else if (Avg<90 && Avg>80){
            System.out.println(Avg+"=B");
        }else if(Avg<80 && Avg>=70){
            System.out.println(Avg+"=C");
        }else if(Avg<70 && Avg>=60){
            System.out.println(Avg+"=D");
        }else {
            System.out.println(Avg+"=F");
        }
    }
}

class Main1{
    public static void main(String[] args) {
        Marks studentA = new StudentA(85, 90, 98);
        studentA.getPercentage();
        Marks studentB = new StudentB(80, 92, 89, 98);
        studentB.getPercentage();
    }
}