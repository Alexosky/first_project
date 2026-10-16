
package com.sena.first_project.ui.section

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.first_project.ui.composable.Cuadro

private val Naranja = Color(0xFFF4B860)
private val AzulCentral = Color(0xFF344B67)
private val Verde = Color(0xFF48C9B0)
private val Violeta = Color(0xFFB69CFF)
private val Coral = Color(0xFFFF6B6B)
private val AzulFooter = Color(0xFF7189D8)

@Composable
fun SeccionSuperior() {
    Cuadro(
        nombre = "Box · Column",
        color = Naranja,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Header",
                fontSize = 23.sp,
                color = Color(0xFF392B1B)
            )
        }
    }
}

@Composable
fun SeccionCentral(modifier: Modifier = Modifier) {
    Cuadro(
        nombre = "Box · Column",
        color = AzulCentral,
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Cuadro(
                    nombre = "Box",
                    color = Coral,
                    modifier = Modifier.size(62.dp)
                )

                Cuadro(
                    nombre = "Box",
                    color = Verde,
                    modifier = Modifier.size(62.dp)
                )

                Cuadro(
                    nombre = "Box",
                    color = Violeta,
                    modifier = Modifier.size(62.dp)
                )
            }

            Text(
                text = "Row · Arrangement.SpaceEvenly",
                modifier = Modifier.padding(top = 18.dp),
                fontSize = 12.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun SeccionInferior() {
    Cuadro(
        nombre = "Box · Row",
        color = AzulFooter,
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Fila",
                fontSize = 18.sp,
                color = Color.White
            )

            Text(
                text = "Columna",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}
