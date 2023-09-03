package com.example.differentscreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Components {

    @Composable
    fun AppHeader(title: String) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFAFD3E2))
        ){
            Text(text = title,
                modifier = Modifier.padding(16.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left
            )
            IconButton(
                modifier = Modifier.padding(16.dp),
                onClick = {}
            ){
                Icon(painter = painterResource(id = R.drawable.more_vert_24px),
                    contentDescription = "More Vert",
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        }
    }


    @Composable
    fun GridItemCard(item: GridItem) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            shape = MaterialTheme.shapes.medium
        ) {

            Column(
                modifier = Modifier
                    .padding(start = 1.dp)
                    .background(Color(0xFFC5DFF8)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.concert_64),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Fit
                )
                Text(item.Name)
                Text(item.Description)
            }
        }
    }

    @Composable
    fun NewSection(title: String){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
        ){
            Text(
                text = title,
                modifier  = Modifier.padding(horizontal = 20.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }



}