#Author: IBOUDA & OURAGHENE

@tag
Feature: USOO1 Changement du sport d athlete
  En tant qu utilisateur, je veux supprimer le sport actuel auquel est associe un athlete
  Afin de pouvoir mettre à jour le sport pratiquer par l athlete

  @tag1
  Scenario: suppression du sport deja affilie a un athlete
    Given Un athlete pratiquant un sport
    When Je supprime le sport actuel de l athlete
    Then L athlete ne pratiquera plus de sport


  @tag2
  Scenario Outline: suppression du sport a un athlete qui ne pratique deja plus de sport
    Given Un athlete <nom> ne pratiquant aucun <sport>
    When Je supprime le sport actuel de l athlete
    Then Le systeme refuse avec le <messageErreur>
    
    Examples: 
      | name  | 		sport   |  sport  |										messageErreur										|
      | Yanis |    	null 		|   null  |		This athlete does not already play any sport !  |
