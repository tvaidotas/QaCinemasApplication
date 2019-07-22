package authentication

import models.Users
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future

object AuthenticatedAction extends ActionBuilder[AuthenticatedRequest] {

  def invokeBlock[A](request: Request[A], block: AuthenticatedRequest[A] => Future[Result]): Future[Result] = {

    request.session.get("name")
      .flatMap(user => Users.checkUser(user))
      .map(user => block(new AuthenticatedRequest[A](user.uName,request)))
      .getOrElse(Future.successful(Redirect("/login")))
  }

}
