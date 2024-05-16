package com.example.b11109054_hw2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FrontPage(attractions: List<Attraction>, onAttractionSelected: (Attraction) -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MyColors.backgroundColor)
        .padding(5.dp)
    ) {
        Text(
            text = "日本旅遊景點",
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth()
                .background(MyColors.Green, RoundedCornerShape(16.dp)),
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
                    style = MaterialTheme.typography.h6.copy(fontSize = 20.sp),
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
                    style = MaterialTheme.typography.body2.copy(fontSize = 16.sp),
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Start,
                    color = Color.White
                )
            }

        }
    }
}
