package models
import play.api.data._
import play.api.data.Forms._
import scala.collection.mutable.ArrayBuffer

case class Users(uName: String, pWord: String)
object Users{
  val loginForm = Form (
    mapping(
      "name" -> nonEmptyText,
      "password" -> nonEmptyText
    )(Users.apply)(Users.unapply)
  )
  val validUsers = ArrayBuffer[Users](
    Users("admin", "admin"),
    Users("pleb", "plebian")
  )
}
