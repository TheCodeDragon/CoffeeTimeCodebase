package com.example.coffeetime.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffeetime.app.view.MainView
import com.example.coffeetime.app.view.LandingView
import com.example.coffeetime.data.utils.NavigationUtil


class MainActivity : ComponentActivity() {

    private var pageContent : String = NavigationUtil.LANDING
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //moved this bit to view, now to figure out how to load the other page?
            
        }
    }

    fun updateView(main: String) {

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //Debugging Only
    LandingView().PageContent()
}