package com.example.b11109054_hw2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.b11109054_hw2.ui.theme.B11109054_HW2Theme
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import kotlinx.coroutines.selects.select


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            B11109054_HW2Theme {

                HW2()
            }
        }
    }
}


@Composable
fun HW2() {
    MaterialTheme {
        val attractionsView = remember { AttractionsView() }

        var selectedAttraction by remember { mutableStateOf<Attraction?>(null) }

        if (selectedAttraction == null) {
            FrontPage(attractions = attractionsView.attractions) { attraction ->
                selectedAttraction = attraction
            }
        } else {
            DetailPage(
                attraction = selectedAttraction!!,
                onBackClicked = { selectedAttraction = null },
                onMapClicked = {}
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    B11109054_HW2Theme {
        HW2()
    }
}
