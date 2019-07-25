package mongo.service

import reactivemongo.bson.BSONDocument

trait BasicOperations {

  def removeDocument(document: BSONDocument, collectionName: String, dbName: String): Unit

  def removeDocuments(document: Seq[BSONDocument], collectionName: String, dbName: String): Unit

  def insertDocument(document: BSONDocument, collectionName: String, dbName: String): Unit

  def insertDocuments(document: Seq[BSONDocument], collectionName: String, dbName: String): Unit

  def findUserByName(document: BSONDocument, collectionName: String, dbName: String): Boolean

}
