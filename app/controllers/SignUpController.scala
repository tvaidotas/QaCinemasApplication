package controllers

import javax.inject.Inject
import models.UsersSignUp
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._

class SignUpController @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def signUp() = Action {implicit request =>
    UsersSignUp.signUpForm.bindFromRequest.fold({ formWithErrors =>
      BadRequest(views.html.signUp(formWithErrors))
    }, { signUp =>
      if(UsersSignUp.validUsers.contains(signUp)) {
        Redirect("/").withSession("name" -> s"${signUp.uName}")
      }
      else{
        //TODO Add user to DB and login or redirect to login
        Redirect("/login")
      }
    })
  }
}