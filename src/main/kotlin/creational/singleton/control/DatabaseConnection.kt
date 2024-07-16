package com.anastasiia.creational.singleton.control

class DatabaseConnection {

    fun connect() {
        println("Connected to the database")
    }

    fun disconnect() {
        println("Disconnected from the database")
    }

    fun executeQuery(query: String) {
        println("Executing query: ${query}")
    }

    companion object {

        @Volatile
        private var instance: DatabaseConnection? = null

        fun getInstance(): DatabaseConnection {
            var result = instance
            if (result == null) {
                synchronized(DatabaseConnection::class) {
                    result = instance
                    if (result == null) {
                        result = DatabaseConnection()
                        instance = result
                    }
                }
            }
            return result!!
        }
    }
}