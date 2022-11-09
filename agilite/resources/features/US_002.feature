# Author: Sylvain THOR, Erwan MOALIC

@tag
Feature: US_002 Déplacer le marque page

    En tant que lecteur,
    Je souhaite utiliser un marque page de sorte à sauvegarder
    la page du livre de mon choix.

    Scenario Outline: Placer le marque page
    Given Le livre <livre>
    And qui est placé à la page <pageinitiale>
    When le lecteur décide de le placer à la page <pagechoisie>
    Then la page <pagefinale> où est le marque page doit être automatiquement mise à jour.

    Examples:
    | livre                   | pageinitiale  | pagechoisie   | pagefinale    |
    | "Power of habits"     | 45            | 78            | 78            |
    | "The compound effect" | 0             | 112           | 112           |
    | "1984"                | 201           | 266           | 266           |
