package kg.iuca.campuscard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Нижний ряд с двумя кнопками. Упражнение 2: два варианта расположения
@Composable
fun ActionBar(useSpaceBetween: Boolean, modifier: Modifier = Modifier) {

    // Вариант 1: SpaceBetween, одна кнопка у левого края, другая у правого
    // Вариант 2: Center, обе кнопки вместе посередине, между ними промежуток 16 dp
    val arrangement: Arrangement.Horizontal =
        if (useSpaceBetween) Arrangement.SpaceBetween
        else Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)

    Row(
        modifier = modifier.fillMaxWidth(), // без fillMaxWidth разводить кнопки было бы некуда
        horizontalArrangement = arrangement,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(onClick = { /* пока ничего не делаем, нужна только кнопка */ }) {
            Text(text = "Map")
        }
        Button(onClick = { /* пока ничего не делаем */ }) {
            Text(text = "Show QR")
        }
    }
}
