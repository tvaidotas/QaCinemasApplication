package controllers

import controllers.placeholderDatabase

import play.api._
import play.api.mvc._

class AllFilmsGallery extends Controller {
  def allFilms = Action {
    Ok(views.html.allFilmsGallery(placeholderDatabase.allFilmsList))
  }

}