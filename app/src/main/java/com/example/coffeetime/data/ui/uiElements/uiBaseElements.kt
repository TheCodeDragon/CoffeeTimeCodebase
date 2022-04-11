package com.example.coffeetime.data.ui.uiElements

import android.app.Notification
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//Base UI elements for reuse, like a default list item.
class UiBaseElements {
    @Composable
    fun MessageCard(name: String){
        Text(text = name)
    }

    @Composable
    fun Lc_default(items: List<String>) {
        LazyColumn {
            items(items) { message ->
                ListItemDefault(message)
            }
        }
    }

    @Composable
    fun ListItemDefault(content : String){
        Text(
            text = content,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        )

    }
}