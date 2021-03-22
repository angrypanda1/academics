# Binomial Problems Using Two Methods

1. Let $X$ be a binomial random variable with $n = 20$ and $p=.3$. 

   1. Write the expression for $P(x = 6)$ in terms of the formula 

   $$
   {{n}\choose{x}}(p)^x(1-p)^{n-x}
   $$

   ​		then evaluate it using your calculator. 
   $$
   {20 \choose 6}(0.3)^6(0.7)^{14}
   $$

   $$
   \fbox{0.192}
   $$

   2. Using probability notation, $P(X = x)$, write out all the probabilities you'd need to add up in order to  calculate $P(X < 6)$, and then evaluate it using your calculator. 
      $$
      {20 \choose 5}(0.3)^5(0.7)^{15} + {20 \choose 4}(0.3)^4(0.7)^{16} + \cdots + {20 \choose 0}(0.3)^0(0.7)^{20}
      $$

      $$
      \fbox{0.42}
      $$

   3. For part B, why did you choose the upper bound that you did? If you were using the normal approximation could you chose a different upper bound? Why or why not? 

      *I chose the upper bound of 5 because Part B asked to calculate the probability of $X < 6$.* 

2. You're taking samples of size 10 from a population of 20 marbles and recording the number of blue marbles in each sample. Why isn't this a binomial situation, and why would it be almost binomial if you did the same experiment with a population of 200 marbles? 

   An experiment is binomial if: 

   * There is a fixed number of independent trials
   * Only two outcomes

   At the moment, this experiment follows neither of these requirements; the problem doesn't mention how many trials are there and if the marbles are replaced, and there are several outcomes -- much more than two. If, however, the experiment was performed with a population of 200 marbles, the increased population would allow you to do a proper binomial experiment, since the probability of selecting a blue marble is much lower.

3. A psychiatrist believes that 80% of all Americans who visit doctors have problems of a psychosomatic nature; that is, they have a physical problem with a psychological cause. She decides to randomly select 25 patients to test her theory. 

   1. Is this a binomial experiment? Explain why or why not, using the criteria for a binomial experiment. Since this is a sampling situation, be sure to mention whether it meets the criteria of an almost binomial situation. 

      This is an almost binomial experiment because there is not a set number of trials. However, there is always a set probability of success: 80%. It is also assumed that every trial is independent from each other. Therefore, this is an almost binomial experiment. 

   2. Assuming that the psychiatrist's theory is true, what's the expected value of $X$, the number of the 25 patients who have psychosomatic problems? 
      $$
      \fbox{20}
      $$

   3. Using the exact binomial calculation, find $P(X<15)$ on your calculator and show what you entered. 

      ```
      binomcdf(25,0.8,14)
      ```

   4. Say you gather a sample of 25 and find that $X = 13$. Using an exact binomial calculation and assuming that the psychiatrist's theory is true, what's the probability of finding that in a sample 25, $X=13$. That is, find $P(X=13)$. 

   $$
   {{25} \choose {13}}(0.8)^{13} (0.2)^{12} = \fbox{0.00117}
   $$

4. Explain the term *continuity correction*. Why does it work, and how do you use it? 

   Continuity correction is used to account for the difference between using a non-continuous binomial distribution and a continuous normal distribution to calculate probability. Continuity correction works by adding $\pm 0.5$ to the value calculated from manual calculation. You determine whether to add or subtract based on the sign for the probability.
   
   | Discrete      | Continuous                 |
   | ------------- | -------------------------- |
   | $P(X = n)$    | $P(n - 0.5 < X < n + 0.5)$ |
   | $P(X > n)$    | $P(X > n + 0.5)$           |
   | $P(X \leq n)$ | $P(X < n + 0.5)$           |
   | $P(X < n)$    | $P(X < n - 0.5)$           |
   | $P(X \geq n)$ | $P(X > n - 0.5)$           |

5. Suppose that 10% of the fields in a given agricultural area with about 2500 fields are infested with the sweet potato white fly. One hundred fields in this are are randomly selected and checked for white fly. 

   1. Can this be considered an almost binomial situation? Why or why not? 

      This can be considered an almost binomial situation, as it meets all but one of the criteria for a binomial experiment.

      * A set number of trials -- 100
      * Two results for each trial -- success if there is white fly, failure if there is not
      * Same probability of success for each trial -- 10%
      * Independent trials -- we don't know if the trials are independent since fields in the same area might have white fly whereas fields in another area may not. We also don't know how the fields have been selected. 

   2. Using the exact binomial calculation, find the probability that from 4 to 16 randomly selected fields are infected. 
      $$
      {100 \choose 5}(0.10)^{5}(0.90)^{95} + {100 \choose 6}(0.10)^6(0.90)^{94}+\cdots {100 \choose 15}(0.10)^{15}(0.90)^{85}
      $$

      $$
      \fbox{0.01}
      $$

   3. Using the normal approximation, find the probability that from 4 and 16 randomly selected fields are infected. Be sure to check that $np \geq 10$ and $n(1-p) \geq 10$. Find the probability in two ways: with and without the continuity correction. How do the answers from the two methods compare, and how do you account for the difference? 

      $$
      np = 10
      $$
      
      $$
      n(1-p) = 90
      $$
      
      $$
      P(4 \leq x \leq 16) \ \text{or} \  P(3.5 < x < 16.5)
      $$
      
      $$
      \text{Standard Deviation} = \sqrt{90} = 9.48, \ \text{Mean} = 10
      $$
      
      $$
      \fbox{0.503 (with continuity correction)}
      $$
      
      $$
      \fbox{0.471 (without continuity correction)}
      $$
      
      

   4. Sketch the probability distribution and the area you found when using the normal approximation with the continuity correction. 

      ![image-20210224130543805](/home/svadrut/.config/Typora/typora-user-images/image-20210224130543805.png)

6. A very common dahlia plant with red petals is crossed with another very common plant having streaky petals. The probability that an offspring from this cross has red flowers is .75. Let $X$ be the number of plants with red flowers grown from 100 randomly collected seeds from a very large population ($N > 10000$) of this cross. 

   1. Does the random variable $X$ have a binomial distribution? If not, why not? If so, what are the values of $n$ and $p$? What's the mean, or expected number of plants with red petals, and what's the standards deviation of the distribution? 

      The random variable $X$ does have a binomial distribution. The value of $n$ is 100, and the value of $p$ is 0.75.

      $np = 75$

      $\sqrt{n(1-p)} = 5$ 

   2. Find $P(X > 80)$ using the exact binomial calculation. 

      `1 - binomcdf(100,0.75,80)` = $\fbox{0.0995}$

   3. Is it appropriate to use the normal approximation to the binomial probability for this problem? Why? Support your answer with numbers, and a test. 

      To check if you can use a normal approximation for a binomial distribution, you must check if $np \geq 10$ and if $n(1-p)\geq 10$. 

      $np = 75 \geq 10 \ ✔$

      $n(1-p)= 25 \geq 10 \ ✔$

      Therefore, it is appropriate to use a normal approximation for this problem. 

   4. Using the normal approximation with the continuity correction, calculate the probability that you'll observe more than 80 plants with red petals. Indicate the $X$-values and $z$-scores involved. How does your answer compare with the one you got in part C, and how do you account for the difference? 
      $$
      P(X > 80) = P(X > 80.5)
      $$

      $$
      1-0.8643 = \fbox{0.1357 (with continuity correction)}
      $$

      $$
      1-0.8413 = \fbox{0.1587 (without continuity correction)}
      $$

      

