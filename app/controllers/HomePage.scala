package controllers

import play.api._
import play.api.mvc._

class HomePage extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def aboutUs = Action {
    Ok(views.html.aboutUs("Your new application is ready."))
  }

  def contactUs = Action {
    Ok(views.html.contactUs("Your new application is ready."))
  }

  def openTimes = Action {
    Ok(views.html.openingTimes("Test"))
  }

  def newReleses = Action {
    Ok(views.html.newRelesesGallery())
  }

  def allFilms = Action {
    Ok(views.html.allFilmsGallery())
  }

  def errorPage = Action {
    Ok(views.html.errorPage("Error Message Here"))
  }

  def login = Action {
    Ok(views.html.login("Your new application is ready."))
  }



}