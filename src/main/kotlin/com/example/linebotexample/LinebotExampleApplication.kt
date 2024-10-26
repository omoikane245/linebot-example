package com.example.linebotexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class LinebotExampleApplication

fun main(args: Array<String>) {
	runApplication<LinebotExampleApplication>(*args)
}
