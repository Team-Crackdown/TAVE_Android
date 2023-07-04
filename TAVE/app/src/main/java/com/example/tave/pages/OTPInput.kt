package com.example.tave.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tave.items.otp.OTPCodeInput
import com.example.tave.items.otp.OtpLogo
import com.example.tave.ui.theme.TAVETheme

@Composable
fun OTPCodePage(
    modifier: Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        content = {
            Column(
                modifier = modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OtpLogo(modifier = modifier)
                Spacer(modifier = modifier.size(10.dp))
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    content = {
                        OTPCodeInput(modifier = modifier, checkOTPCode = {})
                    }
                )
            }
        }
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewOTPCodePage() {
    TAVETheme {
        OTPCodePage(modifier = Modifier)
    }
}
