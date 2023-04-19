package geminus;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		caso1();
		caso2();
		caso3();
	}

	   public static void caso1() {
		   System.out.println("*********** Caso 1 ******************");
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        double SGR = 1590d;

	        int resultadoMultiplicacion;
	        if (numero % 2 == 0) {
	            resultadoMultiplicacion = numero * 10;
	        } else {
	            resultadoMultiplicacion = numero * 3;
	        }

	        double resultadoDivision = SGR / resultadoMultiplicacion;

	        System.out.println("El resultado es: " + resultadoDivision);
	    }
	    
	    public static void caso2() {
	    	System.out.println("*********** Caso 2 ******************");
	        int[] numeros = {1, 23, 5, 80, 2, 53, 8, 75, 23, 75, 80, 23, 2, 1, 8};

	        int numeroUnico = buscarNumeroUnico(numeros);

	        System.out.println("El número menor con una única ocurrencia es: " + numeroUnico);
	    
	    }
	    
	    public static void caso3() {
	    	System.out.println("*********** Caso 3 ******************");
	        ArrayList<Integer> jaulas = new ArrayList<>();
	        for (int i = 101; i <= 120; i++) {
	          jaulas.add(i);
	        }

	        ArrayList<ArrayList<Integer>> grupos = new ArrayList<>();

	        Random random = new Random();

	        for (int i = 0; i < 60; i++) {
	          ArrayList<Integer> grupo = new ArrayList<>();

	          while (grupo.size() < 4) {
	            int jaula = jaulas.get(random.nextInt(jaulas.size()));

	            if (!grupo.contains(jaula)) {
	              grupo.add(jaula);
	            }
	          }
	          grupos.add(grupo);
	        }

	        for (int i = 0; i < grupos.size(); i++) {
	          System.out.printf("Grupo %d: %s\n", i + 1, grupos.get(i));
	        }
	    }
	    
	    public static int buscarNumeroUnico(int[] numeros) {
	        int numeroUnico = -1;

	        for (int i = 0; i < numeros.length; i++) {
	            int numeroActual = numeros[i];
	            boolean esUnico = true;

	            for (int j = 0; j < numeros.length; j++) {
	                if (i != j && numeros[j] == numeroActual) {
	                    esUnico = false;
	                    break;
	                }
	            }

	            if (esUnico && (numeroUnico == -1 || numeroActual < numeroUnico)) {
	                numeroUnico = numeroActual;
	            }
	        }

	        return numeroUnico;
	    }
}
