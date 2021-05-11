package br.com.zupacademy.demovalidation

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.zupacademy.demovalidation")
		.start()
}

