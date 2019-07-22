package controllers

import play.api._
import play.api.mvc._

class ContactUs extends Controller {

  def contactUs = Action {
    Ok(views.html.contactUs("Your new application is ready."))
  }

}