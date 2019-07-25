package models

class Film (id: Int, title: String, description: String, rating: String, posterUrl: String, releaseDate: String, mainActors: List[String]) {
  def getId(): Int = id
  def getTitle(): String = title
  def getDescription(): String = description
  def getPosterUrl(): String = posterUrl
  def getRating(): String = rating
  def getReleaseDate(): String = releaseDate
  def getMainActors(): List[String] = mainActors
}