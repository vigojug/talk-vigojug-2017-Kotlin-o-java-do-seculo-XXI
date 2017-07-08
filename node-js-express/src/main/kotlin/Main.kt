external fun require(module:String):dynamic

fun main(args: Array<String>) {
    val express = require("express")
    val app = express()

    app.get("/", {req, res ->
        res.send("Hello World!")
    })

    app.get("/ping", {req, res ->
        res.send("pong " + req.query.ping)
    })

    app.listen(3000, {
        println("Hello Express")
    })
}