package controllers

import play.api._
import play.api.mvc._

class HomePage extends Controller {


  val allFilmsList :List[String] = List[String]("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16")

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
    Ok(views.html.newRelesesGallery(allFilmsList))
  }

  def allFilms = Action {
    Ok(views.html.allFilmsGallery(allFilmsList))
  }

  def errorPage = Action {
    Ok(views.html.errorPage())

  }

  def login = Action {
    Ok(views.html.login("Your new application is ready."))
  }



}