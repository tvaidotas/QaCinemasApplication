package implementation

import helpers.Constants
import service.BasicOperations

import scala.util.{Failure, Success}
import reactivemongo.bson.BSONDocument
import service.DBConnection

import scala.concurrent.ExecutionContext.Implicits.global

object BasicOperationsImpl extends DBConnection with BasicOperations {

  def removeDocument(document: BSONDocument, collectionName: String, dbName: String): Unit = {
    getCollection(collectionName, dbName).delete[BSONDocument](ordered = false).one(document) onComplete {
      case Failure(e) => println(e.printStackTrace())
      case Success(writeResult) =>
        println(Constants.removedDocument.toString + writeResult.ok)
        closeConnection()
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
        closeConnection()
    }
  }

  def insertDocuments(documents: Seq[BSONDocument], collectionName: String, dbName: String): Unit = {
    documents.foreach(doc => insertDocument(doc, collectionName, dbName))
  }

}
