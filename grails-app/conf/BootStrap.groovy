import com.tenpines.example.GestionDeNegociacion
import com.tenpines.example.User

class BootStrap {

    def init = { servletContext ->
        new User(email:"eg@eg.com",password:"pas").save(failOnError: true)
        new GestionDeNegociacion(proveedorName: "10Pines", esSolicitudDeAumento: true,fecha: new Date(), precio: 10).save(failOnError: true)
    }
    def destroy = {
    }
}
