import java.util.Scanner;

public class Sistema{
  public static void main(String argsp[]){
   
   Scanner entrada = new Scanner (System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;

   System.out.println("**********************************");
   System.out.println("*Bienvenido al Sistema Vacacional*");
   System.out.println("**********************************");
   System.out.println("");
   System.out.println("");

   System.out.print("Cual es tu nombre?: ");
   nombre = entrada.nextLine();
   System.out.println("");

   System.out.print("Cuanto tiempo tienes trabajando?: ");
   antiguedad = entrada.nextInt();
   System.out.println("");
   
   System.out.print("Cual es la clave del trabajador?: ");
   clave = entrada.nextInt();
   System.out.println("");

   if (clave == 1){
     if(antiguedad == 1){
       System.out.println(nombre + ", tu tienes derecho a 6 dias de vacaciones");
     } else if( antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre + ", tu tienes derecho a 14 dias de vacaciones");
     } else if( antiguedad >= 7){
       System.out.println(nombre + ", tu tienes derecho a 20 dias de vacaciones");
     }
   } else if(clave == 2){
     if(antiguedad == 1){
       System.out.println(nombre + ", tu tienes derecho a 8 dias de vacaciones");
     } else if( antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre + ", tu tienes derecho a 16 dias de vacaciones");
     } else if( antiguedad >= 7){
       System.out.println(nombre + ", tu tienes derecho a 22 dias de vacaciones");
     }
   } else if( clave == 3){
     if(antiguedad == 1){
       System.out.println(nombre + ", tu tienes derecho a 10 dias de vacaciones");
     } else if( antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre + ", tu tienes derecho a 18 dias de vacaciones");
     } else if( antiguedad >= 7){
       System.out.println(nombre + ", tu tienes derecho a 24 dias de vacaciones");
     }
   }else {
   System.out.println("Error!, la clave de departamento es incorrecta");
   }
 }
}