package com.palash.messagechatwithfirebase

class Message {
    var message : String? = null
    var senderId : String? = null

    constructor(){}
    constructor(message: String, sendid : String){
        this.message = message
        this.senderId = senderId
    }
}