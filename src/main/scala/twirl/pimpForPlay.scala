package twirl

object pimpForPlay {
  implicit def implicitHtml(twirlHtml:play.twirl.api.HtmlFormat.Appendable) = new play.api.templates.Html(twirlHtml.body)


  implicit def implicitFieldConstructorFunction( f:views.html.helper.FieldElements => play.twirl.api.HtmlFormat.Appendable):views.html.helper.FieldElements => play.api.templates.Html = {
    (e:views.html.helper.FieldElements) => f(e)
  }
}
