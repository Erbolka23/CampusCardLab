package kg.iuca.campuscard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

// Одна строка расписания: время | название предмета | аудитория
@Composable
fun ScheduleRow(
    time: String,
    title: String,
    room: String,
    modifier: Modifier = Modifier,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically // Упражнение 3
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = verticalAlignment
    ) {
        // Время слева, крупнее названия (нужно для упражнения 3), фиксированная ширина, чтобы время стояло ровно
        Text(
            text = time,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.width(72.dp)
        )
        // Упражнение 4: weight(1f) отдаёт названию всё свободное место между временем и аудиторией
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 2, // длинное название переносится максимум на две строки
            overflow = TextOverflow.Ellipsis, // а если и этого мало, в конце будет многоточие
            modifier = Modifier.weight(1f)
        )
        // Аудитория справа, тоже с фиксированной шириной, чтобы её не вытолкнуло за экран
        Text(
            text = room,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.End,
            modifier = Modifier.width(64.dp)
        )
    }
}
