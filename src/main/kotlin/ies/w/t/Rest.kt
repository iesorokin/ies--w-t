package ies.w.t

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Rest {
    @GetMapping("hello")
    fun get(): String = "Hello, world"
}