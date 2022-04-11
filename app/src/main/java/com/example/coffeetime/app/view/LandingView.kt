package com.example.coffeetime.app.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.coffeetime.app.MainActivity
import com.example.coffeetime.data.ui.theme.CoffeeTimeTheme
import com.example.coffeetime.data.ui.uiElements.UiBaseElements
import com.example.coffeetime.data.utils.NavigationUtil

class LandingView {
    @Composable
    fun PageContent()
    {

        //TODO: needs so much cleaning up.
        //Got a debug list here when it should be in Main view
        val coffeeList : List<String> = listOf("mocha","vente","chadwich", "regular")
        CoffeeTimeTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                    ){
                        //TODO: add landing page content
                        Text(text = "Welcome To Coffee Time")
                        Button(
                            onClick = { MainActivity().updateView(NavigationUtil.MAIN)}
                        ) {
                            Text(text = "Enter App")
                        }
                        UiBaseElements().Lc_default(items = coffeeList)

                    }
                }

            }
        }
    }


}