package models

import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._

import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

case class UsersSignUp(uName: String, pWord: String ,postCode: String,houseNo: String)
object UsersSignUp{
  val signUpForm = Form (
    mapping(
      "name" -> nonEmptyText,
      "password" -> nonEmptyText,
      "postcode" -> nonEmptyText,
      "house_no" -> nonEmptyText
    )(UsersSignUp.apply)(UsersSignUp.unapply)
  )
}
