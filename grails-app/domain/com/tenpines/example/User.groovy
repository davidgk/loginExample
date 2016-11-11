package com.tenpines.example

import groovy.transform.ToString

@ToString
class User {
    String email
    String password

    static constraints =
    {
        email(email:true)
        password(blank:false, password:true)
    }
}
