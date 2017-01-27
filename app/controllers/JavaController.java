package controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;


@Singleton
public class JavaController extends Controller {

    @Inject
    public JavaController() {
    }

    public Result sayHello() {
        Form<Object> helloForm = Form.form(Object.class).bindFromRequest();
        if (helloForm.hasErrors()) {
            return badRequest();
        } else {
            String name = helloForm.data().get("name");
            return ok(views.html.hellooutput.render(name));
        }
    }
}
