import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1=0,n2=1;

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=inp.nextInt();
                                    //While döngüsü ile
        /*
               int n3=0;
               int counter=0;
           while(counter<number){
               n1=n2;
               n2=n3;
               n3=n1+n2;
               counter=counter+1;
               System.out.println(n3);
        }
         */
                                  //For Döngüsü ile
        int n3=0;
        for (int i=1;i<=number;i++){
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.println(n3);
        }
    }
}
