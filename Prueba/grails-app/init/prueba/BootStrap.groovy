package prueba

class BootStrap {

    def init = { servletContext ->
    	new Ship(nombre: 'Titanic',  capacidad: 3200, tipo: "Turistico").save()
    	new Ship(nombre: 'Air Company',  capacidad: 200, tipo: "Comercial").save()
    	new Ship(nombre: 'USS Arizona',  capacidad: 5000, tipo: "Guerra").save()
    }
    def destroy = {
    }
}
