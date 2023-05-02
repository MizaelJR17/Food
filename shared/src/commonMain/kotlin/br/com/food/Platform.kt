package br.com.food

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform