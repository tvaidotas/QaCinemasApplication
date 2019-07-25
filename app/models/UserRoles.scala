package models

import scala.collection.mutable.ArrayBuffer

case class UserRoles(user: String, role: String)
object UserRoles{
  var validUsers = ArrayBuffer(
    UserRoles("admin", "admin"),
    UserRoles("pleb", "regular")
  )
}
