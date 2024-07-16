package com.anastasiia.creational.singleton.classwork

import kotlin.concurrent.Volatile

// че решает?
// используется, когда нужно гарантировать создание строго одного экземпляра класса.
// когда использовать?
// часто используется в конфиг файлах, в логах, при подключении к базе данных, для кэшированния и для управления файловой системой.
class Singleton private constructor(private val data: String) {

    companion object {

        @Volatile
        private var instance: Singleton? = null

        fun getInstance(data: String): Singleton {
            var result = instance
            if (result == null) {
                synchronized(Singleton::class) {
                    result = instance
                    if (result == null) {
                        result = Singleton(data)
                        instance = result
                    }
                }
            }
            return result!!
        }
    }
}
