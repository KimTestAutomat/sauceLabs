package com.suacelabs.automation.stepDefinitions;

import java.io.IOException;

import com.suacelabs.automation.utils.CommonUtils;

import io.cucumber.java.en.*;

public class SauceLabsStepDefinition {
	
	CommonUtils commonUtilsObject;
	public SauceLabsStepDefinition() {
		this.commonUtilsObject = new CommonUtils();
	}
	

	@Given("Je me connecte sur application SauceLabs")
	public void jeMeConnecteSurApplicationSauceLabs() throws IOException {
		commonUtilsObject.getUrl("url");
		
	  
	}
	@Then("Je vérifie affichage du bouton Continue as dans le modal gmail")
	public void jeVérifieAffichageDuBoutonContinueAsDansLeModalGmail() {
	   
	}
	@Then("Je vérifie que le chat robot  affiche")
	public void jeVérifieQueLeChatRobotAffiche() {
	    
	}
	@Then("Je vérifie que {string} affiche")
	public void jeVérifieQueAffiche(String string) {
	    
	}
	@Then("Je vérifie que les icones facebook,twitter et linkedin sont affichés et clickables")
	public void jeVérifieQueLesIconesFacebookTwitterEtLinkedinSontAffichésEtClickables() {
	   
	}




}
