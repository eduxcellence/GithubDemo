package com.example.githubdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubdemo.ui.theme.GitHubDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitHubDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
//Second Commit
                ) {
                    Greeting("Android")
                    //Third Commit
                    //Fourth Commit
                    //Fifth Commit By Second User
                    //Sixth Commit
                    //Commit from Another Branch
                    // Changes to be memove
                    //author name changed
                    //global changed
                    //commit -a
                    //stahs
                    //made changes
                    // done some changes here
                    //commit now
                    //Commit From MEnu
                    //Second Commit from Menu
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    //chnages 2
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GitHubDemoTheme {
        Greeting("Android")
    }
}