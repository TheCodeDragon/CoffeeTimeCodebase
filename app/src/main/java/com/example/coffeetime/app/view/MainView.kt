package com.example.coffeetime.app.view

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeetime.data.ui.theme.CoffeeTimeTheme

class MainView() {
    @Composable
    //TODO - go into how this should show off the list.
    fun PageContent() {
        CoffeeTimeTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                MainView("Coffee Time!")
            }
        }
    }
    @Composable
    fun MainView(appTitle: String)
    {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .verticalScroll(ScrollState(0), true, null)
        ) {
            TitleText(appTitle,16)
        }
    }

    @Composable
    private fun TitleText(content: String, padding: Int) {
        Text(
            text = content,
            modifier = Modifier
                .padding(padding.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            fontSize = 32.sp
        )
    }
}