package recommendation.service

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("recommendation.service")
                .mainClass(Application.javaClass)
                .start()
    }
}