package models
import play.api.data._
import play.api.data.Forms._
import reactivemongo.bson.{BSONDocumentReader, Macros}

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

  def checkUser(username: String) = {
    Some(validUsers.filter(user => user.uName == username).head)
  }

  implicit val reader: BSONDocumentReader[Users] = Macros.reader[Users]
}
