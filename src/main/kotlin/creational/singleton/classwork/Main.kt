package com.anastasiia.creational.singleton.classwork

// What problem does the pattern solve?
/*
answer:
 */
fun main() {

    val singleton1: Singleton = Singleton.getInstance("cat")
    val singleton2: Singleton = Singleton.getInstance("dog")
    val singleton3: Singleton = Singleton.getInstance("cat")

}