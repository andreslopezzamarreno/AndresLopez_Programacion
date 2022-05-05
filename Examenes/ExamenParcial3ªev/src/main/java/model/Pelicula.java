package model;

import java.awt.*;
import java.io.Serializable;
import java.util.Arrays;

public class Pelicula implements Serializable {

    private String backdrop_path,original_language,original_title,overview,poster_path,release_date,title;
    private boolean adult,video;
    private int id,vote_count;
    private double popularity,vote_average;
    private int[] genre_kids;

    public Pelicula(String backdrop_path, String original_language, String original_title, String overview, String poster_path, String release_date, String title, boolean adult, boolean video, int id, int vote_count, double popularity, double vote_average, int[] genre_kids) {
        this.backdrop_path = backdrop_path;
        this.original_language = original_language;
        this.original_title = original_title;
        this.overview = overview;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.title = title;
        this.adult = adult;
        this.video = video;
        this.id = id;
        this.vote_count = vote_count;
        this.popularity = popularity;
        this.vote_average = vote_average;
        this.genre_kids = genre_kids;
    }

    public Pelicula() {
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public int[] getGenre_kids() {
        return genre_kids;
    }

    public void setGenre_kids(int[] genre_kids) {
        this.genre_kids = genre_kids;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "backdrop_path='" + backdrop_path + '\'' +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", release_date='" + release_date + '\'' +
                ", title='" + title + '\'' +
                ", adult=" + adult +
                ", video=" + video +
                ", id=" + id +
                ", vote_count=" + vote_count +
                ", popularity=" + popularity +
                ", vote_average=" + vote_average +
                ", genre_kids=" + Arrays.toString(genre_kids) +
                '}';
    }
}
