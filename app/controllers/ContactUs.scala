package controllers

import authentication.AuthenticatedAction
import play.api._
import play.api.mvc._

class ContactUs extends Controller {

  def contactUs = AuthenticatedAction {
    Ok(views.html.contactUs("Your new application is ready."))
  }

}