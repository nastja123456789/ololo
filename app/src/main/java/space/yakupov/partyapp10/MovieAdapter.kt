package space.yakupov.partyapp10

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val movies: List<Movie>): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvName: TextView = itemView.findViewById(R.id.movie_item_tv_name)
        val tvDes: TextView = itemView.findViewById(R.id.movie_item_tv_description)
        val tvPoster: ImageView = itemView.findViewById(R.id.movie_item_poster)
        fun bind(movie:Movie) {
            tvName.text = movie.title
            tvDes.text = movie.description
            tvPoster.setImageResource(movie.picture)
            itemView.setOnClickListener() {
                val i = Intent(itemView.context, Description::class.java).apply {
                    putExtra("title", tvName.text.toString())
                    putExtra("context",tvDes.text.toString())
                    putExtra("image",movie.picture)
                }
                itemView.context.startActivity(i)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}