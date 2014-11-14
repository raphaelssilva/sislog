package sislog

import java.nio.MappedByteBuffer;

class Rota {	
	Localidade origem
	
	Localidade destino
	
	Double kilometragem
	
	static belongsTo = [mapa:Mapa]	
	
    static constraints = {
		origem nullable:false
		destino nullable:false
		kilometragem nullable:false		
    }
}
