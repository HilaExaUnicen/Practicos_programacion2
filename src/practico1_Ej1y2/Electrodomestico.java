package practico1_Ej1y2;

public class Electrodomestico {
		 
		 private String nombre;
		 private float precioBase;
		 private String color;
		 private float consumoEnergetico;
		 private int peso;
		 
		 public Electrodomestico(String nombre){
			 color = "Gris plata";
			 consumoEnergetico = 400;
			 precioBase = 100;
			 peso = 2;
		 }
		 
		public float calcularBalance() {
			float balance = (precioBase/peso);
			return balance;
		}
		 
		public boolean esBajoConsumo(){
			if (consumoEnergetico < 45) {
				return true;
			}
			else {
				return false;
			}
		}
		
		public boolean esAltaGama() {
			float balance = this.calcularBalance();
			
			if(balance > 3) {
				return true;
			}
			else {
				return false;
			}
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public float getPrecioBase() {
			return precioBase;
		}

		public void setPrecioBase(float precioBase) {
			this.precioBase = precioBase;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public float getConsumoEnergetico() {
			return consumoEnergetico;
		}

		public void setConsumoEnergetico(float consumoEnergetico) {
			this.consumoEnergetico = consumoEnergetico;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}
}
