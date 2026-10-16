
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

private val Rosa = Color(0xFFF28B82)
private val Turquesa = Color(0xFF80CBC4)
private val Azul = Color(0xFF42A5F5)
private val Morado = Color(0xFFAB80DE)
private val Amarillo = Color(0xFFFFD166)
private val MoradoFooter = Color(0xFF9575CD)

@Composable
fun SeccionSuperior() {
    Cuadro(
        nombre = "Box",
        color = Rosa,
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
                fontSize = 22.sp,
                color = Color(0xFF702C2C)
            )
        }
    }
}

@Composable
fun SeccionCentral(modifier: Modifier = Modifier) {
    Cuadro(
        nombre = "Box",
        color = Turquesa,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(55.dp)
                    .padding(2.dp)
            ) {
                Cuadro(
                    nombre = "",
                    color = Azul,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Box(
                modifier = Modifier.size(55.dp)
            ) {
                Cuadro(
                    nombre = "",
                    color = Morado,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Box(
                modifier = Modifier.size(55.dp)
            ) {
                Cuadro(
                    nombre = "",
                    color = Amarillo,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
fun SeccionInferior() {
    Cuadro(
        nombre = "Box",
        color = MoradoFooter,
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
                text = "Footer",
                fontSize = 18.sp,
                color = Color.White
            )

            Text(
                text = "Footer",
                fontSize = 18.sp,
                color = Color.White
            )
        }
    }
}
