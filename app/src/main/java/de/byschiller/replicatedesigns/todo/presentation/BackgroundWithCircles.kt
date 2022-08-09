package de.byschiller.replicatedesigns.todo.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import de.byschiller.replicatedesigns.todo.TodoColorScheme

data class CircleDimensions(
    val width: Float
) {
    val r = width * 0.2f
    private val smallOffset = (width * 0.05f)
    private val largeOffset = (width * 0.17f)
    val x1 = r - largeOffset
    val y1 = r - smallOffset
    val x2 = r + smallOffset
    val y2 = r - largeOffset
}

@Composable
fun BackgroundWithCircles(
    modifier: Modifier = Modifier,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorScheme.background),
        contentAlignment = Alignment.TopStart
    ) {
        var size by remember { mutableStateOf(IntSize.Zero) }
        val cDims = remember(size) { CircleDimensions(size.width.toFloat()) }
        Canvas(modifier = Modifier
            .fillMaxSize()
            .onSizeChanged { size = it },
            onDraw = {

                drawCircle(
                    colorScheme.secondary,
                    radius = cDims.r,
                    center = Offset(cDims.x1, cDims.y1)
                )
                drawCircle(
                    colorScheme.secondary,
                    radius = cDims.r,
                    center = Offset(cDims.x2, cDims.y2)
                )
            }
        )

        Box(
            Modifier
                .fillMaxSize()
                .padding(50.dp),
            contentAlignment = Alignment.Center
        ) {
            content()
        }


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