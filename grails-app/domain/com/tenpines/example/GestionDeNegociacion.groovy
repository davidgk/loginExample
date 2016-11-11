package com.tenpines.example

import groovy.transform.ToString

@ToString
class GestionDeNegociacion {

    String proveedorName
    String precio
    Boolean esSolicitudDeAumento
    Date fecha

    static constraints = {
    }


}
