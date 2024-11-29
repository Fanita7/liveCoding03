package liveCoding03;

public class MangosNaranjas {
	
	    private int mangos;
	    private int naranjas;

	    // Constructor
	    public MangosNaranjas(int mangos, int naranjas) { // constructor
	        this.mangos = mangos;
	        this.naranjas = naranjas;
	    }

	    
	    private int calcularMCD(int a, int b) { // calcular el máximo común divisor 
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    ////////////////////////
	    
	    // Método para imprimir el resultado
	    public void imprimir() {
	        int mcd = calcularMCD(mangos, naranjas); // Calculamos el MCD
	        int cajas = mcd;
	        int mangosPorCaja = mangos / cajas;
	        int naranjasPorCaja = naranjas / cajas;

	        System.out.println("El número de cajas es: " + cajas);
	        System.out.println("El número de mangos por caja es: " + mangosPorCaja);
	        System.out.println("El número de naranjas por caja es: " + naranjasPorCaja);
	    }
}
