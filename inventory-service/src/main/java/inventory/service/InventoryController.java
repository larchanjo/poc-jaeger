package inventory.service;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.tracing.annotation.ContinueSpan;
import io.micronaut.tracing.annotation.SpanTag;
import io.micronaut.validation.Validated;
import javax.validation.constraints.NotNull;

@Validated
@Controller("/inventories")
@Produces(MediaType.TEXT_PLAIN)
public class InventoryController {

  @Get("/{id}")
  @ContinueSpan
  public Boolean contains(@NotNull @SpanTag Integer id) {
    return id % 2 == 0;
  }

}