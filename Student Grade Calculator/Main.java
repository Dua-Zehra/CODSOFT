import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final float gA=80.0f;
        final float gB=70.0f;
        final float gC=60.0f;
        final float gD=50.0f;
        final float gE=40.0f;

        float marks;
        float sum=0;
        System.out.println("Enter the number of subjects: ");
        int a= scan.nextInt();

        for (int i=1;i<=a;i++){
            System.out.println("Enter the marks of subject "+i+" : ");
            marks= scan.nextFloat();
            sum=sum+marks;
        }
        float Per;
        Per=(float) sum/(a*100)*100;

        char grade;
        if(Per>=gA){
            grade='A';
        }
        else if (Per>=gB) {
            grade='B';

        }
        else if (Per>=gC) {
            grade='C';

        }
        else if (Per>=gD) {
            grade='D';

        }
        else if (Per>=gE) {
            grade='E';

        }
        else {
            grade='F';
        }

        System.out.println("Total Marks= "+ sum);
        System.out.println("Percentage= "+Per);
        System.out.println("Grade= "+grade);

        scan.close();

    }
}
