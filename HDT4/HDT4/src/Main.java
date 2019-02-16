
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = Calculator.getCalculatorInstance();
        Boolean go = false;
        Boolean go2 = false;
        String operacion ="";
        Factory<String> gen = new Factory<String>();
        Scanner scanner = new Scanner(System.in);
        AbstractStack<String> stack2 = null;
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
                       stack2 = gen.SetType("Vector");
                       go2 = true;
                   } break;
                   case 3:{
                       System.out.println(menu3);
                       String op2 = scanner.nextLine();
                       switch (Integer.parseInt(op2)){
                           case 1:{
                               //Implementación de una lista simplemente encadenada

                               stack2 = new ListStack<String>("SL");
                               go2 = true;
                           } break;
                           case 2:{
                               //Implementación de una lista doblemente encadenada
                               stack2 = new ListStack<String>("DL");
                               go2 = true;
                           } break;
                           case 3:{
                               //Implementaci&oacute;n de la lista circular
                               stack2 = new ListStack<String>("CL");
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
       if (go2) {
           try {
               String num1;
               String num2;
               double d1;
               double d2;
               for (int i = 0; i < operacion.length(); i++)
                   switch (operacion.charAt(i)) {
                       case '+': {
                           //Sacamos los datos y los sumamos y el resultado lo volvemos a meter
                           num1 = stack2.pop();
                           d1 = Double.parseDouble(num1);
                           num2 = stack2.pop();
                           d2 = Double.parseDouble(num2);
                           stack2.push(String.valueOf(calculator.sumar(d1,d2)));
                       }
                       break;
                       case '-': {
                           //Sacamos los datos y los restamos y el resultado lo volvemos a meter
                           num1 = stack2.pop();
                           d1 = Double.parseDouble(num1);
                           num2 = stack2.pop();
                           d2 = Double.parseDouble(num2);
                           stack2.push(String.valueOf(calculator.restar(d1,d2)));
                       }
                       break;
                       case '*': {
                           //Sacamos los datos y los multiplicamos y el resultado lo volvemos a meter
                           num1 = stack2.pop();
                           d1 = Double.parseDouble(num1);
                           num2 = stack2.pop();
                           d2 = Double.parseDouble(num2);
                           stack2.push(String.valueOf(calculator.multiplicacion(d1,d2)));
                           
                       }
                       break;
                       case '/': {
                           //Sacamos los datos y los dividimos y el resultado lo volvemos a meter
                           num1 = stack2.pop();
                           d1 = Double.parseDouble(num1);
                           num2 = stack2.pop();
                           d2 = Double.parseDouble(num2);
                           stack2.push(String.valueOf(calculator.division(d1,d2)));
                       }
                       break;
                       default: {
                           //Metemos el número
                           stack2.push(Character.toString(operacion.charAt(i)));
                       }
                   }
               //Imprimimos el resultado
               System.out.println("El resulltado es: "+ stack2.pop());
           } catch (Exception e) {
               e.printStackTrace();
           }
       }

    }
