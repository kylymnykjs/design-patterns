package com.anastasiia.creational.singleton.control

fun main() {

    val connection1 = DatabaseConnection.getInstance()
    val connection2 = DatabaseConnection.getInstance()
    val connection3 = DatabaseConnection.getInstance()

    connection1.connect()
    connection2.connect()
    connection3.connect()

    connection1.disconnect()
    connection2.disconnect()
    connection3.executeQuery("SELECT * FROM users")
}