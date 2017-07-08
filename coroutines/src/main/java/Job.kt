import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.*

fun createJob() : Job {
    return launch(CommonPool) {
        Thread.sleep(1000)
        var r = Random().nextInt()
        println("Finished $r")
    }
}

fun main(args: Array<String>) {
    runBlocking {
        for (i in 1..5) {
            createJob()
        }
        createJob().join()
    }
}