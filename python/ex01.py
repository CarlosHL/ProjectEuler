
def exercise01():
    sum = 0
    for i in range(0,1000):
        if i%5==0: 
            sum = sum + i
        else: 
            if i%3==0:
                sum = sum + i 
    return sum

print "Solution: ", exercise01()