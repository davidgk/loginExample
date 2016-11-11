package com.tenpines.example

class LoginController {

    def index() {
        render doLogin();
    }

    def login ={

    }

    def doLogin = {
        def user = User.findWhere(email:params['email'],
                password:params['password'])
        session.user = user
        if (user)
            redirect(controller:'gestionDeNegociacion',action:'list')
        else
            redirect(controller:'login',action:'login')
    }
}
