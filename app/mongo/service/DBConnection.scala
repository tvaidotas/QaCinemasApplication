package mongo.service

import mongo.helpers.Constants
import reactivemongo.api.{DefaultDB, MongoDriver}
import reactivemongo.api.collections.bson.BSONCollection

import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global


trait DBConnection {

  private val driver = new MongoDriver
  private val connection = driver.connection(List(Constants.localHost.toString))

  def getDB(dbName: String): DefaultDB = {
    Await.result(connection.database(dbName),10.seconds)
  }

  def getCollection(collectionName: String, dbName: String): BSONCollection =
    getDB(dbName).collection[BSONCollection](collectionName)

  def closeConnection(): Unit = {
    println("Closing connection")
    driver.close()
  }

}
