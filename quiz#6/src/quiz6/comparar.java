package quiz6;

public class comparar implements Comparable<comparar> {
	
	String nombre;
	int juegos;
    int puntos;
 
    public comparar(String nombre, int juegos, int puntos) {
        this.nombre = nombre;
    	this.juegos = juegos;
        this.puntos = puntos;
    }

	public int getJuegos() {
		return juegos;
	}

	public int getPuntos() {
		return puntos;
	}
	
	public String toString() {
        return "(" + nombre + ": " + juegos + ", " + puntos + ")";
    }
	
	@Override 
    public int compareTo(comparar i) {	
		if (this.getJuegos() != i.getJuegos()) {
    
			if(this.getJuegos() == i.getJuegos()) 
				return 0;
	    	
	    	if(this.getJuegos() > i.getJuegos()) 
	    		return 1;
	    	
	    	else 
	    		return -1;
        }
    
    	else {
    		if(this.getPuntos() == i.getPuntos()) 
				return 0;
	    	
	    	if(this.getPuntos() < i.getPuntos()) 
	    		return 1;
	    	
	    	else 
	    		return -1;
    	}
    }
}
