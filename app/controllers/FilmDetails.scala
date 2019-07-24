package controllers

import play.api.mvc.{Action, Controller}

class FilmDetails extends Controller {
  def filmDetails = Action {

    Ok(views.html.filmDetails(PlaceholderDatabase.allFilmsList))
  }

}