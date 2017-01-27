package controllers

import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._


case class HelloForm(name: String)

class Application extends Controller {

  private val helloForm: Form[HelloForm] = Form (
    mapping("name" -> text) (HelloForm.apply)(HelloForm.unapply)
  )

  def index = Action {
    Ok(views.html.helloinput(form = helloForm))
  }
}