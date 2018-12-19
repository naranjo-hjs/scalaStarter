package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class CalcController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def sum( x: String, y: String) = Action { Ok( (x.toInt + y.toInt).toString ) }

  def sub( x: String, y: String) = Action { Ok( (x.toInt - y.toInt).toString ) }

  def mul( x: String, y: String) = Action { Ok( (x.toInt * y.toInt).toString ) }

  def div( x: String, y: String) = Action { Ok( (x.toInt / y.toInt).toString ) }

}
