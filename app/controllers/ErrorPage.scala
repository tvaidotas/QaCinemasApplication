package controllers

import play.api._
import play.api.mvc._

class ErrorPage extends Controller {

  def errorPage = Action {
    Ok(views.html.errorPage())

  }
}