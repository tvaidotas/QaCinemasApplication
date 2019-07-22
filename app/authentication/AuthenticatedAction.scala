package authentication

import models.Users
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future

object AuthenticatedAction extends ActionBuilder[AuthenticatedRequest] {

  def invokeBlock[A](request: Request[A], block: AuthenticatedRequest[A] => Future[Result]): Future[Result] = {

    request.session.get("name")
      .flatMap(user => Users.checkUser(user)) // get the optional user if the name is valid
      .map(user => block(new AuthenticatedRequest[A](user.uName,request))) // if we found the user we're all good
      .getOrElse(Future.successful(Redirect("/login"))) // we haven't found the user
  }

}
