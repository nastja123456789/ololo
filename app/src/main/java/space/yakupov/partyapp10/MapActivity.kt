package space.yakupov.partyapp10

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_list, R.id.navigation_location, R.id.navigation_settings))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        setContentView(R.layout.fragment_settings)
       // val btn1:ImageButton = findViewById(R.id.btn1)
        //btn1.setOnClickListener{
        //    val notationIntent = Intent(this, Notifications::class.java)
        //    startActivity(notationIntent)
        //}
//        val btn2:ImageButton = findViewById(R.id.btn2)
//        btn2.setOnClickListener{
//            val contactIntent = Intent(this, Contact::class.java)
//            startActivity(contactIntent)
//        }
        setContentView(R.layout.fragment_list)
        val movies = generateMovieList()
        val rv_movie_list: RecyclerView = findViewById(R.id.fragment_list_rv_movie_list)
        val adapter = MovieAdapter(movies)
        rv_movie_list.adapter = adapter
        rv_movie_list.layoutManager = LinearLayoutManager(this)
    }
    fun generateMovieList(): List<Movie> {
        return listOf(
            Movie(
                "Погнали в бар",
                "В 2:00 собираемся около главного входа в..",
                R.drawable.foto1
            ),
            Movie(
                "Давно не виделись",
                "Желательно не опаздывать, ждать не будем!",
                R.drawable.foto2
            )
        )
    }
}