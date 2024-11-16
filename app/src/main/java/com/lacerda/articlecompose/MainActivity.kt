package com.lacerda.articlecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lacerda.articlecompose.ui.theme.ArticleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleComposeTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column (
        modifier = modifier
    ) {
        Image (
            painter = image,
            contentDescription = null
        )
        Text (
            text = stringResource(R.string.title),
            modifier = modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text (
            text = stringResource(R.string.descriprtion),
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify
        )
        Text (
            text = stringResource(R.string.body),
            modifier = modifier.padding(start =  16.dp, end = 16.dp, top = 16.dp),
            fontSize = 24.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticleComposeTheme {
        Article()
    }
}