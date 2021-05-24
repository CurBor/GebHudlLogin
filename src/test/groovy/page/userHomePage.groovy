package page

import module.userInfoModule

class userHomePage extends geb.Page{

    static atCheckWaiting = true

    static url = "home/"

    static at = {title.startsWith("Home - Hudl")}

    static content = {
        userDropDown {$(".hui-globalusermenu")}
        userEmail(required: false) {$(".hui-globaluseritem__email")}
        userLogOut(required: false) {$("a[data-qa-id='webnav-usermenu-logout']")}
        info {module userInfoModule}
    }

    def getUser() {
        info.username
    }
}
