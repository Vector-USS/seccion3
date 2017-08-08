package prueba

import grails.rest.*

@Resource(uri='/ships', readOnly = false, formats = ['json', 'xml'])
class Ship {
	String  nombre
	Integer capacidad
	String  tipo

    static constraints = { 
    	capacidad min: 20
    	nombre    maxSize: 255
    	tipo      maxSize: 100
    }
}
