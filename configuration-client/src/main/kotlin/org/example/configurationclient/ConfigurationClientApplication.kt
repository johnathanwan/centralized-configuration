package org.example.configurationclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigurationClientApplication

fun main(args: Array<String>) {
    runApplication<ConfigurationClientApplication>(*args)
}
