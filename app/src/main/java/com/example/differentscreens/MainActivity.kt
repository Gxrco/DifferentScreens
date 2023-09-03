package com.example.differentscreens
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.differentscreens.ui.theme.DifferentScreensTheme

class MainActivity : ComponentActivity() {
    private val compL = Components()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DifferentScreensTheme {
                MainContent()
            }
        }
    }

    @Composable
    fun ScrollableGridSection(items: List<GridItem>) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
        ) {
            items(items) { item ->21
                compL.GridItemCard(item = item)
            }
        }
    }


    @Preview
    @Composable
    fun MainContent() {
        val sampleItems = listOf(
            GridItem("Item 1", "Sample description", ""),
            GridItem("Item 2", "Sample description", ""),
            GridItem("Item 3", "Sample description", ""),
            GridItem("Item 4", "Sample description", ""),
        )
        
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){
            compL.AppHeader(title = "Events")
            compL.NewSection(title = "My Favorites")
            ScrollableGridSection(items = sampleItems)

            compL.NewSection("All Events")
            ScrollableGridSection(items = sampleItems)
        }
    }

}
