package models

class Film (title: String, description: String, rating: String, posterUrl: String) {
  def getTitle(): String = title
  def getDescription(): String = description
  def getPosterUrl(): String = posterUrl
  def getRating(): String = rating
}