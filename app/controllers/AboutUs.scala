package controllers

import play.api._
import play.api.mvc._

class AboutUs extends Controller {

  def aboutUs = Action {
    Ok(views.html.aboutUs("Your new application is ready."))
  }
}