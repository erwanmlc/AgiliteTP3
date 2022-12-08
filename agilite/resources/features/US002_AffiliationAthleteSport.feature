#Author: IBOUDA & OURAGHENE

@tag
Feature: USOO2 Affiliation d un athlète à un sport
  En tant qu utilisateur, je veux pouvoir associer un athlète à un sport 
  Afin de m assurer qu il pratique bien un seul et unique sport à la fois


  @tag1
  Scenario Outline: association à un sport d un athlète pratiquant déjà un autre sport
    Given Le sport <sport> est composé d une liste d athlètes <ListAthletes> pratiquant ce sport
    When L athlète <athlete> est associé au sport <sport> alors qu il pratique déjà un autre sport : <sport1>
    Then Le système refuse d ajouter l athlète à la liste du second sport avec un message d erreur
    
    Examples: 
      |   sport     |		  athlete 		 |		sport1		|				ListAthletes	  		 |
      |	  Futsal    |    	Astérix   	 |		Tennis		| 			Charles							 |


  @tag2
  Scenario Outline: association à un sport d un athlète ne pratiquant actuellement aucun sport    
    Given Le sport : <sport> est composé d une liste d athlètes <ListAthletes> pratiquant ce sport
    When <athlete> est associé au sport suivant : <sport> 
    Then <athlete> fait dorénavent partis de la liste d athletes du sport : <sport>

    Examples: 
      |	 			  sport 					 |		ListAthletes   	|  		athlete 		 |
      |  				Five 					   |   	Yanis				    |   	Mohammed  	 |
      |  Football traditionnel 	 |   	Hakim				 	 	|  	  Ziyech	 	   |
