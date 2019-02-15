
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         VectorStack<Integer> stack = new VectorStack<Integer>();
        Calculator calculator = Calculator.getCalculatorInstance();
        Boolean go = false;
        Boolean go2 = false;
        String operacion ="";
        Factory gen = new Factory();
        Scanner scanner = new Scanner(System.in);
        iStack<String> stack2;
        String menu1= "Calculadora encendida\n\nIngrese la direccion del archivo como se muestra: C:\\Users\\ejemplo\\Desktop\\test.txt\nSi desea cerrar el programa escriba el numero cero";
        String menu2= "Elija que tipo de pila quiere utilizar\n1. ArrayList\n2. Vector\n3. Lista";
        String menu3= "Elija que tipo de lista quiere utilizar\n1. Simplemente encadenada\n2. Doblemente encadenada\n3. Circular";
        System.out.println(menu1);
        String dir = scanner.nextLine();
        if (!dir.equals("0")){
            try {
                File file = new File(dir);
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine()) {
                    operacion += sc.next();
                }
                System.out.println("Operación escaneada: " + operacion);
                go = true;

            } catch (Exception e) {
                System.out.println("No se encontro el archivo de texto que especifico.");
            }
        }else {
            System.out.println("Gracias por utilizar nuestra calculadora");
        }
       if (go){
           try {
               System.out.println(menu2);
               String op = scanner.nextLine();
               switch (Integer.parseInt(op)){
                   case 1: {
                       //Implementacion de un ArrayList
                        stack2 = gen.SetType("AL");
                       go2 = true;
                   } break;
                   case 2: {
                       //Implementación de un Vector
                       go2 = true;
                   } break;
                   case 3:{
                       System.out.println(menu3);
                       String op2 = scanner.nextLine();
                       switch (Integer.parseInt(op2)){
                           case 1:{
                               //Implementación de una lista simplemente encadenada
                               go2 = true;
                           } break;
                           case 2:{
                               //Implementación de una lista doblemente encadenada
                               go2 = true;
                           } break;
                           case 3:{
                               //Implementación de la lista circular
                               go2 = true;
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
               System.out.println("Ingrese un número");
               e.printStackTrace();
           }

        }
       if (go2){
           try {
               for (int i = 0; i<operacion.length();i++)
                   switch (operacion.charAt(i)){
                       case '+':{
                            //Sacamos los datos y los sumamos y el resultado lo volvemos a meter
                       }break;
                       case '-':{
                           //Sacamos los datos y los restamos y el resultado lo volvemos a meter
                       }break;
                       case '*':{
                           //Sacamos los datos y los multiplicamos y el resultado lo volvemos a meter
                       }break;
                       case '/':{
                           //Sacamos los datos y los dividimos y el resultado lo volvemos a meter
                       }break;
                        default:{
                           //Metemos el número
                        }
                   }
               //Imprimimos el resultado
           } catch (Exception e){
               e.printStackTrace();
           }
       }
       /*
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }*/
    }
    }
