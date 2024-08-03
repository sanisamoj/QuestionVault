package sanisamoj.com

import example.com.plugins.*
import io.ktor.server.application.*
import sanisamoj.com.plugins.configureHTTP
import sanisamoj.com.plugins.configureRouting
import sanisamoj.com.plugins.configureSecurity
import sanisamoj.com.plugins.configureSerialization

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureHTTP()
    configureSecurity()
    configureRouting()
}
