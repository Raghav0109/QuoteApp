package com.example.quoteapp.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote
import java.lang.reflect.Modifier

@Composable
fun QuoteListScreen(data: Array<Quote>,onClick:(quote: Quote)->Unit){

    Column {
        Text(text = "Quotes App", textAlign= TextAlign.Center,
            modifier= Modifier
                .padding(24.dp,16.dp)
                .fillMaxWidth(1f),
            style=MaterialTheme.typography.titleMedium,
            fontFamily = FontFamily.Cursive)
        QuoteList(data = data, onClick)



    }
}