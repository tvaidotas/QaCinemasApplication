package controllers

import javax.inject.Inject
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import models.UsersSignUp
import models.Users

class SignUpController @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def signUp() = Action {implicit request =>
    UsersSignUp.signUpForm.bindFromRequest.fold({ formWithErrors =>
      BadRequest(views.html.signUp(formWithErrors))
    }, {signup =>
      if(Users.UsedUserNames.contains(signup.uName)) {
        println("USERNAME USED")
        Redirect("/signup")
      }
      else{
        println(Users.UsedUserNames)
        println(signup.uName)
        //TODO Add user to DB and login or redirect to login
        Redirect("/").withSession("name" -> s"${signup.uName}")
      }
    })
  }
}
