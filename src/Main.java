import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                //ucgenin çevresi = 2u
                //ücgenin alanı= u=(a+b+c)/2
                //alan*alan=u*(u-a)*(u-b)*(u-c)

                int a,b;
                ;
                Scanner inp = new Scanner(System.in);

                System.out.print("Üçgenin a kenarını giriniz : ");
                a = inp.nextInt();

                System.out.print("Üçgenin b kenarını giriniz : ");
                b = inp.nextInt();

                double c= Math.sqrt((a*a)+(b*b));

                System.out.println("hipotenus : " + c);

                double u= (a+b+c)/2;

                double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

                System.out.println("Ücgeninizin alanı : "+ alan);









            }
}