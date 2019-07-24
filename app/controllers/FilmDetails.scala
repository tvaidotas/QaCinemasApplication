package controllers

import models.Film
import play.api.mvc.{Action, Controller}

class FilmDetails extends Controller {
  def filmDetails(id: String) = Action {
    Ok(views.html.filmDetails(PlaceholderDatabase.allFilmsList.find(_.getId() == id.toInt).getOrElse(new Film(1,"error",
      "error", "error", "error", "00-00-0000", List("error")))))
  }

}