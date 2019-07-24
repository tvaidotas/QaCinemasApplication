package models

import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

case class UsersSignUp(fName: String, lName: String,uName: String, email: String , pWord: String ,postCode: String,houseNo: String)
object UsersSignUp{
  val signUpForm = Form (
    mapping(
      "fName" -> nonEmptyText,
      "lName" -> nonEmptyText,
      "uName" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText,
      "postcode" -> nonEmptyText,
      "address" -> nonEmptyText
    )(UsersSignUp.apply)(UsersSignUp.unapply)
  )
}
