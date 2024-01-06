package dev.noelsrocha.pokedex.ui.screens

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.noelsrocha.pokedex.ui.theme.PokedexTheme

@Composable
fun HomeScreen() {
    PokedexTheme {
        Surface {
            Scaffold {

            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}