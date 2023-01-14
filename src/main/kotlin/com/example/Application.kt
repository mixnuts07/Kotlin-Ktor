package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main(args:Array<String>){
    print("Average Finger V0.1")
    val avg = findAverage(args)
    print("The Average is $avg")
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()
}

fun findAverage(input:Array<String>):Double{
    var result = 0.0
    for(s in input){
        result += s.toDouble()
    }
    return result / input.size
}