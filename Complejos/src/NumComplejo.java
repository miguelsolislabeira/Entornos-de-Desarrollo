/**
 * 
 * @author miguel
 * version 28.05.2019
 */
        
public class NumComplejo {
	private double pReal;
	private double pImaginaria;

           /**
            * Constructor vacío
            */
	public NumComplejo(){

	}
        /**
         * Constructor que recibe dos parámetros de tipo double
         * @param pReal
         * @param pImaginaria 
         */
	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}
        
        /**
         * Método getter
         * @return pReal: posicion real
         */
	public double getpReal() {
		return pReal;
	}
        
        /**
         * Método setter.
         * @param pReal: Espera un parámetro de tipo double
         */
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}

        /**
         * Método getter
         * @return pImaginaria: posicion imaginaria
         */
	public double getpImaginaria() {
		return pImaginaria;
	}
        
        /**
         * Metodo setter
         * @param pImaginaria: Espera un parámetro de tipo double
         */
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}

	/**
         * Metodo que calcula la suma de dos numeros complejos
         * @param c1: número 1. Espera un objeto de tipo NumComplejo
         * @param c2: Número 2  Espera un objeto de tipo NumComplejo
         * @return result: Devuelve un objeto de tipo número complejo resultado de la suma de los dos parámetros
         */
	public static NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());

		return result;
	}

        /**
         * Método que calcula la resta de dos números complejos
         * @param c1: número 1 Espera un objeto de tipo NumComplejo
         * @param c2: número 2 Espera un objeto de tipo NumComplejo
         * @return result: Devuelve un objeto de tipo número complejo resultado de la resta de los dos parámetros
         */
	public static NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());

		return result;
	}

        /**
         * Método que calcula el producto de dos números complejos
         * @param c1: Número 1 Espera un objeto de tipo NumComplejo
         * @param c2: Número 2 Espera un objeto de tipo NumComplejo
         * @return result: Devuelve un objeto de tipo número complejo resultado del producto de los dos parámetros
         */
	public static NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));

		return result;
	}

        /**
         * Método que calcula la división entre dos números complejos
         * @param c1
         * @param c2
         * @return result: Devuelve un objeto de tipo número complejo resultado de la división de los dos parámetros
         */
	public  static NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();

		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();

		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));

		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);

		return result;
	}
        
        /**
         * Método que calcula el módulo de la división entre dos números complejos
         * @param numComplejo
         * @return. Devuelve raiz cuadrada de la suma de la posición real y la imaginaria elevadas al cuadrado
         */
	public static double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();

		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}
        
        /**
         * Método toString
         * @return mostrar: Imprime por pantalla la posición real y la imaginaria.
         */
	@Override
	public String toString(){
		
		String mostrar="";
		if (pReal!=0){
			mostrar+=pReal;
		}
		if (pImaginaria>=0){
			mostrar=mostrar+"+"+pImaginaria+"i";
		}else {
			mostrar=mostrar+"-"+(pImaginaria*(-1))+"i";
		}
		return mostrar;
	}
}
