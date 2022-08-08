package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.byschiller.replicatedesigns.todo.TodoColorScheme

@Composable
fun BackgroundWithCircles(
    modifier: Modifier = Modifier,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    val h = 210f
    val w = 250f
    val r = 82f
    val radiusPx = with(LocalDensity.current) { r.dp.toPx() }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorScheme.background),
        contentAlignment = Alignment.TopStart
    ) {
        Canvas(modifier = Modifier
            .width(w.dp)
            .height(h.dp)
            .offset(-w.dp/2, -h.dp/2),
            onDraw = {
                drawCircle(
                    colorScheme.secondary,
                    radius = radiusPx,
                    center = Offset(size.width - radiusPx, radiusPx)
                )
                drawCircle(
                    colorScheme.secondary,
                    radius = radiusPx,
                    center = Offset(radiusPx, size.height - radiusPx)
                )
            }
        )

        content()

    }

}


@Preview(showBackground = true)
@Composable
fun BackgroundWithCircles() {
    BackgroundWithCircles(
        modifier = Modifier,
        colorScheme = TodoColorScheme,
        content = { Text("hi") }
    )
}