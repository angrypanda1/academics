# Flowchart
```flowchart
st=>start
e=>end: End
op1=>operation: My Operation
op2=>operation: Stuff|current
sub1=>subroutine: My Subroutine|invalid
cond=>condition: Is the input an actual number?
op1=>operation: Return error
op2=>operation: Store number
op3=>operation: Return error
c4=>condition: Is an operator provided?
c5=>condition: Is the operator valid?
st->cond
cond(no)->op1
cond(yes, right)->op2
op2->c4
c4(yes, right)->c5
c4(no)->op3
```
