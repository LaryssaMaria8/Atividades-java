/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seguro;
import java.util.Scanner;
/**
 *
 * @author Laryssa
 */
public class Seguro {

    public static void main(String[] args) {
        System.out.println("Selecione seu tipo de veículo: ");
        System.out.println(" Carro\n Ônibus\n Caminhão\n Moto");
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int premium = 0;
        switch(type){
        
            case "Carro":
                premium = 2000;
                break;
            case "Ônibus":
                premium = 3000;
                break;
            case "Caminhão":
                premium = 4000;
                break;
            case "Moto":
            
            System.out.println("Selecione o tipo da sua moto:\n 1-Baixa potência\n 2-Alta potência\n 3-Média potência");
            String tipoMoto = scan.nextLine();
            int motoInt = Integer.parseInt(tipoMoto);
            switch(motoInt){
            
                case 1:
                    
                    premium = 1000;
                        break;
                case 2:
                 premium = 1500; 
                        break;
                        
                case 3:
                 premium = 2000;   
                    break;
                default: 
                System.out.println("Veículo desconhecido");
            }
            break;
            default:
                System.out.println("Tipo de veículo não registrado");
        }
        scan.close();
        System.out.println("O valor do seguro do seu veículo é: R$"+premium);
    }
}
