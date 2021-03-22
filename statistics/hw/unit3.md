# Unit 3

## 3.2

### Textbook Reading

* To quantify the correlation between two types of data, we use something called the correlation coefficient, denoted by $r$. We can calculate $r$ with this equation:

$$
r = \frac{S_{xy}}{S_xS_y}
$$

$S_x$ and $S_y$ are the standard deviations of the variables $x$ and $y$, which can be found with this equation:
$$
\sigma = \sqrt{\frac{\Sigma(x_i - \mu)^2}{N}}
$$
To find $S_{xy}$, or the covariance between $x$ and $y$, you use the equation
$$
S_{xy} = \frac{\Sigma (x_i - \bar{x})(y_i - \bar{y})}{n-1}
$$
Here's what you need to know about $r$: 

* If $r=1,-1$ all the points are exactly on a straight line
* If $r$ is negative it's a negative correlation, and vice versa
* If $r=0$, then there's no correlation at all 

## 3.2.1

* Residuals are the difference between the observed value and predicted value. In an equation, it can be found with 

$$
y - \hat{y}
$$

* Find the least squares regression line with the equation

$$
\hat{y} = b_0 + b_1 x
$$

Where $\hat{y}$ is the predicted value of $y$ , $b_0$ is the point at which the line crosses the $y$-axis, and $b_1$ is the slope of the regression line. 

