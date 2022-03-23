package org.example.configurationclient

import org.springframework.beans.factory.annotation.*
import org.springframework.cloud.context.config.annotation.*
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@Suppress("unused")
@RefreshScope
@RestController
internal class MessageRestController {
    @get:RequestMapping("/message")
    @Value("\${message:Hello default}")
    val message: String? = null
}