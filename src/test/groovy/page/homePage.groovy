package page

import geb.Page

class homePage extends Page{
    static url = ""

    static at = {title.startsWith("Hudl: We Help Teams and Athletes Win")}

    static content = {
        loginButton { $(".login").not(".mobile-login")}
        info {module module.userInfoModule}
    }

}
