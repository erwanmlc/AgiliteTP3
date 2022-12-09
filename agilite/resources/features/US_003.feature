# Author: Sylvain THOR, Erwan MOALIC

@tag
Feature: US_003 Ajouter une Encyclopedie sur le Football a la bibliotheque

    En tant que bibliothecaire,
    Je souhaite enregistrer un livre de sport dans la bibliotheque
    Puis consulter la description du sport en question

    Scenario Outline: Ajout Encyclopedie sur le Football dans la bibliotheque
    Given Un <sport>
    And  on cree un <livre> portant sur ce sport
    When lorsqu'on l'ajoute a la bibliotheque
    Then la description doit etre <description>

    Examples:
        | livre                     | sport                   | description                                                             |
        | "Le foot pour les nuls"   | "Football traditionnel" | "2 equipes avec un ballon, il faut marquer le plus de but pour gagner." |
        | "Le futsal pour les nuls" | "Futsal"                | "2 equipes avec un ballon, il faut marquer le plus de but pour gagner." |
        | "Le Z5 de Zidane"         | "Five"                  | "2 equipes avec un ballon, il faut marquer le plus de but pour gagner." |
