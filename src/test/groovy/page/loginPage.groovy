package page

import geb.Page
import module.userInfoModule

class loginPage extends geb.Page{
    static url = "login/"

    static at = {title.startsWith("Log In - Hudl")}

    static content = {
        email { $("#email")}
        password { $("#password")}
        logInButton {$("#logIn")}
        rememberMe {$("#remember-me")}
        needHelp(required:false) {$(".login-error-container")}
        logInOrganization {$("#logInWithOrganization")}
        info {module userInfoModule}
    }

    def formFill() {
        email = info.username
        password = info.password
    }
}
