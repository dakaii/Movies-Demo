package org.dalol.moviedemo.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import org.dalol.moviedemo.models.Movie
import org.dalol.moviedemo.R

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    private val movies: MutableList<Movie> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie_layout, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindModel(movies[position])
    }

    fun setMovies(data: List<Movie>) {
        movies.addAll(data)
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val movieTitleTxt : TextView = itemView.findViewById(R.id.movieTitle)
        val movieGenreTxt : TextView = itemView.findViewById(R.id.movieGenre)
        val movieYearTxt : TextView = itemView.findViewById(R.id.movieYear)
        val movieAvatarImage : ImageView = itemView.findViewById(R.id.movieAvatar)

        fun bindModel(movie: Movie) {
            movieTitleTxt.text = movie.title
            movieGenreTxt.text = movie.genre
            movieYearTxt.text = movie.year
            Picasso.get().load(movie.poster).into(movieAvatarImage)
        }
    }
}