package com.anastasiia.creational.singleton.homework

import creational.singleton.homework.Logger

fun main() {

    val log1: Logger = Logger.getInstance()
    val log2: Logger = Logger.getInstance()
    val log3: Logger = Logger.getInstance()

    log1.log("the first log")
    log2.log("the second log")
    log3.log("the third log")
}