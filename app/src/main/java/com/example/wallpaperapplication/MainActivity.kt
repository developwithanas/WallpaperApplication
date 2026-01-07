package com.example.wallpaperapplication

import android.app.WallpaperManager
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wallpaperapplication.ui.theme.WallpaperApplicationTheme

class MainActivity : ComponentActivity() {

    private val wallpapers = listOf(
        R.drawable.wall1,
        R.drawable.wall2,
        R.drawable.wall3,
        R.drawable.wall4,
        R.drawable.wall5,
        R.drawable.wall6,
        R.drawable.wall7,
        R.drawable.wall8,
        R.drawable.wall9,
        R.drawable.wall10,
        R.drawable.wall11,
        R.drawable.wall12,
        R.drawable.wall13,
        R.drawable.wall14,
        R.drawable.wall15,
        R.drawable.wall16,
        R.drawable.wall17,
        R.drawable.wall18,
        R.drawable.wall19,
        R.drawable.wall20,
        R.drawable.wall21,
        R.drawable.wall22,
        R.drawable.wall23,
        R.drawable.wall24,
        R.drawable.wall25,
        R.drawable.wall26,
        R.drawable.wall27,
        R.drawable.wall28,
        R.drawable.wall29,
        R.drawable.wall30,
        R.drawable.wall31,
        R.drawable.wall32,
        R.drawable.wall33,
        R.drawable.wall34,
        R.drawable.wall35,
        R.drawable.wall36,
        R.drawable.wall37,
        R.drawable.wall38,
        R.drawable.wall39,
        R.drawable.wall40,
        R.drawable.wall41,
        R.drawable.wall42,
        R.drawable.wall43,
        R.drawable.wall44,
        R.drawable.wall45,
        R.drawable.wall46,
        R.drawable.wall47,
        R.drawable.wall48,
        R.drawable.wall49,
        R.drawable.wall50,
        R.drawable.wall51,
        R.drawable.wall52,
        R.drawable.wall53,
        R.drawable.wall54,
        R.drawable.wall55,
        R.drawable.wall56,
        R.drawable.wall57,
        R.drawable.wall58,
        R.drawable.wall59,
        R.drawable.wall60,
        R.drawable.wall61,
        R.drawable.wall62
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WallpaperApplicationTheme {
                WallpaperGrid(wallpapers)
            }
        }
    }
}

@Composable
fun WallpaperGrid(wallpapers: List<Int>) {
    val context = LocalContext.current

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(8.dp)
    ) {
        items(wallpapers) { image ->   // ✅ image variable FIXED
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .padding(2.dp)
                    .fillMaxWidth()
                    .height(400.dp)
                    .clickable {
                        val bitmap = BitmapFactory.decodeResource(
                            context.resources, image
                        )
                        WallpaperManager
                            .getInstance(context)
                            .setBitmap(bitmap)
                    },
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWallpaperGrid() {
    WallpaperApplicationTheme {
        WallpaperGrid(
            wallpapers = listOf(
                R.drawable.wall1,
                R.drawable.wall2
            )
        )
    }
}
