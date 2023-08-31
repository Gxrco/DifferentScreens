package com.example.differentscreens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
                modifier = Modifier.padding(16.dp)
            ) {
                MyImageComponent()
                Text(item.Name)
                Text(item.Description)
            }
        }
    }

    @Composable
    fun MyImageComponent() {
        Image(
            painter = painterResource(id = R.drawable.concert_64),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
    }

    @Preview
    @Composable
    fun NewSection(){
        Row(
            modifier = Modifier.fillMaxWidth(),
        ){
            Text(
                text = "Test",
                modifier  = Modifier.padding(1.dp, 16.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }

}