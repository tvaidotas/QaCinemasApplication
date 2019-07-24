package models
import play.api.data._
import play.api.data.Forms._

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

case class Users(uName: String, pWord: String)
object Users{
  val loginForm = Form (
    mapping(
      "email" -> nonEmptyText,
      "password" -> nonEmptyText
    )(Users.apply)(Users.unapply)
  )

  var validUsers = ArrayBuffer[Users](
    Users("admin", "admin"),
    Users("pleb", "plebian")
  )

  var UsedUserNames = List[String]("admin", "pleb")

  def checkUser(username: String) = {
    Some(validUsers.filter(user => user.uName == username).head)
  }
}
