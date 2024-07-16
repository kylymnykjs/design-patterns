package creational.singleton.homework

import kotlin.concurrent.Volatile

class Logger {

    fun log(message: String?) {
        println(message)
    }

    companion object {

        @Volatile
        private var loggerInstance: Logger? = null

        fun getInstance(): Logger {
            var result = loggerInstance
            if (result == null) {
                synchronized(Logger::class) {
                    result = loggerInstance
                    if (result == null) {
                        result = Logger()
                        loggerInstance = result
                    }
                }
            }
            return result!!
        }
    }
}
