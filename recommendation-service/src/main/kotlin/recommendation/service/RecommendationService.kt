package recommendation.service

import io.micronaut.tracing.annotation.ContinueSpan
import javax.inject.Singleton

@Singleton
class RecommendationService {

    @ContinueSpan
    fun getRecommendations() = arrayListOf<Recommendation>()

}