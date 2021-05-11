package br.com.zupacademy.demovalidation.carro

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton
import javax.validation.Constraint
import kotlin.annotation.AnnotationRetention.*
import kotlin.annotation.AnnotationTarget.*

@MustBeDocumented // anotação para o JavaDoc
@Target(FIELD, CONSTRUCTOR) // indica onde essa anotação pode ser utilizada
@Retention(RUNTIME) // indica que está disponível em tempo de execução
@Constraint(validatedBy = [PlacaValidator::class])
annotation class Placa(
    val message: String = "placa com formato inválido"
)

@Singleton
class PlacaValidator : ConstraintValidator<Placa, String> {
    override fun isValid(
        value: String?,
        annotationMetadata: AnnotationValue<Placa>,
        context: ConstraintValidatorContext
    ): Boolean {

        if (value.isNullOrBlank()) {
            return true
        }

        return value.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}".toRegex())
    }

}
