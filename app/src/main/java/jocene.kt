import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jocene.R
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class jocene : Application(){
        override fun onCreate() {
            super.onCreate()
            FirebaseApp.initializeApp(this)
        }
    }

class MainActivity : AppCompatActivity() {
    private val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Utilisez 'db' pour accéder à Firestore dans cette activité
    }
}
