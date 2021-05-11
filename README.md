# Como criar uma validação customizada com o Micronaut e Kotlin

Validar campos de JSON de entrada da API é algo muito comum no desenvolvimento. Frameworks maduros já fornecem uma 
diversidade de anotações que podem ser utilizadas para fazer tais validações. Em casos que essas anotações não são 
suficentes, há a possibilidade de criar uma nova com a regra desejada. 

O exemplo apresentado neste repositório apresenta uma anotação customizada para validar placas de veículos. Exemplo 
de request (método POST):
```json
{
  "modelo": "Ford Fusion Hybrid",
  "placa": "MKA6086"
}
```
- OBS.: placa deve estar sem pontuação e pode ser no formato do Mercosul

O que foi utilizado para criar esse exemplo:
- Kotlin 1.5.0;
- Micronaut 2.5.1;
- Intellij IDEA;
- JDK 11.
