package com.google.samples.apps.sunflower

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle


@Composable
fun SunflowerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = if (darkTheme) DarkTypography else LightTypography,
        content = content
    )
}

private val DarkTypography = Typography(
    body1 = TextStyle(color = Color.White),
    button = TextStyle(color = Color.Black)
)

private val LightTypography = Typography(
    body1 = TextStyle(color = Color.Black),
    button = TextStyle(color = Color.White)
)
val Green500 = Color(0xff49bb79)
val Black = Color.Black
val Yellow500 = Color(0xffffff63)

private val DarkColors = darkColors(
    primary = Green500,
    primaryVariant = Black,
    onPrimary = Black,
    secondary = Yellow500,
    onSecondary = Black
)

private val LightColors = lightColors(
    primary = Green500,
    primaryVariant = Black,
    onPrimary = Black,
    secondary = Yellow500,
    onSecondary = Black
)



