package controllers

import play.api._
import play.api.mvc._
import models.Users
import javax.inject.Inject
import play.api.i18n.{I18nSupport, MessagesApi}

class LoginController @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def logIn() = Action {implicit request =>
    Users.loginForm.bindFromRequest.fold({ formWithErrors =>
      BadRequest(views.html.login(formWithErrors))
    }, { login =>
      if(Users.validUsers.contains(login)) {
        Redirect("/").withSession("login" -> "true")
      }
      else{
        Redirect("/login")
      }
    })
  }
}
