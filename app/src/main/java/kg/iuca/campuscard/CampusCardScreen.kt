package kg.iuca.campuscard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kg.iuca.campuscard.ui.theme.CampusCardLabTheme

// Главный экран: вертикальная колонка, в которую сложено всё остальное
@Composable
fun CampusCardScreen(modifier: Modifier = Modifier) {

    // Упражнение 2: переключатель между двумя вариантами расположения кнопок внизу
    var useSpaceBetween by remember { mutableStateOf(true) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        // Упражнение 6: временно замени на Arrangement.SpaceBetween и посмотри, что изменится
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.Start // всё по умолчанию прижато к левому краю
    ) {

        // 1. Шапка: квадрат-аватар и рядом имя со статусом (Упражнение 5: отдельная функция)
        ProfileHeader(
            name = "Erbol Santashbekov",
            status = "In class · Building B"
        )

        // 2. Блок с заголовком. Упражнение 1: внутри этого блока всё по центру
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Campus Card", style = MaterialTheme.typography.headlineMedium)
            Text(text = "Erbol Santashbekov")
            Text(text = "Student ID: 1734")
        }

        // 3. Подпись над расписанием
        Text(text = "Today", style = MaterialTheme.typography.titleLarge)

        // 4. Список занятий: колонка из трёх строк (время | предмет | аудитория)
        Column(modifier = Modifier.fillMaxWidth()) {
            // Упражнение 3: у первой строки выравнивание Top, потом попробуй CenterVertically
            ScheduleRow(
                time = "09:00",
                title = "CS101 Intro",
                room = "Lab 3",
                verticalAlignment = Alignment.Top
            )
            ScheduleRow(time = "11:00", title = "MATH210", room = "A-204")
            ScheduleRow(time = "14:00", title = "Soft Skills", room = "Hall 1")
        }

        // 5. Нижний ряд с двумя кнопками
        ActionBar(useSpaceBetween = useSpaceBetween)

        // Только для упражнения 2: кнопка переключает расположение. После скриншотов можно удалить
        TextButton(onClick = { useSpaceBetween = !useSpaceBetween }) {
            Text(text = "Toggle action layout")
        }
    }
}

// Предпросмотр экрана прямо в Android Studio (без запуска эмулятора)
@Preview(showBackground = true)
@Composable
fun CampusCardScreenPreview() {
    CampusCardLabTheme {
        CampusCardScreen()
    }
}
