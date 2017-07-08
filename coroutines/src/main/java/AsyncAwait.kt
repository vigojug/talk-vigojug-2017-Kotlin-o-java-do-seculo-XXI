import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking
import java.util.*

fun createDeferred() : Deferred<Int> {
    return async(CommonPool) {
        Thread.sleep(1000)
        var r = Random().nextInt()
        println("Returning $r")
        r
    }
}

fun main(args: Array<String>) {
    runBlocking {
        for (i in 1..5) {
            createDeferred()
            //println("I received ${createDeferred().await()}")
        }
        createDeferred().await()
    }
}