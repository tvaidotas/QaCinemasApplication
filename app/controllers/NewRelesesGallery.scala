package controllers

import play.api._
import play.api.mvc._

class NewRelesesGallery extends Controller {

  def newReleses = Action {
    Ok(views.html.newRelesesGallery(PlaceholderDatabase.allFilmsList))
  }

}