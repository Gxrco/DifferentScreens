package com.example.differentscreens.ui.favorites.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.differentscreens.R

class ListConcerts {

    @Preview
    @Composable
    fun BuildList(){
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ){
            items(5) { index ->
                RowForElement(title = "Artist $index")
                Divider(thickness = 1.dp)
            }
        }
        
    }
    
    @Composable
    fun RowForElement(title: String){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painter = painterResource(
                    id = R.drawable.person
                ),
                    contentDescription = "User",
                    modifier = Modifier
                        .clip(CircleShape)
                        .padding(10.dp)
                        .background(Color(0xFFC5DFF8))
                        .size(30.dp),
                    tint = Color.Black,
                )

                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = title, fontSize = 18.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Left)
                    Text(text = "Sample Location", fontSize = 10.sp, textAlign = TextAlign.Left)
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = {}) {
                Icon(painter = painterResource(id = R.drawable.changehistory24px),
                    contentDescription = "triangle",
                    modifier = Modifier
                        .padding(10.dp),
                    tint = Color.Black
                )
            }
        }
    }
}