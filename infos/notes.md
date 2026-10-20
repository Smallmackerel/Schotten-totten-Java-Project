## Package model :
```java
class Joueur :
    String nom
    int role (North, South)
    bool type (IA, humain)
    ArrayList<Carte> cartePossedees

class JoueurReel : (extend Joueur)

class IA : (extend Joueur)
    int niveau (Easy, Medium, Hard)

class Carte :
    String description
    bool is_tactic

class CarteClan : (extend Carte)
    int valeur
    String couleur

class CarteTactique : (extend Carte)
    String nom

class Borne :
    Joueur prise 
    int numero (1 to 9)
    ArrayList<Carte> North
    ArrayList<Carte> South
    ArrayList<CarteTactique> onTile
```

On n'oubliera pas le mode de Jeu Tactique ou non.

`JeuFactory` : 
- crée les piles
- instancie les joueurs
- distribue les cartes


Pile Tactique : n cartes restantes
Pile Clan : n cartes restantes 

Main joueur 1 (NORTH) : 6R 9B 8V 4R 7B 9V
Main joueur 2 (SOUTH) : 5R 8B 7V 3R 6B 4V


NORTH

:   :    :    :    :    :     :    :    :    :

|    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |
  ==   ==   ==   ==   ==   ==   ==   ==   == 
|    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |
|    |    |    |    |    |    |    |    |    |

SOUTH
