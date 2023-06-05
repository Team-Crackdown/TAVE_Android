package com.example.tave.items

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tave.ui.theme.Shape

@Composable
fun UserBadge(text: String) {
    Card(
        modifier = Modifier.size(50.dp, 25.dp),
        shape = Shape.extraLarge,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.fillMaxSize()
        )
        Spacer(modifier = Modifier.size(10.dp))
    }
}


/** Preview UserBadge **/
@Preview
@Composable
fun PreviewUserBadge() {
    UserBadge("11기")
}