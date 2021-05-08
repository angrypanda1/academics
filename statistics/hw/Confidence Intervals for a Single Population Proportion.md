# Confidence Intervals for a Single Population Proportion



*NOTE: I will round most of my answers to two digits since that’s what they did in the lesson.*

1.  

   1. Write out the formula for a confidence interval of a population proportion. 
      $$
      \hat{p} \pm (z^* \cdot \sqrt{\frac{\hat{p}(1-\hat{p})}{n}})
      $$

   2. Why is the z-statistic used in a confidence interval for a population proportion? 

      **We use the *z*-statistic since the $\hat{p}$ distribution is basically normal due to the fact that the distribution is assumed to be binomial.** 

   3. What are the conditions a sample needs to meet before you assume it’s binomial and that it approximates a normal distribution? 

      * **Population size is greater than ten times the population size (proportion is successes:outcomes)**

      $$
      n\hat{p} > 10, n(1-\hat{p}) > 10
      $$

2. A nurse in a large university ($N \approx 30,000$) is concerned about students’ eye health. She takes a random sample of 75 students who don’t wear glasses and finds 27 that need glasses. 

   1. What’s the point estimate of $p$, the population proportion?

   $$
   27/75 = \fbox{0.36}
   $$

   2. Is the situation binomial? Also, can the *z*-distribution be used to calculate a confidence interval for the proportion of students who need glasses but don’t wear them? Explain. 

      **The situation is binomial because there are two choices – students wearing and not wearing glasses. The *z*-distribution can be used to calculate a confidence interval for the proportion of students who need glasses and don’t wear them because it is a normal population.** 

   3. What’s the critical $z$-value for a 90% confidence interval for the population proportion? 
      $$
      z^* = 1.645
      $$

   4. What’s the margin of error for a 90% confidence interval for the population proportion? 
      $$
      ME = 1.645 \cdot \sqrt{\frac{0.36(1-0.36)}{75}}\approx 0.09
      $$

   5. Calculate the 90% confidence interval for the population proportion.
      $$
      0.36 \pm 0.09 = \fbox{(0.27,0.45)}
      $$

   6. Using your graphing calculator, find a 95% confidence interval for the proportion of students who need to wear glasses but don’t. 

      ```
      MENU + 6 + 6 + 5
      ---
      Successes: x=27
      n = 75
      Confidence LeveL: 0.95
      ```

      $$
      \fbox{0.25,0.47}
      $$

   7. The nurse wants to be able to estimate, with a 95% confidence interval and a margin of error of 6%, the proportion of students who need to wear glasses but don’t. Find the necessary sample size ($n$) for this estimate. 
      $$
      0.06=1.960 \cdot \sqrt{\frac{0.36 (1-0.36)}{n}}
      $$

      $$
      0.06/1.960 = \sqrt{\frac{0.36 \cdot 0.64}{n}}
      $$

      $$
      (0.06/1.960)^2 = \frac{0.36 \cdot 0.64}{n}
      $$

      $$
      \fbox{n = 245.9 $\approx$ 246}
      $$

   8. The following school year, the nurse wants to construct the same 95% confidence interval for the proportion of students who need glasses but don’t wear them, but she thinks the proportion has changed since last year. Without using the point estimate of the population proportion from the previous year, find the necessary sample size for a 95% confidence interval for the population proportion with a margin of error of 6%. 
      $$
      0.06 = 1.960 \cdot \sqrt{\frac{0.25}{n}}
      $$

      $$
      \frac{0.06}{1.960} = \sqrt{\frac{0.25}{n}}
      $$

      $$
      n = \frac{0.25}{\left[ \frac{0.06}{1.960}\right]}
      $$

      $$
      \fbox{n = 266.8 $\approx$ 267}
      $$

3. A university wants to renovate a building on campus, and wants to know how many of the 20,000 active members of the alumni association would be willing to contribute funds to this project. However, this is the first time alumni donations would be the sole financial source for such a project, and the university doesn't have an estimate of the proportion who would contribute toward the renovation.

   1. If the university wanted to estimate, with a 95% confidence interval and a margin of error of 5%, the proportion of alumni who would be willing to donate to this project, what size sample would they need? (Hint: Do you remember how to estimate the minimum sample size when you don't have an estimate for the population proportion?)
      $$
      0.05 = 1.960 \cdot \sqrt{\frac{0.25}{n}}
      $$

      $$
      n = \frac{0.25}{\left[\frac{0.05}{1.96}\right]^2}
      $$

      $$
      n = 384.2 \approx \fbox{385}
      $$

   2. The university draws a sample of 385 alumni, and 120 of them say they’d be willing to donate to the building renovation. Construct a 95% confidence interval for the proportion of alumni who would donate to the project. 
      $$
      \hat{p} = \frac{120}{385} = 0.3117 = 0.31
      $$

      $$
      ME = 1.960 \cdot \sqrt{\frac{0.31 \cdot 0.69}{385}} \approx 0.05
      $$

      $$
      \fbox{(0.26,0.36)}
      $$

   3. Based on the sample size from part b, can you consider this situation binomial? Can you use a normal approximation here? 
      $$
      n\hat{p} = 120 > 10, n(1-\hat{p}) = 265 > 10
      $$
      Additionally, the population size is more than 10x the sample size, 385. 

   4. The university postpones plans for the building renovations until the following year, when researchers take another sample of 385 alumni. This time, 262 alumni say they'd contribute to the project. Construct a 95% confidence interval for the proportion of alumni who would make donations. 
      $$
      \hat{p} = \frac{262}{385} = 0.6805 \approx 0.05
      $$

      $$
      \fbox{(0.63,0.73)}
      $$

   5. Use your graphing calculator to calculate a 99% confidence interval for the proportion of alumni who would donate to the building renovations (use $n = 385$ and $x = 262$). (Show all work, functions, and inputs on your calculator too.)

      ```
      MENU + 6 + 6 + 5
      x: 262
      n: 385
      confidence level: 0.99
      ```

      $$
      \fbox{(0.62,0.74)}
      $$

      

   