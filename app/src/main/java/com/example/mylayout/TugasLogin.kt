package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylayout.ui.theme.Pink40

private val PinkTua = Color(0xFFC2185B)
private val UnguAnggur = Color(0xFF4A1F3D)
private val PinkEmas = Color(0xFFE8A0B4)
private val PinkKrem = Color(0xFFFFF0F5)
private val PinkMuda = Color(0xFFF48FB1)
private val PinkPucat = Color(0xFFFCE4EC)

@Composable
fun TataletakBoxColumnRow1(modifier: Modifier = Modifier) {
    val latar = painterResource(id = R.drawable.bg_image)
    val logo = painterResource(id = R.drawable.logo_umy)
    val gambar = painterResource(id = R.drawable.photoself)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = latar, contentScale = ContentScale.Crop)
            .then(modifier)
            .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "LOGIN",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
        }
    }
}