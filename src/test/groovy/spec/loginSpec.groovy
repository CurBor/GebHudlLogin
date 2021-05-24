package spec

import geb.spock.GebSpec
import page.homePage
import page.loginPage
import page.userHomePage
import page.organizationLoginPage


class loginSpec extends GebSpec {

    def "Navigate to login"(){
        when:
        to homePage
        loginButton.click()

        then:
        at loginPage
    }

    def "Log In using form"(){
        when:
        to loginPage
        println System.getProperties()
        formFill()
        logInButton.click()

        then:
        at userHomePage

        when:
        interact {
            moveToElement(userDropDown)
            moveToElement(userEmail)
        }

        //checking login name
        then:
        userEmail.text() == getUser()
    }

    def "Remember me check"(){
        when:
        to loginPage
        formFill()
        interact {
            moveToElement(rememberMe)
            click()
        }
        logInButton.click()

        and:
        at userHomePage
        go(baseUrl+"logout")
        at homePage

        and:
        to loginPage

        then:
        email == info.username
    }

    def "Check wrong password"(){
        when:
        to loginPage
        formFill()
        password = info.username + "1"
        logInButton.click()

        then:
        waitFor {needHelp.displayed}
    }

    def "Check organization log in link" () {
        when:
        to loginPage
        logInOrganization.click()

        then:
        waitFor {at organizationLoginPage}
    }
}
