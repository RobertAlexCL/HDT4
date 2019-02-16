
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = Calculator.getCalculatorInstance();
        Boolean ir = false;
        Boolean ir2 = false;
        String operacion ="";
        Factory<String> gen = new Factory<String>();
        Scanner scanner = new Scanner(System.in);
        AbstractStack<String> stack2 = null;
        String PrimerMenu= "Ingrese la direccion del archivo como se muestra: C:\\Users\\ejemplo\\Desktop\\test.txt\nEscribir 0 para cerrar";
        String SegundoMenu= "Elegir el tipo de pila que se quiere utilizar\n1. ArrayList\n2. Vector\n3. Lista";
        String TercerMenu= "Elegir el tipo de lista que se quiere quiere utilizar\n1. Simplemente encadenada\n2. Doblemente encadenada\n3. Circular";
        System.out.println(PrimerMenu);
        String xd = scanner.nextLine();
        if (!xd.equals("0")){
            try {
                File file = new File(xd);
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    operacion += sc.next();
                }
                System.out.println("Operación escaneada: " + operacion);
                ir = true;

            } catch (Exception e) {
                System.out.println("No se encontro el archivo de texto que especifico.");
            }
        }else {
            System.out.println("Bye Goodnight Saigon");
        }
       if (ir){
           try {
               System.out.println(SegundoMenu);
               String xdd = scanner.nextLine();
               switch (Integer.parseInt(xdd)){
                   case 1: {
                        stack2 = gen.SetType("AL");
                       ir2 = true;
                   } break;
                   case 2: {
                       stack2 = gen.SetType("Vector");
                       ir2 = true;
                   } break;
                   case 3:{
                       System.out.println(TercerMenu);
                       String xddd = scanner.nextLine();
                       switch (Integer.parseInt(xddd)){
                           case 1:{

                               stack2 = new ListStack<String>("SL");
                               ir2 = true;
                           } break;
                           case 2:{
                               stack2 = new ListStack<String>("DL");
                               ir2 = true;
                           } break;
                           case 3:{
                               stack2 = new ListStack<String>("CL");
                               ir2 = true;
                           } break;
                           default:{
                               System.out.println("Ingrese una opción correcta");
                           }
                       }
                   } break;
                   default:{
                       System.out.println("Ingrese una opción correcta");
                   }
               }

           }catch (Exception e){
               System.out.println("Ingresar Numero");
               e.printStackTrace();
           }

        }
       if (ir2) {
           try {
               String n1;
               String n2;
               double d1;
               double d2;
               for (int i = 0; i < operacion.length(); i++)
                   switch (operacion.charAt(i)) {
                       case '+': {
                           n1 = stack2.pop();
                           d1 = Double.parseDouble(n1);
                           n2 = stack2.pop();
                           d2 = Double.parseDouble(n2);
                           stack2.push(String.valueOf(calculator.sumar(d1,d2)));
                       }
                       break;
                       case '-': {
                           n1 = stack2.pop();
                           d1 = Double.parseDouble(n1);
                           n2 = stack2.pop();
                           d2 = Double.parseDouble(n2);
                           stack2.push(String.valueOf(calculator.restar(d1,d2)));
                       }
                       break;
                       case '*': {
                           n1 = stack2.pop();
                           d1 = Double.parseDouble(n1);
                           n2 = stack2.pop();
                           d2 = Double.parseDouble(n2);
                           stack2.push(String.valueOf(calculator.multiplicacion(d1,d2)));
                           
                       }
                       break;
                       case '/': {
                           n1 = stack2.pop();
                           d1 = Double.parseDouble(n1);
                           n2 = stack2.pop();
                           d2 = Double.parseDouble(n2);
                           stack2.push(String.valueOf(calculator.division(d1,d2)));
                       }
                       break;
                       default: {
                           stack2.push(Character.toString(operacion.charAt(i)));
                       }
                   }
               System.out.println("El resulltado es: "+ stack2.pop());
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
}