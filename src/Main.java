import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner insertGrades = new Scanner(System.in);
        int grade1 ;
        int grade2 ;
        int grade3 ;
        int grade4 ;
        int grade5 ;

        try {
            System.out.println("Enter grade #1");
            grade1 = insertGrades.nextInt();
            System.out.println("Enter grade #2");
            grade2 = insertGrades.nextInt();
            System.out.println("Enter grade #3");
            grade3 = insertGrades.nextInt();
            System.out.println("Enter grade #4");
            grade4 = insertGrades.nextInt();
            System.out.println("Enter grade #5");
            grade5 = insertGrades.nextInt();
            //-------------------------------------------------------
            if (grade1 < 0 || grade2 < 0 ||grade3 < 0 ||grade4 < 0 ||grade5 < 0 ){
                throw new ArithmeticException("Grades cant be negative");

            }else if (grade1 > 101 || grade2 > 101 ||grade3 > 101 ||grade4 > 101 ||grade5 > 101 ){
                throw new Exception("Grades cant be higher than 100");

            }else {
                int Promedio = (((grade1 + grade2 + grade3 + grade4 + grade5) / 5));
                System.out.println("-----------------------------------------------------");
                System.out.println("Grade average is:" + Promedio);
                if (Promedio >= 70){
                    System.out.println("Aprobado");
                }else{
                    System.out.println("Reprobado");
                }
                System.out.println("-----------------------------------------------------");
            }
        }catch(ArithmeticException arg){
            System.out.println("-----------------------------------------------------");
            System.out.println(arg.getMessage());
        }catch(Exception exc){
            System.out.println("-----------------------------------------------------");
            System.out.println(exc.getMessage());
        }finally{
            System.out.println("-----------------------------------------------------");
            System.out.println("Process Finished");
        }
    }
}
