package space.yakupov.partyapp10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }
    fun openMap(view: View) {
        val mapIntent = Intent(this, MapActivity::class.java)
        startActivity(mapIntent)
    }
}