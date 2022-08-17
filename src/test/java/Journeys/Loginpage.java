package Journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC1_Loginpage;
import org.testng.annotations.Test;

public class Loginpage extends Baseclass {



        @Test
        public void Testscenario_1() throws Exception {
            TC1_Loginpage.SignInButton();
            Thread.sleep(5000);
            TC1_Loginpage.UserSignInButton();


        }
    }
