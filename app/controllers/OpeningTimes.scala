package controllers

import play.api._
import play.api.mvc._

class OpeningTimes extends Controller {

  def openTimes = Action {
    Ok(views.html.openingTimes("Test"))
  }

}