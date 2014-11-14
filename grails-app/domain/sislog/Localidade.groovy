package sislog

class Localidade {

	String nome;

	static hasMany = [rotasDestino: Rota, rotasOrigem:Rota]
	
	static mappedBy = [rotasDestino:"destino", rotasOrigem:'origem']
	
	static constraints = { nome unique:true }
}
