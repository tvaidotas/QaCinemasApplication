package helpers

import mongo.implementation.BasicOperationsImpl
import play.{Application, GlobalSettings}

object Global extends GlobalSettings {
  override def onStop(app: Application): Unit = {
    BasicOperationsImpl.closeConnection()
  }
}