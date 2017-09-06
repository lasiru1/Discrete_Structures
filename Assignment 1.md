# Assignment 1
Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
08/28/2017


## &#35;35

### Prompt:

<img src="https://i.imgur.com/9Dt4nNT.png" width="600" />

### Solution:

```
let A = (x < 5.0), B = (2x < 10.7), and C = (sqrt(5x) > 5.1)

Conditional expression:

        (A ^ B) v C
        
all of the inputs cause the expression to be true except for 5.1, which results in
F v F = F.

Output:

1.0 2.4 7.2 5.3
```

## &#35;37 & 38

### Prompt:

<img src="https://i.imgur.com/LfBVFtk.png" width="700" />


### Solution:

```
#37:

let A = (Value1 < Value2), B = not even;

(A v B)' v (A' ^ B) <=> (A' ^ B') v (A' ^ B)
                    <=> A' ^ (B' v B)
                    <=> A' ^ 1
                    <=> A'
```
```
#38:

Consider scenario 1: A = False, B = False, and C = True;

then the conditional expression

        (A ^ B)' ^ C
        
will be true, executing statement1. However, condsider scenario 2:

A = True, B = False, and C = True;

statement1 will still execute. Therefore, the program does NOT do what we want
because statement2 did not execute when scenario 2 was presented.
```

## &#35;61 - 64

### Prompt:

<img src="https://i.imgur.com/9GX0BS7.png" width="700" />

### Solution:

```
#61:

Percival is a truth teller.
Llewellyn is a liar.

Percival's statement, "At least one of us is a liar", can be translated into a wff:

        T v F
        
which is true. Since truthtellers can only tell the truth, Percival must be a
truth teller and Llewellyn must be a liar.
```
```
#62

Merlin is a truth teller.
Meredith is a truth teller.

Merlin's statement, "If I am a truth teller, than Meredith is a truth teller", can be
translated to the following wff:

        T -> T
        
which is true. Since truthtellers can only tell the truth, Mewrlin and Meredith must
both be truth tellers.
```
```
#63

Rothwold is a truth teller.
Grymlin is a truth teller.

Rothwold's statement, "Either I am a liar or Grymlin is a truth teller", as a wff:

        F v T
        
is true. Rothwold is therfore a truth teller, and because he said "either", Grymlin
must be a truth teller.
```
```
#64

Gwendolyn is a liar.
Merrilaine is a liar.

Gendolyn's statement, "I am a liar but Merrilaine is not", as a wff:

        F ^ F'
        
is a contradiction (always false), therefore Gendolyn is a liar. Since Gendolyn
is a liar, Merilaine must be the opposite of what Gendolyn stated. Since he said she
was not a liar, Merilaine must be a liar.
```

End Assignment 1














