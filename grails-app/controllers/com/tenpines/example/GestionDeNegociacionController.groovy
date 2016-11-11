package com.tenpines.example
/*
* but in brief, the ‘def scaffold = true’ in a Controller gives us CRUD, in the
form of index, list, show, create, edit, delete, save and update methods,
* */
class GestionDeNegociacionController {

    def beforeInterceptor = [action:this.&checkUser,except:
            ['index','list','show']]
    def scaffold = true

    def checkUser() {
        if(!session.user) {
// i.e. login not logged in
            redirect(controller:'login',action:'login')
            return false
        }
    }

    def list = {
        def negociaciones = GestionDeNegociacion.findAll()
        [negociaciones:negociaciones]
    }
}
