package kg.iuca.campuscard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Шапка карточки: слева квадрат-аватар, справа колонка с именем и статусом
@Composable
fun ProfileHeader(name: String, status: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically, // квадрат и текст по центру по высоте
        horizontalArrangement = Arrangement.spacedBy(12.dp) // промежуток между квадратом и текстом
    ) {
        // Квадрат вместо настоящей фотографии
        Box(
            modifier = Modifier
                .size(56.dp)
                .background(MaterialTheme.colorScheme.primaryContainer)
        )
        // Вложенная колонка: имя сверху, статус под ним
        Column {
            Text(text = name, style = MaterialTheme.typography.titleMedium)
            Text(text = status)
        }
    }
}
