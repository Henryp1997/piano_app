package com.example.test

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.test.ui.theme.TestTheme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xff008Dff)) {
                    Layout()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout() {
    Scaffold (
        containerColor = Color.White,
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                            containerColor = Color.Cyan,
                            titleContentColor = Color.Black,
                ),
                title = {
                    Text("top bar")
                }
            )
        },
    content = { innerPadding ->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(innerPadding),
        ) {
            Column {
                Text("test button")
                TestBtn(onClick = { Log.d("test button","testing click button") })
            }
        }
    })
}

@Composable
fun TestBtn (onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        colors = buttonColors(
            containerColor = Color(0xff00ff00),
            contentColor = Color(0xffffffff)
        )
    ) {
        Text("hello")
    }
}