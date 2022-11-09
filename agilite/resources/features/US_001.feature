# Author: Sylvain THOR, Erwan MOALIC

@tag
Feature: US_001 Attribuer le prix Goncourt à un livre

    En tant que juge du prix Goncourt,
    Je souhaite attribuer le prix Goncourt à un livre spécifique
    et augmenter sa note (sur 20) du nombre de point(s) désiré.

    Scenario Outline: Mise à jour de la note en fonction du prix Goncourt
    Given Un livre <liv>
    And qui a une note de <note>
    When le juge attribue un prix Goncourt avec une augmentation de <points> points
    Then la nouvelle <nouvellenote> du livre doit être mise à jour automatiquement.

    Examples:
    | liv                   | note | points | nouvellenote |
    | "Les Misérables"      | 13   | 4      | 17           |
    | "Le rouge et le noir" | 15   | 1      | 16           |
    | "Gargantua"           | 11   | 9      | 20           |
