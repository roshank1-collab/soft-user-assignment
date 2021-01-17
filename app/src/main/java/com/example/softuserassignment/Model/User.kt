package com.example.softuserassignment.Model

class User {

    fun Login(username: String, password: String): Boolean {
        return username.toLowerCase().equals("roshan") &&
                password.toLowerCase().equals("koirala");
    }
}