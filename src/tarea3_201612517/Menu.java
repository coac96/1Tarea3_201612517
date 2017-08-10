/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201612517;
import java.util.Scanner;
/**
 *
 * @author Coac_96
 */
public class Menu {
    Usuarios us = new Usuarios();
    PalabraPalindroma paP = new PalabraPalindroma();
    private int salir = 0;
    private Scanner respuesta = new Scanner(System.in);
    private int eleccion = 0;
    private int eleccionU = 0;
    
    

    public void MenuPrincipal(){
       
        if(eleccionU ==5){
            System.out.println("HASTA PRONTO");
        }else{
            System.out.println("-------------------------------------------");
            System.out.println("          Tarea 3");
            System.out.println("         201612517");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. Salir");
            eleccion = respuesta.nextInt();
                switch(eleccion){
                case 1:
                   MenuUsuarios();
                break;
                case 2:
                    paP.verificacion();
                    MenuPrincipal();
                    break;
                case 3:
                    System.out.println("HASTA PRONTO");
                    break;
                default:
                    System.out.println("MALA ELECCION");
                    break;
            }
        }
            
    }    
   public void MenuUsuarios(){
       eleccionU=0;
       while((eleccionU!=4)){
        System.out.println("---------- Menu de USUARIOS -------------");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar Todos los Usuarios");
        System.out.println("3. Mostrar un Usuario Personalizado");
        System.out.println("4. Menu principal");
        System.out.println("5. Salir");
            eleccionU = respuesta.nextInt();
                    switch(eleccionU){
                        case 1:
                            us.eleccionUno();
                            break;
                        case 2:
                            us.eleccionDos();
                        break;
                        case 3:
                            us.eleccionTres();
                        break;
                        case 4:
                            MenuPrincipal();
                            eleccionU=4;
                        break;
                        case 5:
                            MenuPrincipal();
                            eleccionU=4;
                        break;
                        default:
                            System.out.println("OPCION INCORRECTA");
                        break;
                    }
        }
       
                   
        }
    
   
}


