	public class Triangulo extends Poligonos {
		private int l1;
		private int l2;
		private int l3;

		public Triangulo(int l1, int l2, int l3) {
			this.l1 = l1;
			this.l2 = l2;
			this.l3 = l3;
		}

		@Override
		public String getTipo() {
			String retorno = "Valores invalidos para um triângulo";
			if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
				if (l1 == l2 && l2 == l3) {
					retorno = "O triângulo é Equilátero.";
				} else if (l1 == l2 || l1 == l3 || l2 == l3) {
					retorno = "O triângulo é Isósceles.";
				} else {
					retorno = "O triângulo é Escaleno.";
				}
			}
			return retorno;
		}

		public int getL1() {
			return this.l1;
		}

		public int getL2() {
			return this.l2;
		}

		public int getL3() {
			return this.l3;
		}

		@Override
		public String toString() {
			return "Lado1 =" + this.getL1() + ", Lado2 =" + this.getL2() + ", Lado3 =" + this.getL3();
		}

	}


