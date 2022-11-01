package com.nicholssoftware.battlekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform