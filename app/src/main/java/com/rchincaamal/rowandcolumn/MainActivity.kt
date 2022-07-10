package com.rchincaamal.rowandcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxSample()
        }
    }
}

@Composable
fun ColumnSample() {
    Column {
        Text(text = "Fila 1")
        Text(text = "Fila 2")
        Text(text = "Fila 3")
        Text(text = "Fila 4")
    }
}

@Composable
fun RowSample() {
    Row {
        Text(text = "Fila 1")
        Text(text = "Fila 2")
        Text(text = "Fila 3")
        Text(text = "Fila 4")
    }
}

@Composable
fun Figure(color: Color) {
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .clip(CircleShape)
            .background(color)
    )
}

@Composable
fun BoxSample() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Figure(color = Color.Red)
        Figure(color = Color.Green)
        Figure(color = Color.Blue)
    }
}

@Preview(showBackground = true, name = "Row and Column", showSystemUi = true)
@Composable
fun PreviewColumnSample() {
    BoxSample()
}