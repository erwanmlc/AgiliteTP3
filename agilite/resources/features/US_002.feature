# Author: Sylvain THOR, Erwan MOALIC

@tag
Feature: US_002 Déplacer le marque page

    En tant que lecteur,
    Je souhaite utiliser un marque page de sorte à sauvegarder
    la page de l'encyclopedie de mon choix.

    Scenario Outline: Placer le marque page
    Given L'encyclopedie <livre>
    And qui est place a la page <pageinitiale>
    When le lecteur decide de le placer a la page <pagechoisie>
    Then la page <pagefinale> ou est le marque page doit etre automatiquement mise a jour.

    Examples:
    | livre                 | pageinitiale  | pagechoisie   | pagefinale    |
    | "Power of habits"     | 45            | 78            | 78            |
    | "The compound effect" | 0             | 112           | 112           |
    | "1984"                | 201           | 266           | 266           |
