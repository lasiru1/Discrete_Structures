# Assignment 7

Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
09/10/2017

## &#35;1

### Prompt:

Prove: If n = 25, 100, or 169, then n is a perfect square and is the sum of two perfect squares. Indicate which method of proof you used.

### Solution:

```
Proof by Exhaustion:

if n = 25, 100, or 169 -> n is a perfect square and is the sum of two perfect squares.

let n = 25, 100, or 169,
let m = √n where m is an integer,
=> m = √25, √100, or √169
=> m = 5, 10, or 13
=> m² = 25, 100, or 169
=> m² = n
=> n is a perfect square by the definition of perfect squares.

n = (9 + 16), (81 + 9), or (144 + 25),
9 = 3², 16 = 4², 81 = 9², 144 = 12², and 25 = 5²
=> n is the sum of of two perfect squares.
```

## &#35;2

### Prompt:

Prove: The sum of two odd integers is even. Hint: By definition, even integers can be expressed as 2n, thus
odd integers can be expressed as 2n + 1.

### Solution:

```
Direct Proof:

let A and B be two odd integers,
Assume A + B is an even integer,
=> A = (2k₁ + 1) and B = (2k₂ + 1), where k₁ and k₂ are integers,
=> A + B = 2k₁ + 1 + 2k₂ + 1 by Associative property,
=> A + B = 2k₁ + 2k₂ + 1 + 1 by Commutative property,
=> A + B = 2(k₁ + k₂) + 2,
let k₁ + k₂ = m,
=> A + B = 2m + 2,
=> A = B = 2(m + 1),
let m + 1 = n,
=> A + B = 2n
=> A + B is even by the defintion of even integers,
=> the sum of two odd integers is even.
```

## &#35;3

### Prompt:

Prove: The sum of an even integer and it's square is even.

### Solution:

```
Direct Proof:

let A be an even integer,
=> A = 2k + 1, where k is an integer,
=> A + A² = (2k + 1) + (2k + 1)²
=> A + A² = 2k + 1 + (4k² + 4k + 1)
=> A + A² = 4k² + 6k + 2
=> A + A² = (2k + 1)(2k + 2)
=> A + A² = (2k + 1) ⋅ 2(k + 1)
let (2k + 1) = n₁, where n₁ is an even integer by the definition of even integers,
let (k + 1) = n₂,
=> 2n₂ is an even integer by the defintion of even integers,
=> A + A² = n₁ ⋅ 2n₂
=> A + A² is even by the defintion of the product of even integers,
=> the sum of an even integer and its sqaure is even.
```

## &#35;4

### Prompt:

Prove by Contradiction: If n squared is odd, then n is odd.

### Solution:

```
Proof by Contradiction:

let n be an integer,
assume n² is odd, but n is even,
=> n = 2k, where k is an integer,
=> n² = (2k)²
=> n² = 4k²
=> n² = 2(2k²)
let 2k² = m,
=> n² = 2m
=> n² is an even by the definition of even integers,
this is a contradiction, n² is supposed to be odd,
the original assumption is false,
=> if n² is odd, then n must be odd as well.
```

End Assignment 7