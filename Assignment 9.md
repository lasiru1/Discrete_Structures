# Assignment 9

Uriel Salazar  
Mr. Wilson  
Computer Information Systems 7  
10/02/2017

## &#35;1

### Prompt:

Prove by induction that 1 + 5 + 9 + ... + (4n-3) = n(2n-1).

### Solution:

```
Base Case: Assume n = 1,

1 = 1(2(1)-1)
1 = 1(2-1)
1 = 1(1)
1 = 1       Base Case is true.

Inductive Hypothesis: Assume true for k,
1 + 5 + 9 + ... + (4k-3) = k(2k-1)

If true for k, then it is true for k + 1,
1 + 5 + 9 + ... + (4k-3) + (4(k+1)-3)
= k(2k-1) + (4(k+1)-3)
= k(2k-1) + (4k + 4 - 3)
= k(2k-1) + 4k + 1
= 2k² - k + 4k + 1
= 2k² + 3k + 1
= 2k² + 2k + k + 1
= 2k(k+1) + (k+1)
= (k+1)[2k + 1)
= (k+1)[2(k+1) - 1]

We have proven that if k is true, then (k+1) is also true.
We have also proven that the base case is true,
therefore, 1 + 5 + 9 + ... + (4n-3) = n(2n-1) is true for all positive integers n.
```

## &#35;2

### Prompt:

Prove that for any positive integer number n, n^3 + 2n is divisible by 3.

### Solution:

```
Base Case: Assume n = 1,

(1)³ + 2(1)
= 1 + 2
= 3         3 | 3, Base case is true.

Inductive Hypothesis: Assume true for n = k,
3 | k³ + 2k.

If true for k, then it is true for k + 1,
Let k³ + 2k = 3m, where m is an integer,
(k+1)³ + 2(k+1)
= (k² + 2k + 1)(k+1) + 2(k+1)
= k³ + 2k² + k + k² + 2k + 1 + 2k + 2
= (k³ + 2k) + 3k² + 3k + 3
= 3m + 3k² + 3k + 3
= 3(m + k² + k + 1), where m+k²+k+1 is an integer.

We have proven that if k is true, then (k+1) is also true.
We have also proven that the base case is true,
therefore, 3 | n³ + 2n for any positive integer n.
```

## &#35;3

### Prompt:

Prove that for n >= 1, 9^n − 1 is divisible by 8 for all non-negative integers.

### Solution:

```
Base Case: Assume n = 1,

9¹ - 1
= 9 - 1
= 8         8 | 8, Base case is true.

Inductive Hypothesis: Assume true for k,
8 | 9^k - 1.

If true for k, then it is true for k + 1.
Let (9^k - 1) / 8 = m, where m is an integer,
=> 9^k = 8m + 1,
9^(k + 1) - 1
= 9(9^k - 1)
= 9[8m + 1] - 1
= 9(8m) + 9 - 1
= 9(8m) + 8
= 8(9m + 1), where 9m+1 is an integer.

We have proven that if k is true, then (k+1) is also true.
We have also proven that the base case is true,
therefore, for n>=1, 8 | 9^k - 1 for all non-negative integers.
```


End Assignment 9