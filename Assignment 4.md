# Assignment 4
Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
09/10/2017

## &#35;1

### Problem:

Show that p -> q and q' -> p' are logically equivalent without using truth tables or a "contrapositive" law (don't assume they are true).

### Solution:

```
q' -> p' <=> (q')' v p'   Implication
         <=> q v p'       Double Negation
         <=> p' v q       Commutative
         <=> p -> q       Implication
```

## &#35;2

### Problem:

Show that (p -> r) ^ (q -> r) <=> (p v q) -> r

### Solution:

```
(p -> r) ^ (q -> r) <=> (p' v r) ^ (q' v r)   Implication
                    <=> (r v p') ^ (r v q')   Commutative
                    <=> r v (p' ^ q')         Distributive (Factor)
                    <=> (p' ^ q') v r         Commutative
                    <=> (p v q)' v r          DeMorgan
                    <=> (p v q) -> r          Implication
```

## &#35;3

### Problem:

Come up with 2 more questions like the ones above. Incorporate the logic laws we discussed in class.

### Solution:

```
```