package sislog

class Mapa {

	String nome
	
	String descricao
	
	static hasMany = [rotas:Rota]
	
	static mappedBy = ["mapa":Rota]
	
    static constraints = {
		nome nullable:false
    }
}
