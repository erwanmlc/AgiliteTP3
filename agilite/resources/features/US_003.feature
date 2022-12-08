# Author: Sylvain THOR, Erwan MOALIC

@tag
Feature: US_003 Ajouter un livre a la bibliotheque

    En tant que bibliothecaire,
    Je souhaite enregistrer un livre de sport dans la bibliotheque
    Puis consulter la description du sport en question

    Scenario Outline: Ajout livre de sport dans la bibliotheque
    Given Un <sport>
    And  on cree un <livre> portant sur ce sport
    When lorsqu'on l'ajoute a la bibliotheque
    Then la description doit etre <description>

    Examples:
        | livre                     | sport                   | description                                                                |
        | "Le foot pour les nuls"   | "Football traditionnel" | "11 contre 11 avec un ballon, il faut marquer le plus de but pour gagner." |
        | "Le futsal pour les nuls" | "Futsal"                | "11 contre 11 avec un ballon, il faut marquer le plus de but pour gagner." |
