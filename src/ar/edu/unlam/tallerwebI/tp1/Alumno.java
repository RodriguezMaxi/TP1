package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {
		private int primerParcial;
		private int segundoParcial;

		public void calificarPrimerParcial(int nota1P){
			this.primerParcial = nota1P;
		}
		
		public int getPrimerParcial(){
			return this.primerParcial;
		}
		
		public void calificarSegundoParcial(int nota2P){
			this.segundoParcial = nota2P;
		}
		
		public int getSegundoParcial(){
			return this.segundoParcial;
		}
		
		public boolean estaAprobado(){
			if (this.primerParcial>=4 && this.segundoParcial>=4){
				return true;
			}else{
				return false;
			}
		}
		
		public boolean estaPromocionado(){
			
			if (this.primerParcial>=7 && this.segundoParcial>=7){
				return true;
			}else{
				return false;
			}
		}
		
				
		
}
