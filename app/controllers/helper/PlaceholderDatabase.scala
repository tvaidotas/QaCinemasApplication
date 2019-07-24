package controllers

import models.Film
import play.api._
import play.api.mvc._

object PlaceholderDatabase {
  val allFilmsList :List[Film] = List[Film](
    new Film(1,"Jaws 3D", "Shark danger film", "18", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(2,"Robots", "child robot film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(3,"Gran Torino", "grump old man", "16", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(4,"Finding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(5,"Dinding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(6,"Ginding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg"),
    new Film(7,"Hinding Nemo", "fish film", "U", "https://upload.wikimedia.org/wikipedia/en/c/c3/Jaws_3d.jpg")
  )
}