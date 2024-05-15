package Tests;

import org.example.BuildYourBundlePage;
import org.example.HomePage;
import org.testng.annotations.Test;

public class BuildYourBundleTest extends TestBase{
  HomePage homePage;
  BuildYourBundlePage buildYourBundlePage;

  @Test
  public void buildBundle() throws InterruptedException {
      homePage = new HomePage(driver);
      homePage.clickBuildYourBundle();

      buildYourBundlePage = new BuildYourBundlePage(driver);
      buildYourBundlePage.sendKeysMotherBoard("ASUS INTEL-PRIME B760M-K D4/LGA1700,B760,USB3.2 GE .");
      buildYourBundlePage.sendKeysCPU("CPU-Intel-Core i5-11400F 6 Core/12 Threads 2.6 GHz (4.4 GHz Turbo) Socket LGA 1200 Processor");
      buildYourBundlePage.sendKeysRAM("RAM G.Skill  Aegis 8GB  DDR4 3000 Cl16 ");
      buildYourBundlePage.sendKeysSSD("SAMSUNG 870 EVO 250GB SATA III SSD");
      buildYourBundlePage.sendKeysHDD("WD Blue 1TB SATA 6 Gb/s 7200 RPM 64MB Cache 3.5 Inch Desktop Hard Drive");
      buildYourBundlePage.sendKeysVGA("\tXFX SPEEDSTER SWFT 210 AMD RADEON™ RX 6650 XT CORE GAMING GRAPHICS CARD WITH 8GB GDDR6, AMD RDNA™ 2");
      buildYourBundlePage.sendKeysCASE("\tCASE-COOLER MASTER CMP 520 3FANS ARGB+Power 600W Elite V3");
      buildYourBundlePage.sendKeysPowerSupply("EVGA SuperNOVA T2 series");
      buildYourBundlePage.sendKeysPowerPcCooling("ANTEC Air Cooling A30 PRO");
      buildYourBundlePage.sendKeysMonitor("SAMSUNG 27inch LF27T350FHMXEG LED IPS-FHD-75HZ Monitor LF27T350FHMXEG");
      buildYourBundlePage.sendKeysPowerHeadphone("SADES Headset for PC SADES R1 7.1 Virtual Surround Sound Stereo Orange");
      buildYourBundlePage.sendKeysKeyboard("KEYBOARD AULA MECHANCAIL SI 2056 BLACK/BLACK BLUE RAINBOW");
      buildYourBundlePage.sendKeysMouse("MOUSE LGC CMU02 WIRELESS");

      buildYourBundlePage.clickBuyNow();

      Thread.sleep(3000);


  }
}
