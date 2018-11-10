package org.dalol.moviedemo.apis

import io.reactivex.Observable
import org.dalol.moviedemo.models.MovieResponse
import retrofit2.http.GET

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 08/04/2018 at 17:56.
 */

interface ApiMovies {

    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovies() : Observable<MovieResponse>
}