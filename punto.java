package primerasclases;

public class punto {
	   private int coordX;
	   private int coordY;

	   public punto(int nuevoCoordX,int nuevoCoordY){
	       coordX=nuevoCoordX;
	       coordY=nuevoCoordY;
	   }

	   double devuelveDistanciaOrigen(){
	       double distancia;
	       distancia=Math.sqrt(coordX*coordX+coordY*coordY);
	       return(distancia);
	      
	   }

	   void setCoordenadas(int nuevoCoordX, int nuevoCoordY) {
	    coordX=nuevoCoordX;
	    coordY=nuevoCoordY;
	}

	   public int getCoordX() {
	       return coordX;
	   }

	   public void setCoordX(int coordX) {
	       this.coordX = coordX;
	   }

	   public int getCoordY() {
	       return coordY;
	   }

	   public void setCoordY(int coordY) {
	       this.coordY = coordY;
	   }


	}
