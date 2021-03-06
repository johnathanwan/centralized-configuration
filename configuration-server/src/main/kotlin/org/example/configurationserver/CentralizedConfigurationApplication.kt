package org.example.configurationserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class CentralizedConfigurationApplication

fun main(args: Array<String>) {
    runApplication<CentralizedConfigurationApplication>(*args)
}
