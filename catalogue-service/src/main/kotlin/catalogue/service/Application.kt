package catalogue.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("catalogue.service")
                .mainClass(Application.javaClass)
                .start()
    }

}