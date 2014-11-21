package sislog

import java.nio.MappedByteBuffer;

class Rota {	
	Double kilometragem
	
	static belongsTo = [mapa:Mapa, origem:Localidade,destino:Localidade]	
	
    static constraints = {
		origem nullable:false
		destino nullable:false
		kilometragem nullable:false		
    }
}
