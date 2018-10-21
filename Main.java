import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        int[] liczby=new int[3];

        for (int i=0; i <3; i++)
            liczby[i] = Integer.parseInt(args[i]);

        int a, b, c;
        a=liczby[0];
        b=liczby[1];
        c=liczby[2];
        double p1=0.0, p2=0.0;
        double delta=0.0;
        delta=pow(b,2.0)-(4.0*a*c);

        if(a==0){
            p1=-(c/b);
            System.out.println("Wielomian ma tylko jeden pierwiastek i jest to: " +p1);
        }else if(delta==0){
            p1=-b/2*a;
            System.out.println("Wielomian ma tylko jeden pierwiastek i jest to: " +p1);
        }else if(delta>0){
            p1=-b-sqrt(delta)/2*a;
            p2=-b+sqrt(delta)/2*a;
            System.out.println("Wielomian ma dwa pierwiastek i są to: " +p1+ " i " +p2);
        }else if(delta<0)
            System.out.println("Wielomian nie nie ma pierwiastków");

    }
}

