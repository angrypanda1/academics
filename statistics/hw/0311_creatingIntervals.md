# Creating Intervals

1. Define confidence interval and confidence level. 

   The confidence interval is a range of values that is likely to include a population value with a certain degree of confidence. The confidence level is how confident one is that a statistical parameter falls in the confidence interval. 

2. What is a critical z-value, and how is it related to the confidence level? Describe how you would look up the critical z-value for a 72% confidence interval on a normal curve table. What is the critical z-value for a 72% confidence interval? 

   The critical z-value measures the number of standard errors to be added and subtracted in order to achieve the confidence level. For a 72% confidence interval, I would subtract 72 from 100 to find the $\alpha$ level, convert the percent to a decimal, divide the answer by 2, subtract this from 1, and look up this area in the z-table. Therefore, for a 72% confidence interval:
   $$
   100 - 72 = 28 \% \Rightarrow 0.28
   $$

   $$
   0.28/2 = 0.14
   $$

   $$
   1-0.14 = \fbox{0.86}
   $$

   

   Looking up the area in the z-score table, I see that the probability is 0.8051

3. Fill in the table below. 

   | Confidence Level | Critical z-value(z*) |
   | :--------------: | :------------------: |
   |        90        |        1.645         |
   |        95        |         1.96         |
   |        99        |        2.576         |

4. What is the formula for a confidence interval? 

   1. With words 

      Multiply the confidence level value by the quotient of the sample standard deviation and sample size, then add the sample mean. 

   2. Without words
      $$
      CI = \bar{x} + z \frac{s}{\sqrt{n}}
      $$

5. Define *unbiased estimator*. Why are unbiased estimators useful? 

   An unbiased estimator is an accurate statistic that's used to approximate a population parameter. It is useful because it helps one determine if the way the population was selected was biased or not. 

6. The TreeDropp'd Fruit Company wants to sell its apples overseas in attractive pink and yellow gift boxes. To design the boxes, the company needs to estimate the average diameter of their apples. A random sample of 50 apples has a mean of 4.1 inches. Using previous research, you assume a population standard deviation $\sigma$ of .4 inches. (As you continue to study statistics you will look at how to estimate $\sigma$, which is what researchers do in the real world. For now, assume you know it.)

   1. What is the point estimate in this scenario? Is it an unbiased estimator?  
      $$
      E(\bar{X}) = \frac{\sum^{n}_{i=1} E(X_i)}{n}
      $$
      Assuming that each observation follows a normal distribution, 
      $$
      E(\bar{X}) = \frac{1}{n}n\mu = \mu
      $$
      The best estimator is the sample mean, and it is an unbiased estimator. 

   2. What is the critical z-value for a 95% interval? 
      $$
      \alpha = 1- 0.95 = 0.05
      $$

      $$
      0.5/2 = 0.025
      $$

      $$
      z_{a/2} = \fbox{1.96}
      $$

   3. What is the margin of error for a 95% interval in this scenario? Show your work. 
      $$
      ME = 1.96 \frac{0.4}{\sqrt{50}} = 0.1109
      $$

      $$
      \fbox{(3.989,4.211)}
      $$

   4. What is the 95% confidence interval for this scenario? Show your work. (see above)

   5. If you wanted to construct a 99% confidence interval with a margin of error of 1% of the point estimate, what is the minimum number of apples you will need in your sample? 
      $$
      0.41 = 2.576 \left[ \frac{0.4}{\sqrt{x}} \right]
      $$

      $$
      x = \fbox{6.316}
      $$

7. The Ground Nugget Potato Company wants to sell its potatoes overseas in brown octagonal gift boxes. To create the design and make sure the boxes have the proper thickness, researchers need to estimate the average weight of the company's potatoes. A random sample of 100 potatoes has a mean of 700 grams. Using the previous research, you assume a population standard deviation $\sigma$ of 0.89 grams. 

   1. Create a 95% confidence interval for the mean weight of the potatoes. 

      The critical z-value for a 95% confidence interval is 1.96. To find the confidence interval, 
      $$
      ME = 1.96 \left[ \frac{0.89}{10} \right] = 0.1744
      $$

      $$
      \fbox{(699.83,700.17)}
      $$

   2. 

   2. Give the minimum sample size for creating a 95% confidence interval with a margin of error of 0.5 grams. 
      $$
      1.96 \left[ \frac{0.89}{\sqrt{x}} \right] = 0.5
      $$

      $$
      x = \fbox{13}
      $$

   3. For part B, why could the sample size be so much smaller than the sample size in part 6E. 

      The sample size could be much smaller than the sample size in part 6E because the confidence level is smaller, allowing for you to have a smaller confidence interval for the values, since you are not as confident that the values will be in the confidence interval. 

