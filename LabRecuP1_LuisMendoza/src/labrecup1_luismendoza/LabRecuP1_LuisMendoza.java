/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labrecup1_luismendoza;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LabRecuP1_LuisMendoza {

    public static int Random(){
        
        int random1 = new Random().nextInt((10 - 1)+1)+1;
        int lucky1 = random1; 
        
        return lucky1;
    }
    
    public static char [][] TableroMatrix(){
        
        char [][] tablero = new char [9][9];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = ' ';

            }
        }
        
        tablero [0][3] = '*';
        tablero [0][4] = '*';
        tablero [0][5] = '*';
        tablero [1][4] = '*';
        tablero [2][4] = '+';
        tablero [3][4] = '+';
        tablero [4][4] = 'R';
        tablero [5][4] = '+';
        tablero [6][4] = '+';
        tablero [7][4] = '*';
        tablero [8][4] = '*';
        tablero [8][3] = '*';
        tablero [8][5] = '*';
        
        tablero [3][0] = '*';
        tablero [4][0] = '*';
        tablero [5][0] = '*';
        tablero [4][1] = '*';
        tablero [4][2] = '+';
        tablero [4][3] = '+';
        tablero [4][5] = '+';
        tablero [4][6] = '+';
        tablero [4][7] = '*';
        tablero [4][8] = '*';
        tablero [3][8] = '*';
        tablero [5][8] = '*';
        
        
        
        
        return tablero;
    }
    
    public static void ImprimirMatrix1(char [][] matrix){
            
            for (int i = 0; i < matrix.length; i++) { //Fila
            for (int j = 0; j < matrix[i].length; j++) { //Columna
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void Menu(){
        
        Scanner entrada = new Scanner(System.in);
            int v = 0;

            do {
                System.out.println("Bienvenido al Laboratorio de Recuperación ");
                System.out.println("Ingrese una de las siguientes opciones: ");
                System.out.println("1. Ejercicio #1 , 2. Ejercicio #2, 3. Salir");
                int opcionUsuario = entrada.nextInt();

                switch (opcionUsuario) {

                    case 1:

                        Ejercicio1();

                        break;

                    case 2:
                        
                        Ejercicio2();
                        
                        break;

                    case 3:
                        
                        System.out.println("Bye Bye!");
                        v++;
                        
                        break;


                    default:
                        System.out.println("Opción no valida");
                        break;
                }

            } while (v != 1);
       
       
    
        
        
        
    }
    
    public static void Ejercicio1(){
                
        Scanner entrada = new Scanner(System.in);
        
        int n1 = 0;
        int fila1;
        int columna1;
        int fila2;
        int columna2;
        
        char R;
        
        
        ImprimirMatrix1(TableroMatrix());
        System.out.println("********************************");
        
        char[][] game = TableroMatrix();
        
        int random = Random();
        
        if (random == 0 || random == 2 || random == 4 || random == 6 || random == 8 || random == 10 ){
            
            while(n1 != 1){
            
            System.out.println("Inician las negras -> * ");
            
            while(true){
                System.out.println("Ingrese la posición de la pieza que desea mover: ");
                System.out.println("Primero la fila y luego la columna");
                fila1 = entrada.nextInt();
                columna1 = entrada.nextInt();
                
                if(columna1 > 8 || fila1 > 8){
                    System.out.println("Esa posición no existe en el tablero");                       
                } else if(game[fila1][columna1] == '+' || game[fila1][columna1] == ' ' || game[fila1][columna1] == 'R'){
                    System.out.println("Pieza seleccionada no valida o espacio vacio no valido");
                } else{
                    game[fila1][columna1] = ' ';
                    break;
                }
            }
            
            while(true){
                System.out.println("Ingrese la posición a donde desea mover la pieza: ");
                System.out.println("Primero la fila y luego la columna");
                fila2 = entrada.nextInt();
                columna2 = entrada.nextInt();
                
                if(fila2 > 8 || columna2 > 8){
                    System.out.println("Esa posición no existe en el tablero");                  
                } else if(fila2 == 4 && columna2 == 4){
                    System.out.println("No se puede mover al trono del rey");
                } else if(game[fila2][columna2] == '*' ||game[fila2][columna2] == '+' || game[fila2][columna2] == 'R'){
                    System.out.println("No se puede mover a esa posición porqué ya hay una pieza ahí");                   
                } else if(fila2 != fila1 && columna2 != columna1){
                    System.out.println("No son validos los movimientos diagonales");
                }
                else{
                    game[fila2][columna2] = '*';
                    break;
                }
                
            }
            
            if(columna2 == columna1 && fila2 > fila1){
                for (int i = fila1; i < fila2; i++) {
                   char x = game[i][columna2];
                   if(x == '+'){
                       game[i][columna2] = ' ';
                   }
                }
            } else if(columna2 == columna1 && fila1 > fila2){
                for (int i = fila1; i >= fila2; i--) {
                   char x = game[i][columna2];
                   if(x == '+'){
                       game[i][columna2] = ' ';
                   }
                 } 
                    
            }  else if(fila2 == fila1 && columna2 > columna1) {
                for (int i = columna1; i < columna2; i++) {
                   char x = game[fila2][i];
                   if(x == '+'){
                       game[fila2][i] = ' ';
                   }
                }
                
            } else if(fila2 == fila1 && columna1 > columna2){
                for (int i = columna1; i >= columna2; i--) {
                   char x = game[fila2][i];
                   if(x == '+'){
                       game[fila2][i] = ' ';
                   }
                }
            }
                    

            ImprimirMatrix1(game);
            
            System.out.println("******************************************");
            System.out.println("Ahora van las blancas -> + ");
            
            while(true){
                System.out.println("Ingrese la posición de la pieza que desea mover: ");
                System.out.println("Primero la fila y luego la columna");
                fila1 = entrada.nextInt();
                columna1 = entrada.nextInt();
                
                if(columna1 > 8 || fila1 > 8){
                    System.out.println("Esa posición no existe en el tablero");                       
                } else if(game[fila1][columna1] == '*' || game[fila1][columna1] == ' '){
                    System.out.println("Pieza seleccionada no valida o espacio vacio no valido");
                } else{
                    
                    if(game[fila1][columna1] == 'R' ){
                        R = 'R';
                    } else {
                        R = ' ';
                    }
                    
                    game[fila1][columna1] = ' ';
                    break;
                }
            }
            
            while(true){
                System.out.println("Ingrese la posición a donde desea mover la pieza: ");
                System.out.println("Primero la fila y luego la columna");
                fila2 = entrada.nextInt();
                columna2 = entrada.nextInt();
                
                if(fila2 > 8 || columna2 > 8){
                    System.out.println("Esa posición no existe en el tablero");                  
                } else if(fila2 == 4 && columna2 == 4){
                    System.out.println("No se puede mover al trono del rey");
                } else if(game[fila2][columna2] == '*' ||game[fila2][columna2] == '+' || game[fila2][columna2] == 'R'){
                    System.out.println("No se puede mover a esa posición porqué ya hay una pieza ahí");                   
                } else if(fila2 != fila1 && columna2 != columna1){
                    System.out.println("No son validos los movimientos diagonales");
                }
                else{
                    
                    if(R == 'R'){
                        game[fila2][columna2] = 'R';
                    } else{
                    
                        game[fila2][columna2] = '+';
                    }
                    break;
                }
                
            }
            
            if(columna2 == columna1 && fila2 > fila1){
               for (int i = fila1; i < fila2; i++) {
                   char x = game[i][columna2];
                   if(x == '*'){
                       game[i][columna2] = ' ';
                   }
                }
            } else if(columna2 == columna1 && fila1 > fila2){
                for (int i = fila1; i >= fila2; i--) {
                   char x = game[i][columna2];
                   if(x == '*'){
                       game[i][columna2] = ' ';
                   }
                 } 
                    
            }  else if(fila2 == fila1 && columna2 > columna1) {
                for (int i = columna1; i < columna2; i++) {
                   char x = game[fila2][i];
                   if(x == '*'){
                       game[fila2][i] = ' ';
                   }
                }
                
            } else if(fila2 == fila1 && columna1 > columna2){
                for (int i = columna1; i >= columna2; i--) {
                   char x = game[fila2][i];
                   if(x == '*'){
                       game[fila2][i] = ' ';
                   }
                }
            }
                    

            ImprimirMatrix1(game);
            
            for (int i = 0; i < 8; i++) {
                char x = game [0][i];
                char y = game [8][i];
                
                char x1 = game[i][0];
                char y1 = game[i][8];
                
                if(x == 'R' || x1 == 'R'|| y == 'R' || y1 == 'R'){
                    System.out.println("Las blancas ganan");
                    n1 = 1;
                }
            }
            
            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if(game[i][j] == 'R'){
                        if(i != 8 && j != 8 && game[i+1][j] == '*' && game[i-1][j] == '*' && game[i][j+1] == '*' && game[i][j-1]=='*' ){
                            System.out.println("Las negras ganan");
                            n1 = 1;
                        }
                    }
                }
            }
            
          }
            
            
        } else{
            
            while(n1 != 1){
            
            System.out.println("Inician las blancas -- +/R ");
            
            while(true){
                System.out.println("Ingrese la posición de la pieza que desea mover: ");
                System.out.println("Primero la fila y luego la columna");
                fila1 = entrada.nextInt();
                columna1 = entrada.nextInt();
                
                if(columna1 > 8 || fila1 > 8){
                    System.out.println("Esa posición no existe en el tablero");                       
                } else if(game[fila1][columna1] == '*' || game[fila1][columna1] == ' '){
                    System.out.println("Pieza seleccionada no valida o espacio vacio no valido");
                } else{
                    
                    if(game[fila1][columna1] == 'R' ){
                        R = 'R';
                    } else {
                        R = ' ';
                    }
                    
                    game[fila1][columna1] = ' ';
                    break;
                }
            }
            
            while(true){
                System.out.println("Ingrese la posición a donde desea mover la pieza: ");
                System.out.println("Primero la fila y luego la columna");
                fila2 = entrada.nextInt();
                columna2 = entrada.nextInt();
                
                if(fila2 > 8 || columna2 > 8){
                    System.out.println("Esa posición no existe en el tablero");                  
                } else if(fila2 == 4 && columna2 == 4){
                    System.out.println("No se puede mover al trono del rey");
                } else if(game[fila2][columna2] == '*' ||game[fila2][columna2] == '+' || game[fila2][columna2] == 'R'){
                    System.out.println("No se puede mover a esa posición porqué ya hay una pieza ahí");                   
                } else if(fila2 != fila1 && columna2 != columna1){
                    System.out.println("No son validos los movimientos diagonales");
                }
                else{
                    if(R == 'R'){
                        game[fila2][columna2] = 'R';
                    } else{
                    
                        game[fila2][columna2] = '+';
                    }
                    break;
                }
                
            }
            
            if(columna2 == columna1 && fila2 > fila1){
               for (int i = fila1; i < fila2; i++) {
                   char x = game[i][columna2];
                   if(x == '*'){
                       game[i][columna2] = ' ';
                   }
                }
            } else if(columna2 == columna1 && fila1 > fila2){
                for (int i = fila1; i >= fila2; i--) {
                   char x = game[i][columna2];
                   if(x == '*'){
                       game[i][columna2] = ' ';
                   }
                 } 
                    
            }  else if(fila2 == fila1 && columna2 > columna1) {
                for (int i = columna1; i < columna2; i++) {
                   char x = game[fila2][i];
                   if(x == '*'){
                       game[fila2][i] = ' ';
                   }
                }
                
            } else if(fila2 == fila1 && columna1 > columna2){
                for (int i = columna1; i >= columna2; i--) {
                   char x = game[fila2][i];
                   if(x == '*'){
                       game[fila2][i] = ' ';
                   }
                }
            }
                    

            ImprimirMatrix1(game);
            
            System.out.println("************************************************");
            
            System.out.println("Ahora van las negras -> *");
            while(true){
                System.out.println("Ingrese la posición de la pieza que desea mover: ");
                System.out.println("Primero la fila y luego la columna");
                fila1 = entrada.nextInt();
                columna1 = entrada.nextInt();
                
                if(columna1 > 8 || fila1 > 8){
                    System.out.println("Esa posición no existe en el tablero");                       
                } else if(game[fila1][columna1] == '+' || game[fila1][columna1] == ' ' || game[fila1][columna1] == 'R'){
                    System.out.println("Pieza seleccionada no valida o espacio vacio no valido");
                } else{
                    game[fila1][columna1] = ' ';
                    break;
                }
            }
            
            while(true){
                System.out.println("Ingrese la posición a donde desea mover la pieza: ");
                System.out.println("Primero la fila y luego la columna");
                fila2 = entrada.nextInt();
                columna2 = entrada.nextInt();
                
                if(fila2 > 8 || columna2 > 8){
                    System.out.println("Esa posición no existe en el tablero");                  
                } else if(fila2 == 4 && columna2 == 4){
                    System.out.println("No se puede mover al trono del rey");
                } else if(game[fila2][columna2] == '*' ||game[fila2][columna2] == '+' || game[fila2][columna2] == 'R'){
                    System.out.println("No se puede mover a esa posición porqué ya hay una pieza ahí");                   
                } else if(fila2 != fila1 && columna2 != columna1){
                    System.out.println("No son validos los movimientos diagonales");
                }
                else{
                    game[fila2][columna2] = '*';
                    break;
                }
                
            }
            
            if(columna2 == columna1 && fila2 > fila1){
                for (int i = fila1; i < fila2; i++) {
                   char x = game[i][columna2];
                   if(x == '+'){
                       game[i][columna2] = ' ';
                   }
                }
            } else if(columna2 == columna1 && fila1 > fila2){
                for (int i = fila1; i >= fila2; i--) {
                   char x = game[i][columna2];
                   if(x == '+'){
                       game[i][columna2] = ' ';
                   }
                 } 
                    
            }  else if(fila2 == fila1 && columna2 > columna1) {
                for (int i = columna1; i < columna2; i++) {
                   char x = game[fila2][i];
                   if(x == '+'){
                       game[fila2][i] = ' ';
                   }
                }
                
            } else if(fila2 == fila1 && columna1 > columna2){
                for (int i = columna1; i >= columna2; i--) {
                   char x = game[fila2][i];
                   if(x == '+'){
                       game[fila2][i] = ' ';
                   }
                }
            }
                    

            ImprimirMatrix1(game);
            
                        for (int i = 0; i < 8; i++) {
                char x = game [0][i];
                char y = game [8][i];
                
                char x1 = game[i][0];
                char y1 = game[i][8];
                
                if(x == 'R' || x1 == 'R'|| y == 'R' || y1 == 'R'){
                    System.out.println("Las blancas ganan");
                    n1 = 1;
                }
            }
            
            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if(game[i][j] == 'R'){
                        if(i != 8 && j != 8 && game[i+1][j] == '*' && game[i-1][j] == '*' && game[i][j+1] == '*' && game[i][j-1]=='*' ){
                            System.out.println("Las negras ganan");
                            n1 = 1;
                        }
                    }
                }
            }
            
          }
            
        }
    }
    
    public static void Ejercicio2(){
                
        Scanner entrada = new Scanner(System.in);

        int n = 0;

        ArrayList<Carro> carros = new ArrayList();

        do {

            System.out.println("---Menú Hermanos Rodriguez---");
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("1. Ingresar un carro");
            System.out.println("2. Modificar un carro");
            System.out.println("3. Leer la lista de carros");
            System.out.println("4. Eliminar un carro");
            System.out.println("5. Salir");

            int opcionUsuario = entrada.nextInt();

            switch (opcionUsuario) {

                case 1:

                    System.out.println("Ingrese el VIN del vehiculo: ");
                    String VIN = entrada.next();
                    VIN += entrada.nextLine();

                    System.out.println("Ingrese la marca del vehiculo: ");
                    String marca = entrada.next();
                    marca += entrada.nextLine();

                    System.out.println("Ingrese el modelo del vehiculo: ");
                    String modelo = entrada.next();
                    modelo += entrada.nextLine();

                    System.out.println("Ingrese el color del vehiculo: ");
                    String color = entrada.next();
                    color += entrada.nextLine();

                    System.out.println("Ingrese el año del vehiculo: ");
                    int year = entrada.nextInt();

                    Carro carro = new Carro(VIN, marca, modelo, color, year);

                    carros.add(carro);

                    break;

                case 2:

                    if (carros.size() == 0) {
                        System.out.println(" -> Aun no se han agregado elementos");
                    } else {
                        for (int i = 0; i < carros.size(); i++) {
                            int k = 1;
                            System.out.println(k + "-> " + carros.get(i));
                            k++;
                        }

                        System.out.println("Elija el carro que desea modificar: ");
                        int opcionModificar = entrada.nextInt();

                        System.out.println("Ingrese la nueva marca: ");
                        carros.get(opcionModificar - 1).marca = entrada.next();

                        System.out.println("Ingrese el nuevo modelo: ");
                        carros.get(opcionModificar - 1).modelo = entrada.next();

                        System.out.println("Ingrese el nuevo color: ");
                        carros.get(opcionModificar - 1).color = entrada.next();

                        System.out.println("Ingrese el nuevo año: ");
                        carros.get(opcionModificar - 1).year = entrada.nextInt();

                        System.out.println("Modificación exitosa");

                    }

                    break;

                case 3:

                    if (carros.size() == 0) {
                        System.out.println(" -> Aun no se han agregado elementos");
                    } else {
                        for (int i = 0; i < carros.size(); i++) {
                            int k = 1;
                            System.out.println(k + " -> " + carros.get(i));
                            k++;
                        }
                    }

                    break;

                case 4:

                    if (carros.size() == 0) {
                        System.out.println(" -> Aun no se han agregado elementos");
                    } else {

                        for (int i = 0; i < carros.size(); i++) {
                            int k = 1;
                            System.out.println(k + "-> " + carros.get(i));
                            k++;
                        }

                        System.out.println("Elija el carro que desea eliminar: ");
                        int opcionEliminar = entrada.nextInt();

                        carros.remove(opcionEliminar - 1);

                        System.out.println("Eliminación exitosa");
                    }

                    break;

                case 5:
                    System.out.println("Adiós");
                    n++;
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;

            }

        } while (n != 1);
        
    }
  
    public static void main(String[] args) {
        
        Menu();
        
    }
    
}
