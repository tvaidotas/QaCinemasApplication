import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.mvc._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification{

  val urlStart = "http://localhost:"

  "Application" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000")
      browser.pageSource must contain("QA Cinema")
    }
  }

  "find a film" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/allfilms")
      browser.pageSource must contain("QA Cinema")
    }
  }

  "about us" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/aboutus")
      browser.pageSource must contain("QA Cinema")
    }
  }

  "contact us" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/contactus")
      browser.pageSource must contain("Login")
    }
  }

  "contact us" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/contactus")
//      add cookie ("name", "admin")
//      cookie("cookie_name").value should be ("cookie_value")
//      reloadPage()
      browser.pageSource must contain("Login")
    }
  }

  "login" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/login")
      browser.pageSource must contain("Login")
    }
  }

  "signup" should {
    "work from within a browser" in new WithBrowser {
      browser.goTo(urlStart+"9000/signup")
      browser.pageSource must contain("SignUp")
    }
  }
}
