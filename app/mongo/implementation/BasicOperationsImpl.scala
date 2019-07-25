package mongo.implementation

import mongo.helpers.Constants
import mongo.service.{BasicOperations, DBConnection}

import scala.util.{Failure, Success}
import reactivemongo.bson.BSONDocument
import mongo.service.DBConnection
import org.mongodb.scala.result
import scala.concurrent.duration._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global

object BasicOperationsImpl extends DBConnection with BasicOperations {

  def removeDocument(document: BSONDocument, collectionName: String, dbName: String): Unit = {
    getCollection(collectionName, dbName).delete[BSONDocument](ordered = false).one(document) onComplete {
      case Failure(e) => println(e.printStackTrace())
      case Success(writeResult) =>
        println(Constants.removedDocument.toString + writeResult.ok)
    }
  }

  def removeDocuments(documents: Seq[BSONDocument], collectionName: String, dbName: String): Unit = {
    documents.foreach(doc => removeDocument(doc, collectionName, dbName))
  }

  def insertDocument(document: BSONDocument, collectionName: String, dbName: String): Unit = {
    getCollection(collectionName, dbName).insert(document) onComplete {
      case Failure(e) => println(e.printStackTrace())
      case Success(writeResult) =>
        println(Constants.insertedDocument.toString + writeResult.ok)
    }
  }

  def insertDocuments(documents: Seq[BSONDocument], collectionName: String, dbName: String): Unit = {
    documents.foreach(doc => insertDocument(doc, collectionName, dbName))
  }

  def findUserByName(document: BSONDocument, collectionName: String, dbName: String): Boolean = {
    val res = Await.result(getCollection(collectionName, dbName).find(document).one[BSONDocument], 1.seconds)
    if(res.isDefined) {
      true
    }
    else {
      false
    }
  }
}
