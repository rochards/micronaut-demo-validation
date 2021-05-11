package br.com.zupacademy.demovalidation.carro

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/api/carros")
class CarroController {

    @Post
    fun cria(@Valid @Body carro: Carro): HttpResponse<Carro> {
        return HttpResponse.ok(carro)
    }
}