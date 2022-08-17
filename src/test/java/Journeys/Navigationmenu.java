package Journeys;

import BaseclassFramework.Baseclass;
import Pageobjects.TC3_Navigationmenu;
import org.testng.annotations.Test;

public class Navigationmenu extends Baseclass {

    @Test

    public void TestScenario_3() throws Exception {
        TC3_Navigationmenu.Navigationmenu_WomenTab();
        TC3_Navigationmenu.Navigationmenu_DressTab();
        TC3_Navigationmenu.Navigationmenu_EveingDressTab();


    }
}
