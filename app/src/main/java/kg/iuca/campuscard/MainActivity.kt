package kg.iuca.campuscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import kg.iuca.campuscard.ui.theme.CampusCardLabTheme // если проект назван иначе, имя темы тоже другое (см. ui/theme/Theme.kt)

// Здесь только сам экран-активность. Весь интерфейс лежит в других файлах.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CampusCardLabTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // innerPadding нужен, чтобы контент не залезал под системные панели
                    CampusCardScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
