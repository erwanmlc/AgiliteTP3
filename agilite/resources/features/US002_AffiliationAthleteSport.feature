#Author: IBOUDA & OURAGHENE

@tag
Feature: USOO2 Affiliation d un athlete a un sport
  En tant qu utilisateur, je veux pouvoir associer un athlete a un sport 
  Afin de m assurer qu il pratique bien un seul et unique sport a la fois


  @tag1
  Scenario Outline: association a un sport d un athlete pratiquant déja un autre sport
    Given Un sport <sport> compose d une liste d athletes pratiquant ce sport
    When J associe un athlete <nom> a ce sport alors qu il pratique déja un autre <sport1>
    Then Le système refuse d ajouter l athlete a la liste du sport avec le message <messageErreur>
    
    Examples: 
      |  sport	   |		  nom 		 |		sport1		|				ListAthletes	  	 |												messageErreur				  |
      |	  Futsal 	 |    Asterix    |		Five		  | 				Obelix					 |			"This athlete already play a sport !"		|


  @tag2
  Scenario Outline: association a un sport d un athlete ne pratiquant actuellement aucun sport    
    Given Un sport <sport> compose d une liste d athletes pratiquant ce sport
    When J associe l athlete <nom> au sport <sport> 
    Then L athlete s appelant <nom> fait dorenavent partis de la liste d athletes du sport <sport>

    Examples: 
      |	 sport 		      |		ListAthletes   |  		nom 		 |			ListAthletes	    |
      |  Tennis simple  |   Charles			   |    Mohammed   | 		Charles, Mohammed	  |
