package com.github.rabitarochan.study.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootSandboxApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootSandboxApplication::class.java, *args)
}
