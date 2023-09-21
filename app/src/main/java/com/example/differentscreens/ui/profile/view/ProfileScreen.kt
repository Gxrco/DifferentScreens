package com.example.differentscreens.ui.profile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.differentscreens.R

class ProfileScreen {

    @Composable
    fun ListOptions(){
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
           Row(
               modifier = Modifier.padding(15.dp),
               verticalAlignment = Alignment.CenterVertically
           ) {
               Icon(painter = painterResource(id = R.drawable.person),
                   contentDescription = "Person",
                   Modifier
                       .padding(10.dp)
                       .size(35.dp))
               Text(text = "Edit Profile", Modifier.padding(15.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
               Spacer(modifier = Modifier.weight(1f))
               IconButton(onClick = {},
                   Modifier
                       .size(40.dp)
                       .padding(end = 20.dp)) {
                   Icon(painter = painterResource(id = R.drawable.triangle),
                       contentDescription = "Change", modifier = Modifier.size(40.dp)
                   )
               }

           }
            Divider(thickness = 1.dp)
            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painter = painterResource(id = R.drawable.resetpassword),
                    contentDescription = "Reset password",
                    Modifier
                        .padding(10.dp)
                        .size(35.dp))
                Text(text = "Reset Password", Modifier.padding(15.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = {},
                    Modifier
                        .size(40.dp)
                        .padding(end = 20.dp)) {
                    Icon(painter = painterResource(id = R.drawable.triangle),
                        contentDescription = "Change", modifier = Modifier.size(40.dp)
                    )
                }
            }
            Divider(thickness = 1.dp)
            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painter = painterResource(id = R.drawable.notifications),
                    contentDescription = "Notifications",
                    Modifier
                        .padding(10.dp)
                        .size(35.dp))
                Text(text = "Notifications", Modifier.padding(15.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))

                val checkedState = remember { mutableStateOf(true) }
                Switch(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it }
                )
            }
            Divider(thickness = 1.dp)
            Row(
                modifier = Modifier.padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(painter = painterResource(id = R.drawable.favorite),
                    contentDescription = "My favorites",
                    Modifier
                        .padding(10.dp)
                        .size(35.dp))
                Text(text = "My favorites", Modifier.padding(15.dp), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = {},
                    Modifier
                        .size(40.dp)
                        .padding(end = 20.dp)) {
                    Icon(painter = painterResource(id = R.drawable.triangle),
                        contentDescription = "Change", modifier = Modifier.size(40.dp)
                    )
                }
            }
            Divider(thickness = 1.dp)
        }
    }

    @Preview
    @Composable
    fun MainScreenProfile(){
        Column(
            Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxWidth()) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .paint(
                        painterResource(id = R.drawable.bgprofile),
                        contentScale = ContentScale.Fit
                    )
                    .height(220.dp)
            ){
                Image(painter = painterResource(id = R.drawable.ppedit),
                    contentDescription = "Profile picture",
                    modifier = Modifier.clip(CircleShape)
                        .size(180.dp)
                        .aspectRatio(1f)
                        .align(Alignment.Center),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Gerson Ramirez",
                    Modifier.align(Alignment.BottomCenter).padding(bottom = 20.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                    )
                }
                ListOptions()
            }
        }
    }
