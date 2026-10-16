
package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.first_project.ui.section.SeccionCentral
import com.sena.first_project.ui.section.SeccionInferior
import com.sena.first_project.ui.section.SeccionSuperior

@Composable
fun Home() {
    Scaffold(
        containerColor = Color(0xFFF3E7E7)
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(8.dp)
        ) {
            Text(
                text = "Scaffold",
                fontSize = 13.sp,
                color = Color(0xFF514747),
                modifier = Modifier.padding(4.dp)
            )

            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                color = Color(0xFFF3E7E7),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(18.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "Surface",
                        fontSize = 13.sp,
                        color = Color(0xFF514747)
                    )

                    SeccionSuperior()

                    SeccionCentral(
                        modifier = Modifier.weight(1f)
                    )

                    SeccionInferior()
                }
            }
        }
    }
}
