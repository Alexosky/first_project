
package com.sena.first_project.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Cuadro(
    nombre: String,
    color: Color,
    modifier: Modifier = Modifier,
    contenido: @Composable BoxScope.() -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color)
            .border(
                2.dp,
                Color(0xFF52617D),
                RoundedCornerShape(16.dp)
            )
    ) {
        if (nombre.isNotEmpty()) {
            Text(
                text = nombre,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(8.dp),
                fontSize = 12.sp,
                color = Color(0xFF243047)
            )
        }

        contenido()
    }
}
