package controllers

import controllers.PlaceholderDatabase

import play.api._
import play.api.mvc._

class AllFilmsGallery extends Controller {
  def allFilms = Action {

    Ok(views.html.allFilmsGallery(PlaceholderDatabase.allFilmsList))
  }

}