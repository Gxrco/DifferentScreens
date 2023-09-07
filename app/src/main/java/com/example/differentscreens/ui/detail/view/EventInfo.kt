package com.example.differentscreens.ui.detail.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.differentscreens.R

class EventInfo {

    @Composable
    fun MainInfo() {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Title", modifier = Modifier.padding(12.dp), fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Row(modifier = Modifier.padding(10.dp),verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.event),
                    contentDescription = "Fecha de evento",
                    Modifier.size(30.dp)
                )
                Text(text = "Date", modifier = Modifier.padding(horizontal = 20.dp))
                Spacer(modifier = Modifier.weight(0.8f))
                Text(text = "Time", Modifier.padding(horizontal = 20.dp))
            }
            Text(text = "About", modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 10.dp), fontWeight = FontWeight.Bold )
            Box(modifier = Modifier.padding(16.dp)) {
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ut justo imperdiet, auctor risus vitae, euismod mauris. In fringilla tortor quis ipsum faucibus tincidunt.")
            }
        }
    }

    @Preview
    @Composable
    fun DetailScreen() {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Box(modifier = Modifier
                .height(350.dp)
                .fillMaxWidth()
                .background(Color(0xFFC5DFF8))
                .paint(painterResource(id = R.drawable.bgconcert),
                    contentScale = ContentScale.FillHeight))
            {
                Text(text = "Location", Modifier.align(Alignment.BottomStart).padding(20.dp), fontSize = 20.sp)
            }
            MainInfo()
            Column(
                Modifier
                    .height(140.dp)
                    .fillMaxWidth()) {
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Button(onClick = { /* Handle button 1 click */ }, modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7895CB))){
                    Text("Favorite")
                }

                Button(onClick = { /* Handle button 2 click */ },modifier = Modifier
                    .weight(1f)
                    .padding(4.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7895CB))) {
                    Text("Buy")
                }
            }
        }
    }
}