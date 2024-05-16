package com.example.b11109054_hw2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.b11109054_hw2.ui.theme.B11109054_HW2Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
import androidx.compose.foundation.BorderStroke





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            B11109054_HW2Theme {
                // A surface container using the 'background' color from the theme
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
            //DetailPage(attraction = selectedAttraction!!) {
            selectedAttraction = null // 返回主頁面
        }
    }
}

@Composable
fun FrontPage(attractions: List<Attraction>, onAttractionSelected: (Attraction) -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MyColors.backgroundColor)
    ) {
        Text(
            text = "日本旅遊景點",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth()
                .background(MyColors.Green),
            color = Color.White,
            fontSize = 60.sp,
            textAlign = TextAlign.Center
        )
        Column(modifier = Modifier.weight(1f)) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(attractions) { attraction ->
                    AttractionItem(attraction = attraction, onClick = onAttractionSelected)
                }
            }
        }
    }

}


@Composable
fun AttractionItem(attraction: Attraction, onClick: (Attraction) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { onClick(attraction) }
            .padding(16.dp)
            .background(MyColors.frontpageAttractionsName, RoundedCornerShape(16.dp))
    ) {
        val borderWidth = 4.dp
        Image(
            painter = painterResource(id = attraction.imageResourceID),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(start = 3.dp)
                .border(
                    BorderStroke(borderWidth, MyColors.frontpageTextBackground),
                    RoundedCornerShape(16.dp)
                )
                .padding(borderWidth)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = attraction.name,
                    style = MaterialTheme.typography.h6.copy(fontSize = 20.sp), // 調整字體大小
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Start,
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = attraction.frontpagedes,
                    style = MaterialTheme.typography.body2.copy(fontSize = 16.sp), // 調整字體大小
                    modifier = Modifier.padding(16.dp), // 添加内边距以匹配文本的大小
                    textAlign = TextAlign.Start,
                    color = Color.White
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    B11109054_HW2Theme {
        val attractionsView = AttractionsView()
        FrontPage(attractions = attractionsView.attractions) { }
    }
}
