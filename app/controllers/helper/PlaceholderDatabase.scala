package controllers

import models.Film
import play.api._
import play.api.mvc._

object PlaceholderDatabase {
  val allFilmsList :List[Film] = List[Film](
    new Film("Jaws 3D", "Shark danger film", "18", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Robots", "child robot film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Gran Torino", "grump old man", "16", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Finding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Finding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Finding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film("Finding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg")
  )
}