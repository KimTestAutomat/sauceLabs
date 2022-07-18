@page
Feature: Exercice SauceLabs -Tests
  Je souhaite effectuer une série de tests sur l'application SauceLabs

  Scenario: Exercice SauceLabs - Tests
    Given Je me connecte sur application SauceLabs
    Then Je vérifie affichage du bouton Continue as dans le modal gmail
    And Je vérifie que le chat robot  affiche
    And Je vérifie que "COMPANY NEWS Sauce Labs Acquires Backtrace Company extends continuous testing and improvement capabilities into production environments with acquisition of Backtrace." affiche
    And Je vérifie que "LabCorp" affiche
    And Je vérifie que les icones facebook,twitter et linkedin sont affichés et clickables
