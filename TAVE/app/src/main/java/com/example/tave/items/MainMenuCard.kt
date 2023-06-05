package com.example.tave.items

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tave.R
import com.example.tave.ui.theme.customShape

@Composable
fun MainMenuCards(
    modifier: Modifier,
    painter: Painter,
    shapes: Shape,
    iconColor: Color,
    colors: CardColors,
    textColor: Color,
    description: String,
    textTitle: String,
    textContent: String
){
    Card(
        modifier = modifier,
        shape = shapes,
        colors = colors,
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row {
                Icon(painter, description, tint = iconColor)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = textTitle,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = textColor
                    )
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = textContent,
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = textColor
                )
            )
        }
    }
}

/**메인 카드 메뉴 예시*/
@Composable
fun MainMenuCardsMock(
    modifier: Modifier,
    painter: Painter,
    shapes: Shape,
    iconColor: Color,
    description: String,
    textTitle: String,
    textContent: String
){
    Card(
        modifier = modifier,
        shape = shapes,
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row {
                Icon(painter, description, tint = iconColor)
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = textTitle,
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = textContent,
                style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.SemiBold)
            )
        }
    }
}