package com.bluedigi.microserviceseurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class MicroservicesEurekaServerApplication

fun main(args: Array<String>) {
    runApplication<MicroservicesEurekaServerApplication>(*args)
}
