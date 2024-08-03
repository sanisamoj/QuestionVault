package sanisamoj.com.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {

        staticResources("/", "page") {
            default("index.html")
            preCompressed(CompressedFileType.GZIP)
        }
    }
}
