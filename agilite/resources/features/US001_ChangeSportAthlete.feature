#Author: IBOUDA & OURAGHENE

@tag
Feature: USOO1 Changement du sport d athlète
  En tant qu utilisateur, je veux supprimer le sport actuel auquel est associé un athlète
  Afin de pouvoir mettre à jour le sport pratiquer par l athlète

  @tag1
  Scenario Outline: suppression du sport déjà affilié à un athlète
    Given <athlete> pratique le <sport>
    When Le sport actuel de l'athlete est supprime
    Then le sport actuel de l'athlete doit etre <sportexpected>

  Examples:
      | athlete | sport    | sportexpected |
      | Charles | Football |               |


  @tag2
  Scenario Outline: suppression du sport à un athlète qui ne pratique déjà plus de sport
    Given <athlete> ne pratique aucun <sport>
    When Le sport actuel de l'athlete est supprimé 
    Then L'athlete ne pratique déjà plus de sport donc le système refuse avec un <messageErreur>
    
  Examples: 
      |  athlete  | 		sport   |										messageErreur									|
      |   Yanis   |    	    		|	This athlete does not already play any sport !  |