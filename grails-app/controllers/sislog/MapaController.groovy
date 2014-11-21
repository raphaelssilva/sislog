package sislog

import grails.converters.JSON;

class MapaController {
	static scaffold = true
	def jmsService
	
	def importar = {
		jmsService.send(queue: "processadorMapa", params.texto, "standard", null)
		
		render "ok"
	}	
	
	def listar = {
		def mapas = Mapa.list()
		
		render mapas.rotas as JSON
	}
	
	def localidades = {
		def mapa	
	}
}
