package com.vibhav.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vibhav.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                var count by remember {
                    mutableStateOf(0)
                }
//                    Greeting("Vibhav")
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = count.toString(),
                        fontSize = 30.sp
                    )
                    Button(onClick = {
                        count++
                    }) {
                        Text(text = "click me")
                    }
                }
            }
        }
    }
}
//
//@Composable
//fun Greeting(name: String) {
//    LazyRow(modifier = Modifier.fillMaxSize()) {
//        items(10)
//        {
//            Icon(
//                imageVector = Icons.Default.Add,
//                contentDescription = null,
//                modifier = Modifier.size(100.dp)
//            )
//        }
//    }
    

    
//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//        modifier = Modifier.background(Color.Black)
//    )
    
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//
//        Text(
//            text = "Good buy",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//    }

//    Row(
//        horizontalArrangement = Arrangement.End,
//        modifier = Modifier
//            .size(400.dp)
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//
//        Text(
//            text = "Good buy",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//    }

//    Box(
//        modifier = Modifier
//            .size(400.dp),
//    ) {
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 30.sp,
//            modifier = Modifier.align(Alignment.Center)
//        )
//
//        Text(
//            text = "Good buy",
//            color = Color.Blue,
//            fontSize = 30.sp,
//        )
//    }

//}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    ComposeTutorialTheme {
//    }
//}