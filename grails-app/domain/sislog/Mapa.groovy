package sislog

class Mapa {

	String nome
	
	String descricao
	
	static hasMany = [rotas:Rota]
	
	static mappedBy = [rotas:"mapa"]
	
    static constraints = {
		nome nullable:false
    }
}
