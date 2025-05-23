package com.zedsols.learnkotlin

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Learn Kotlin",
    ) {
        App()
    }
}