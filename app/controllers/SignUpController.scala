package controllers

import javax.inject.Inject
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import models.{UserRoles, Users, UsersSignUp}

class SignUpController @Inject()(val messagesApi: MessagesApi, environment: play.api.Environment) extends Controller with I18nSupport {

  def signUp() = Action {implicit request =>
    UsersSignUp.signUpForm.bindFromRequest.fold({ formWithErrors =>
      BadRequest(views.html.signUp(formWithErrors))
    }, {signup =>
      if(Users.validUsers.map(_.uName).contains(signup.email)) {
        println("USERNAME USED")
        Redirect("/signup")
      }
      else{
        println(Users.validUsers.map(_.uName))
        println(signup.email)
        //TODO Add user to DB and redirect to login
        Users.validUsers = Users.validUsers :+ Users(signup.email ,signup.pWord)
        UserRoles.validUsers = UserRoles.validUsers :+ UserRoles(signup.email, "regular")
        println(Users.validUsers)
        Redirect("/login")
      }
    })
  }
}
