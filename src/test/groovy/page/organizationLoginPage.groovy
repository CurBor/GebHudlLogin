package page

import module.userInfoModule

class organizationLoginPage extends geb.Page{
    static url = "login/organization/"

    static at = {title.startsWith("Log In with Organization - Hudl")}

    static content = {
        email { $(".uni-input") }
        info {module module.userInfoModule}
    }
}
