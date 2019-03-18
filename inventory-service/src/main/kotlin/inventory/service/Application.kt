package inventory.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("inventory.service")
                .mainClass(Application.javaClass)
                .start()
    }
}