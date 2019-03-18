package recommendation.service

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.tracing.annotation.NewSpan
import javax.inject.Inject

@Controller("/recommendations")
class RecommendationController(@field:Inject val recommendationService: RecommendationService) {

    @Get
    @NewSpan("recommendations")
    fun getRecommendations() = recommendationService.getRecommendations()

}